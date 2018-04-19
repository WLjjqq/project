package com.jbj.service;


import com.jbj.bean.Version;

public interface VersionService {
    //得到最新的版本信息。
    Object queryVersion(String versionNumber);
}
