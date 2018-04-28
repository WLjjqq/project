package com.jbj.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ListOfMapper {
    /**
     * 补拍列表 +1
     * @param lId
     * @return
     */
    int updateListOf(@Param("lId") Integer lId);

    /**
     * 查询列表
     * @return
     */
    List<Map<String,Object>> selectListTypes();

    /**
     * 补拍完成。补拍列表为0
     * @return
     */
    int updateListAs0(@Param("lId") Integer lId);
}
