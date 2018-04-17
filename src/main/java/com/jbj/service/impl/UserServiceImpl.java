package com.jbj.service.impl;

import com.jbj.bean.User;
import com.jbj.mapper.UserMapper;
import com.jbj.service.UserService;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {
			//map用来收集页面上的用户名和密码，作为参数从数据库中查询相应的数据。

	@Autowired
	UserMapper userMapper;
/**
 * 从数据库中查找用户
 */
public User check(String name,String password,Map<String, Object> map){

	map.put("name", name);
	map.put("password", password);
	User user = userMapper.check(map);

	if (user != null) {
		return user;
	} else if (name != null) {
		return null;
	}
	return null;
}
}
