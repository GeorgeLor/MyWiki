package com.abc.wiki.controller;

import com.abc.wiki.domain.Demo;
import com.abc.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// @RestController 用于返回字符串
// @Controller 用于返回页面
//@Controller

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;


//    @GetMapping("/demo/list")
    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
