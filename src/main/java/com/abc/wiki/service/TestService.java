package com.abc.wiki.service;

import com.abc.wiki.domain.Test;
import com.abc.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

//    @Autowired
    @Resource()
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
