package com.jsl.jsmDemo.bean;

import javax.persistence.*;

/**
 * Filename:    com.jsl.jsmDemo.bean
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 11:36
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
@Table(name = "userinfo")
public class UserInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}