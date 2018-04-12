package com.jbj.mapper;

import com.jbj.bean.User;

import java.util.Map;


public interface UserMapper {
/**
 * 根据用户名查询数据库
 *
 *
 */
public User check(Map<String, String> map);
}
