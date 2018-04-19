package com.jbj.service.impl;

import com.jbj.bean.Version;
import com.jbj.mapper.VersionMapper;
import com.jbj.service.VersionService;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class VersionServiceImpl implements VersionService {
    @Autowired
    private VersionMapper versionMapper;

    public Object queryVersion(@RequestParam("versionNumber") String versionNumber) {
        Version version=versionMapper.getVersion();
        if(versionNumber.equals(version.getVersionNew())){
            //是最新版本
            return "已经是最新的版本了";
        }else {
            //不是最新版本。
            return version;
        }
    }
}
