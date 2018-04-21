package com.jbj.service;

import com.jbj.bean.Build;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BuildService {
    /**
     * 城市列表
     * @return
     */
    List<String> getCity();
    /**
     * 根据城市查询出这个城市所有的楼盘
     */
    List<Map<String,Object>> queryBuildByCity(String city);

    /**
     * 保存楼盘
     * @param build
     * @return
     */
    int saveBuild(Build build);
}
