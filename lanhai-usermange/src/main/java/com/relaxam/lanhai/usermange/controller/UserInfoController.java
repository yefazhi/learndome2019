package com.relaxam.lanhai.usermange.controller;

import com.relaxam.lanhai.bean.UserInfo;
import com.relaxam.lanhai.service.UserInfoService;
import com.relaxam.lanhai.transfer.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/2 16:26
 */
@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 关于@ResponseBody的作用，返回json字符串；将数据显示在页面上
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> getAll(){
        return userInfoService.findAll();
    }


    @PostMapping("addUser")
    @ResponseBody
    public boolean addUser(@RequestParam UserInfoDTO userInfoDTO){
        return userInfoService.insertUser(userInfoDTO);
    }

    @PostMapping("deleteUser")
    @ResponseBody
    public boolean deleteUser(@RequestParam UserInfoDTO userInfoDTO){
        return userInfoService.deleteUser(userInfoDTO);
    }

    @PostMapping("updateUserInfo")
    @ResponseBody
    public boolean updateUserInfo(@RequestParam UserInfoDTO userInfoDTO){
        return userInfoService.updateUserInfo(userInfoDTO);
    }

}
