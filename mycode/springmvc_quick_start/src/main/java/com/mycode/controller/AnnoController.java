package com.mycode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 常用的注解
 */
@Controller
@RequestMapping(path = "/anno")
@SessionAttributes(value = {"mgs"})
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("被执行了。。。");
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("被执行了。。。");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name ="sid") String id){
        System.out.println("被执行了。。。");
        System.out.println(id);
        return "success";
    }

    /**
     * CookieValue注解
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("被执行了。。。");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * SessionAttributes注解
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("SessionAttributes。。。");
        //底层会存入request域对象中
        model.addAttribute("msg", "haha");
        return "success";
    }

    /**
     * 从Session域取值
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap model){
        System.out.println("SessionAttributes。。。");
        //底层会存入request域对象中
        String ms = (String) model.get("msg");
        System.out.println(ms);
        return "success";
    }
}
