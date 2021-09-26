package com.abc.wiki.service;

import com.abc.wiki.domain.Ebook;
import com.abc.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

//    @Autowired
    @Resource()
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
