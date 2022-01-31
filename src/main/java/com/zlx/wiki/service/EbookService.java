package com.zlx.wiki.service;

import com.zlx.wiki.dao.EbookMapper;
import com.zlx.wiki.entity.Ebook;
import com.zlx.wiki.entity.EbookExample;
import com.zlx.wiki.req.EbookReq;
import com.zlx.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq ebookReq){
        // 查询操作
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        //拿到实体列表
        List<Ebook> list =  ebookMapper.selectByExample(ebookExample);
        //新建resp类列表
        List<EbookResp> ebookRespList = new ArrayList<>();
        //实体属性复制
        for(Ebook entity : list){
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(entity,ebookResp);
            ebookRespList.add(ebookResp);
        }

        return ebookRespList;

    }
}
