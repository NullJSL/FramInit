package com.jsl.jsmDemo.service;

import com.jsl.jsmDemo.bean.UserInfo;

import java.util.List;

/**
 * Filename:    com.jsl.jsmDemo.service
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
public interface UserService {

    public UserInfo findyUserInfoByName(String name);

    public int insert(UserInfo userInfo);

    List<UserInfo> selectAll();
}
