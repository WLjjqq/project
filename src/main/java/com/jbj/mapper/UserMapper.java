package com.jbj.mapper;

import com.jbj.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface UserMapper {
 /**
  * 根据用户名查询数据库
  * @param userName
  * @return
  */
 User check(@Param("userName") String userName);
}
