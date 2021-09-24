package com.abc.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 用于返回字符串
// @Controller 用于返回页面
//@Controller

@RestController
public class TestController {

    // TEST为默认配置值
//    @Value("${test.hello:TEST}")
    @Value("${test.hello}")
    private String testHello;


    /*
    *
    * 常用的四种http请求
    * GET, POST, PUT, DELELE
    * /传统的http请求  /user?id=1
    * /RESTFUL风格的http请求  /user/1
    *
    *
    * */

//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @GetMapping
//    @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)

    @GetMapping("/hello")
    public String hello(){
        return "Hello World " + testHello ;

    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post," + name;
    }
}
