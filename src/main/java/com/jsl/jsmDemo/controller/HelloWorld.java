package com.jsl.jsmDemo.controller;

import com.jsl.jsmDemo.bean.UserInfo;
import com.jsl.jsmDemo.service.Impl.UserServiceImp;
import com.jsl.jsmDemo.service.TestInterFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * Filename:    com.jsl.jsmDemo.controller
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 10:37
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
@Controller
@RequestMapping(value = "/api")
public class HelloWorld {


    private final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    @Resource
    private TestInterFace testInterFace;
    @Resource
    private UserServiceImp userServiceImp;




    @RequestMapping(value="/")
    public String home(){
        System.out.println("redirect to home page!");
        return "hello";
    }

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/findAll")
    public void findAll(){
        List<UserInfo> userInfos = userServiceImp.selectAll();
        log.info("总人数为："+userInfos.size()+"");
        System.out.println("总人数：");
    }

}
