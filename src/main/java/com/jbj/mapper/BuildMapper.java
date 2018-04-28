package com.jbj.mapper;

import com.jbj.bean.Build;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BuildMapper {
   /**
    * 在buildinfo表中查询城市
    *
    * @return
    */
   List<String> queryCity();

   /**
    * 根据城市查询出这个城市所有的楼盘
    */
   List<Map<String, Object>> selectBuildByCity(@Param("bCity") String bCity);

   /**
    * 保存楼盘的信息
    * @param build
    * @return
    */
   int saveBuild(Build build);

   /**
    * 查询出楼盘的名字根据城市。如果一样，就不进行保存了。不一样的时候才进行保存。
    * @param bCity
    * @return
    */
   List<String> selectBuildNameByCity(@Param("bCity") String bCity);

   /**
    * 根据楼盘名查询出对应的城市和id。
    * @param bName
    * @return
    */
   List<Map<String, Object>> selectBIdAndBCity(@Param("bName") String bName);

   /**
    * 查询出楼盘信息根据id。
    * @param bId
    * @return
    */
   Build selectBuildById(@Param("bId") Integer bId);
   /**
    * 修改补拍原因
    * @return
    */
   int updateBuildFillType(@Param("lId") Integer lId,@Param("bId") Integer bId);

   /**
    *补拍完成后，修改照片的数量
    */
   int updatePhotos(@Param("bFillPhotos") Integer bFillPhotos,@Param("bId") Integer bId);
}
