package com.zlx.wiki.controller;

import com.zlx.wiki.req.EbookReq;
import com.zlx.wiki.resp.CommonResp;
import com.zlx.wiki.entity.Ebook;
import com.zlx.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController // 返回字符串或json数据
@RequestMapping("/ebook")

public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp<List<Ebook>> list(EbookReq ebookReq){
        CommonResp<List<Ebook>> commonResp = new CommonResp<>();
        List<Ebook> list = ebookService.list(ebookReq);

        if (!list.isEmpty()) {
            commonResp.setContent(list);
            commonResp.setMessage("返回数据成功");
        }else {
            commonResp.setMessage("没有查找到数据");
        }

        return commonResp;

    }

}
