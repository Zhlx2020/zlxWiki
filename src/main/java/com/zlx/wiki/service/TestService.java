package com.zlx.wiki.service;

import com.zlx.wiki.dao.TestMapper;
import com.zlx.wiki.entity.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    //想用testMapper的api 就先装载他
    @Resource
    private TestMapper testMapper;

    public List<Test> getUser(){
        return testMapper.list();
    }
}
