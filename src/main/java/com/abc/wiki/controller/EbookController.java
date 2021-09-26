package com.abc.wiki.controller;

import com.abc.wiki.domain.Ebook;
import com.abc.wiki.resp.CommonResp;
import com.abc.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// @RestController 用于返回字符串
// @Controller 用于返回页面
//@Controller

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;


//    @GetMapping("/ebook/list")
    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }
}
