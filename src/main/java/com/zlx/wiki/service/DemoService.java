package com.zlx.wiki.service;

import com.zlx.wiki.dao.DemoMapper;
import com.zlx.wiki.entity.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
