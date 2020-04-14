package com.mycode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器Contorller，用来接收请求
@Controller
@RequestMapping(path = "/user")
public class HelloContorller {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello String MVC");
        return "success";
    }
    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("测试requestMapping注解");
        return "success";
    }
}
