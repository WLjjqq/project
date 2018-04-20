package com.jbj.mapper;

import com.jbj.bean.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {
 /**
  * 根据用户名查询数据库
  * @param userName
  * @return
  */
 User check(String userName);
}
