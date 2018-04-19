package com.jbj.controller;


import com.jbj.bean.User;
import com.jbj.service.UserService;
import com.jbj.utils.Msg;
import jdk.nashorn.internal.runtime.GlobalConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
// @SessionAttributes(value = {"name","password"})
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	@ResponseBody
	//知识点1：@RequestParam的作用。URL中必须要写上，不写的话默认为空。可以用defaultValue属性设置默认值。
	//知识点2：!"".equals(name)  String.equals(对象，属性什么的)。这样写是为了防止空指针异常。
	//知识点3：mapper中。parameterType="java.lang.String" 是where后面传入的参数。String和User是和User对象中的属性值（也就是实体类中的属性）有关。map是根据写的键key有关。
	// resultMap，resultType  都是返回的类型。

    public Object Login(HttpServletResponse response, @RequestParam(value = "name") String name, @RequestParam("password")String password) {
		System.out.println("".equals(name));
		if(response.getStatus() == 200){
			if(!"".equals(name) && !"".equals(password)){
               Object user= userService.check(name,password);
			    return user;
			}else{
				//用户名或密码不能为空
				return " -3，用户名和密码不能为空";
			}
		}else{
			return "error,请求失败";
		}
	}
/*
登录的时候。给url加上一个唯一标识。设备Id+sessionId.
 */
	//退出登錄
	@RequestMapping(value = "/exitLogin",method = RequestMethod.GET)
	@ResponseBody
	public String exitLogin(String name,String password) {
	    //清除当前用户所有信息
       // session.removeAttribute("name");
		return "success";
	}
}
