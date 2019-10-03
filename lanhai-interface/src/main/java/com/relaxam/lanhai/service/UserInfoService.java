package com.relaxam.lanhai.service;

import com.relaxam.lanhai.bean.UserAddress;
import com.relaxam.lanhai.bean.UserInfo;
import com.relaxam.lanhai.transfer.UserInfoDTO;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/2 14:33
 */
public interface UserInfoService {

    List<UserInfo> findAll();

    boolean insertUser(UserInfoDTO userInfoDTO);

    boolean deleteUser(UserInfoDTO userInfoDTO);

    boolean updateUserInfo(UserInfoDTO userInfoDTO);

    List<UserAddress> getUserAddressList(String userId);

}
