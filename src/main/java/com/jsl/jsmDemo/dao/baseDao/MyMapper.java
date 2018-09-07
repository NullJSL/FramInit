package com.jsl.jsmDemo.dao.baseDao;

import com.jsl.jsmDemo.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * Filename:    com.jsl.jsmDemo.dao.baseDao
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 16:19
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
public interface MyMapper<UserInfo> extends MySqlMapper<UserInfo> , Mapper<UserInfo> {

    List<UserInfo> findAll();

}
