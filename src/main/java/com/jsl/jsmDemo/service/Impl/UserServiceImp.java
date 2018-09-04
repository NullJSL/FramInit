package com.jsl.jsmDemo.service.Impl;

import com.jsl.jsmDemo.bean.UserInfo;
import com.jsl.jsmDemo.dao.baseDao.UserDao;
import com.jsl.jsmDemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Filename:    com.jsl.jsmDemo.service.Impl
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 15:26
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserInfo findyUserInfoByName(String name) {
        return  userDao.findByName(name);
    }

    @Override
    public int insert(UserInfo userInfo) {
        return userDao.insert(userInfo);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userDao.selectAll();
    }
}
