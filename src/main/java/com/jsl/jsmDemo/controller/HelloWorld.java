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
@EnableAutoConfiguration
public class HelloWorld {


   private final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    @Autowired
    private TestInterFace testInterFace;
    @Autowired
    private UserServiceImp userServiceImp;

    @Value("${xyx.name}")
    private String myName;

    @RequestMapping("/findAll")
    public void findAll(){
        List<UserInfo> userInfos = userServiceImp.selectAll();
        log.info("用户的数量"+userInfos.size()+"");
    }

    @RequestMapping(value = "/find")
    public void findUserInfoByName(@RequestParam("name") String name){
        UserInfo userInfo = userServiceImp.findyUserInfoByName(name);
        log.info("用户的密码为"+userInfo.getPassWord());
    }

    @RequestMapping(value = "/insert")
    public void insert(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("高圆圆");
        userInfo.setPassWord("456");
        userServiceImp.insert(userInfo);
    }

    //日志打印
    @RequestMapping("/log")
    public void log(){
        log.info("wasd-----------------======================");
    }

    @RequestMapping("/num")
    @ResponseBody
    public int home() {
        int i = testInterFace.testInterFace();
        log.info("wasd-----------------======================");
        log.error("error");
        return i;
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public UserInfo getUser(){
        return testInterFace.testUser();
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        System.out.println(myName);
        return myName+"hello welCome";
    }

    @RequestMapping(value = "/home/page")
    @ResponseBody
    public ModelAndView firstJsp(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","贾帅");
        modelAndView.setViewName("index");
        return modelAndView;
    }

//    @RequestMapping(value="/game")
//    public String home(){
//        System.out.println("redirect to home page!");
//        return "index";
//    }

}
