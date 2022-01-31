package com.zlx.wiki.controller;

import com.zlx.wiki.entity.Demo;
import com.zlx.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController // 返回字符串或json数据
@RequestMapping("/demo")

public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }

}
