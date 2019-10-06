package com.relaxam.lanhai.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.relaxam.lanhai.bean.SpuInfo;
import com.relaxam.lanhai.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/5 14:11
 */
@Controller
public class SpuManageController {
    @Reference
    private ManageService manageService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<SpuInfo> supInfoList(String catalog3Id){
        SpuInfo spuInfo = new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);
        List<SpuInfo> spuInfoList = manageService.getSpuInfoList(spuInfo);
        return spuInfoList;
    }


}
