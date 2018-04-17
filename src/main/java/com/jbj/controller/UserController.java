package com.jbj.controller;


import com.jbj.bean.User;
import com.jbj.service.UserService;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	@ResponseBody
	public Msg Login(String name,String password,Map<String,Object> map) {
		//从数据库中查询出user。
		User user=userService.check(name,password,map);
		if(user != null){
			return Msg.success().add("user",user);
		}else{
			return Msg.loginFailed();
		}
	}

}
