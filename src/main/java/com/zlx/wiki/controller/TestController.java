package com.zlx.wiki.controller;

import com.zlx.wiki.entity.Test;
import com.zlx.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController // 返回字符串或json数据
// @Controller 返回 一个 页面 前后端不分离用这个
public class TestController {

    /**
     * 常用的 get post del put
     * 普通请求 /hello?id=10
     * restful /hello/10
     */
//    @RequestMapping("/hello") // requestmapping 支持所有的请求方式 get也行 post也行
    @Resource
    private TestService testService;

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "this is post test helle," + name;
    }

    @GetMapping("/list")
    public List<Test> List(){
        return testService.getUser();
    }
}
