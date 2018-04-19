package com.jbj.service;


import com.jbj.bean.User;

public interface UserService {

	/**
	 * 从数据库中查找用户
	 */
	Object check(String name,String password);
}
