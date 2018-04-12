package com.jbj.controller;

import com.jbj.bean.Role;
import com.jbj.bean.User;
import com.jbj.service.UserService;
import com.jbj.service.impl.UserServiceImpl;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;


	@RequestMapping("/welcome")
	@ResponseBody
	public Msg Login(String name,String password) {
		Map<String, String> map = new HashMap<String, String>();
		//因为map作为后面的Mapper中的参数。where后#{中的值就是map的key}
		//where u.username=#{name}
		map.put("name", name);
		map.put("password", password);
		//从数据库中查询出user。
		User user = userServiceImpl.check(map);
		System.out.println("数据库中的user：" + user);

		if (user != null) {
			return Msg.success().add("user", user);
		} else if (name != null) {
			return Msg.loginFailed();
		}
		return null;
	}


	//上传图片

}
