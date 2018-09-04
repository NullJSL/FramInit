package com.jsl.jsmDemo.service.Impl;

import com.jsl.jsmDemo.bean.UserInfo;
import com.jsl.jsmDemo.service.TestInterFace;
import org.springframework.stereotype.Service;

/**
 * Filename:    com.jsl.jsmDemo.service.Impl
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 11:37
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
@Service
public class TestInterFaceImpl implements TestInterFace {

    @Override
    public int testInterFace() {
        return 0;
    }

    @Override
    public UserInfo testUser() {
        UserInfo user = new UserInfo();
        return user;
    }
}
