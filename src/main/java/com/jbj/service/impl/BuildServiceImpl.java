package com.jbj.service.impl;

import com.jbj.bean.Build;
import com.jbj.mapper.BuildMapper;
import com.jbj.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildServiceImpl implements BuildService {
    @Autowired
    BuildMapper buildMapper;
    public List<String> getCity() {
        List<String> citys=buildMapper.queryCity();
        return citys;
    }
}
