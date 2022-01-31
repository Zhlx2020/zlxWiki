package com.zlx.wiki.service;

import com.zlx.wiki.dao.EbookMapper;
import com.zlx.wiki.entity.Ebook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
