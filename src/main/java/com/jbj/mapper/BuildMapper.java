package com.jbj.mapper;

import com.jbj.bean.Build;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BuildMapper {
   /**
    * 在buildinfo表中查询城市
    * @return
    */

   List<String> queryCity();
   /**
    * 根据城市查询出这个城市所有的楼盘
    */
   List<Map<String,Object>> selectBuildByCity(@Param("city") String city);

   /**
    * 保存楼盘的信息
    * @param build
    * @return
    */
   int saveBuild(Build build);
}
