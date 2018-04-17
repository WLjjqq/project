package com.jbj.service;


import com.jbj.bean.User;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface UserService {

	/**
	 * 从数据库中查找用户
	 */
	public User check(String name,String password,Map<String, Object> map);
}
