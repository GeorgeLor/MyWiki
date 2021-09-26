package com.abc.wiki.controller;

import com.abc.wiki.req.EbookReq;
import com.abc.wiki.resp.CommonResp;
import com.abc.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
