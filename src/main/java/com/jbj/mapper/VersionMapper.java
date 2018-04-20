package com.jbj.mapper;

import com.jbj.bean.Version;

public interface VersionMapper {
    /**
     * 只需要查询最新的版本号。
     * @return
     */
    Version getVersion();


}
