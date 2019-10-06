package com.relaxam.lanhai.manage.controller;

import org.apache.commons.lang3.StringUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/5 14:19
 */
@RestController
public class FileUploadController {
    private Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Value("${fileServer.url}")
    private String fileUrl;


    @RequestMapping(value = "fileUpload", method = RequestMethod.POST)
    public String upload(@RequestParam("file")MultipartFile file){
        String imgUrl = fileUrl;
        try {
            if(file != null) {
                String configFile = this.getClass().getResource("/tracker.conf").getFile();
                ClientGlobal.init(configFile);

                TrackerClient trackerClient = new TrackerClient();
                TrackerServer trackerServer = trackerClient.getConnection();

                StorageClient storageClient = new StorageClient(trackerServer, null);
                String filename = file.getOriginalFilename();
                String extName = StringUtils.substringAfterLast(filename, ",");
                String[] uploadFile = storageClient.upload_file(file.getBytes(), extName, null);
                for (int i = 0; i < uploadFile.length; i++) {
                    String path = uploadFile[i];
                    imgUrl += "/" + path;
                }
            }
        } catch (IOException e) {
            logger.error("图片上传时IO失败：{}", e);
        } catch (MyException e) {
            logger.error("图片上传时失败，自定义异常：{}", e);
        }
        logger.info("图片上传时的url：{}", imgUrl);
        return imgUrl;
    }


}
