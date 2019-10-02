package com.relaxam.lanhai.usermange.service.impl;

import com.relaxam.lanhai.bean.UserInfo;
import com.relaxam.lanhai.service.UserInfoService;
import com.relaxam.lanhai.usermange.mapper.UserInfoMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/2 16:15
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
    private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        logger.info("查询所有的用户信息");
        return userInfoMapper.selectAll();
    }
}
