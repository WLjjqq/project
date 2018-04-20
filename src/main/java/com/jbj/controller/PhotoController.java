package com.jbj.controller;

import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;
import com.jbj.service.PhotoService;

import com.jbj.utils.Msg;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "photo")
public class PhotoController {

	@Autowired
	private PhotoService photoService;

//上传并保存
@RequestMapping(value="/testFileUpload")
@ResponseBody
public int testFileUpload(@RequestParam("file")
								  MultipartFile file, Photo photo) throws Exception {
	String path="E:/testupload/" +file.getOriginalFilename();
	System.out.println(path);
	//上传
	file.transferTo(new File(path));
	//photo.setpAddress(path);
	int a=photoService.insert(photo);
	return a;
}

	/**
	 * 多条件查询。
	 * @param id  楼盘id
	 * @param time 时间
	 * @return
	 */
	@RequestMapping(value = "/count",method = RequestMethod.GET)
@ResponseBody
public Msg getPhoto(@RequestParam(value = "id",defaultValue = "2") Integer id,@RequestParam("time") Date time){
	int countPhot=photoService.getPhoto(id,time);
	return Msg.success().add("count",countPhot);
}

	/**
	 * 查询上传记录
	 * @return
	 */
	@RequestMapping(value = "/jilu",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhoto(){
		List<Map<String,Object>> list=photoService.getPhotoJilu();
		return Msg.success().add("photos",list);
}

	/**
	 * 查询上传记录的统计
	 * @return
	 */
	@RequestMapping(value = "/photoCount",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotCount(){
		List<Map<String,Object>> list=photoService.getPhotoCount();
		return Msg.success().add("photoCount",list);
	}

	/**
	 * 查询照片类型
	 */
	@RequestMapping(value = "/photoTypes",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotoType(){
		return Msg.success().add("photoType",photoService.getPhotoType());
	}

	/**
	 * 测试DTO的使用。
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/photoTest/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotoTest(@PathVariable("id") Integer id){
		PhotoDto photoDto = photoService.getPhotoTest(id);
		return Msg.success().add("photoTest", photoDto);
	}
}
