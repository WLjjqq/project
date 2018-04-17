package com.jbj.mapper;

import com.jbj.bean.User;

import java.util.Map;


public interface UserMapper {
/**
 * 根据用户名查询数据库
 *
 *
 */
 User check(Map<String, Object> map);
}
