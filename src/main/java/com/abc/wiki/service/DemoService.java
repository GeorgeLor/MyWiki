package com.abc.wiki.service;

import com.abc.wiki.domain.Demo;
import com.abc.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

//    @Autowired
    @Resource()
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
