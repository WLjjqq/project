package com.jbj.mapper;

import java.util.List;

public interface BuildMapper {
   /**
    * 在buildinfo表中查询城市
    * @return
    */
   List<String> queryCity();
}
