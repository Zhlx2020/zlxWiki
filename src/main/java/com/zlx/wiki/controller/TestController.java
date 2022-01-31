package com.zlx.wiki.controller;

import com.zlx.wiki.entity.Test;
import com.zlx.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController // 返回字符串或json数据
// @Controller 返回 一个 页面 前后端不分离用这个
@RequestMapping("/test")
public class TestController {

//    @RequestMapping("/hello") // requestmapping 支持所有的请求方式 get也行 post也行
    @Resource
    private TestService testService;

    @GetMapping("/list")
    public List<Test> List(){
        return testService.getUser();
    }


}
