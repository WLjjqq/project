package com.jbj.service;

import com.jbj.bean.Build;
import com.jbj.bean.Photo;
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

    /**
     * 根据楼盘名来查询id，所在的城市。
     * @param bName
     * @return
     */
    List<Map<String,Object>> queryBIdAndBCityByBName(String bName);

    /**
     * 楼盘补拍查询出列表
     */
    List<Map<String,Object>> FillPhotoType();
    /**
     * 楼盘修改补拍原因，补拍列表+1
     */
    int updateBuildFillType(Integer lId,Integer bId);

    /**
     * 开始补拍。修改补拍的数量
     * @return
     */
    int updateFillPhotos(Integer bId, Photo photo);

}
