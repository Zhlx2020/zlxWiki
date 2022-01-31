package com.zlx.wiki.service;

import com.zlx.wiki.dao.EbookMapper;
import com.zlx.wiki.entity.Ebook;
import com.zlx.wiki.entity.EbookExample;
import com.zlx.wiki.req.EbookReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(EbookReq ebookReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
