package com.jbj.service.impl;

import com.jbj.bean.User;
import com.jbj.mapper.UserMapper;
import com.jbj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	/**
	 * 从数据库中查找用户
	 */
public Object check(String name,String password){
	User user = userMapper.check(name);
	if(user != null){
		if(password.equals(user.getPassword())){
			return user;
		}else{
			//密码错误
			return "error,-1，密码错误";
		}
	}else{
		//用户名不存在
		System.out.println("用户名不存在");
		return "error,-2,用户名不存在";
	}
}
}
