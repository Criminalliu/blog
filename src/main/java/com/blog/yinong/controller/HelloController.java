package com.blog.yinong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "denglu";
//        System.out.println("nihao");st
    }
}
