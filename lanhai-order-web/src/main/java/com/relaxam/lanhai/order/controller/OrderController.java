package com.relaxam.lanhai.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.relaxam.lanhai.bean.UserAddress;
import com.relaxam.lanhai.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/2 17:57
 */
@Controller
public class OrderController {

    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> getUserAddress(String userId){
        List<UserAddress> userAddresses = userInfoService.getUserAddressList(userId);
        return userAddresses;
    }

}
