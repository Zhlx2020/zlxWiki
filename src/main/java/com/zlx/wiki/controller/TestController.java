package com.zlx.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 返回字符串或json数据
// @Controller 返回 一个 页面 前后端不分离用这个
public class TestController {
    // get post del put
    //@RequestMapping("/hello") // requestmapping 支持所有的请求方式 get也行 post也行
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
