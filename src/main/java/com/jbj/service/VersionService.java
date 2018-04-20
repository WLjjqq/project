package com.jbj.service;


import com.jbj.bean.Version;

public interface VersionService {
    /**
     * 得到最新的版本信息。
     * @param versionNumber
     * @return
     */
    Object queryVersion(String versionNumber);
}
