package com.jbj.service;


import com.jbj.bean.User;

import java.util.Map;

public interface UserService {

	/**
	 * 从数据库中查找用户
	 */
	public User check(Map<String,String> map);
}
