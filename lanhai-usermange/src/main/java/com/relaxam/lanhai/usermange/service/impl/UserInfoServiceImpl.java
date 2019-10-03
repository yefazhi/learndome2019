package com.relaxam.lanhai.usermange.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.relaxam.lanhai.bean.UserAddress;
import com.relaxam.lanhai.bean.UserInfo;
import com.relaxam.lanhai.service.UserInfoService;
import com.relaxam.lanhai.transfer.UserInfoDTO;
import com.relaxam.lanhai.usermange.mapper.UserAddressMapper;
import com.relaxam.lanhai.usermange.mapper.UserInfoMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/2 16:15
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        logger.info("查询所有的用户信息");
        return userInfoMapper.selectAll();
    }

    @Override
    public boolean insertUser(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDTO, userInfo);
        return userInfoMapper.insertSelective(userInfo) > 0 ? true : false;
    }

    @Override
    public boolean deleteUser(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDTO, userInfo);
        return userInfoMapper.delete(userInfo) > 1 ? true : false;
    }

    @Override
    public boolean updateUserInfo(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDTO, userInfo);
        return userInfoMapper.updateByPrimaryKey(userInfo) > 0 ? true : false;
    }


    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> userAddresseList = userAddressMapper.select(userAddress);
        return userAddresseList;
    }
}
