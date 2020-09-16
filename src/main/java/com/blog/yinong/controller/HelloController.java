package com.blog.yinong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
public class HelloController {

    @Autowired
    private yinong yinong;


    @Value("${yinong.name}")
    private String name;


    @RequestMapping("/hello")
    public @ResponseBody
    int hello(){
        return yinong.getAge();
//        System.out.println("nihao");st
    }
}
