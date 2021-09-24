package com.abc.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @RestController 用于返回字符串
// @Controller 用于返回页面
//@Controller

@RestController
public class TestController {

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

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";

    }
}
