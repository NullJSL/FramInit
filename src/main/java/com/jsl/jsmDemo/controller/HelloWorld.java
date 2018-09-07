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
    @EnableAutoConfiguration
public class HelloWorld {


        private final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    @Resource
    private TestInterFace testInterFace;
    @Resource
    private UserServiceImp userServiceImp;

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
