package com.jbj.controller;

import com.jbj.bean.Photo;
import com.jbj.service.PhotoService;

import com.jbj.utils.Msg;
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

//根据id和时间进行统计。
@RequestMapping(value = "/count",method = RequestMethod.GET)
@ResponseBody
public Msg getPhoto(@RequestParam(value = "id",defaultValue = "2") Integer id,@RequestParam("time") Date time){
	int countPhot=photoService.getPhoto(id,time);
	return Msg.success().add("count",countPhot);
}

	//查询上传记录
	@RequestMapping(value = "/jilu",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhoto(@RequestParam("date") Date date){
		List<Map<String,Object>> list=photoService.getPhotoJilu(date);
		return Msg.success().add("photos",list);
}

	//查询照片类型
	@RequestMapping(value = "/photoTypes",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotoType(){
		return Msg.success().add("photoType",photoService.getPhotoType());
	}


}
