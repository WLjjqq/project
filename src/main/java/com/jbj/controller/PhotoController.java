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
@RequestMapping(value="/testFileUpload",method = RequestMethod.GET)
@ResponseBody
public int testFileUpload(@RequestParam("file")
								  MultipartFile file, Photo photo) throws Exception {
	String path="E:/testupload/" +file.getOriginalFilename();
	System.out.println(path);
	//上传
	file.transferTo(new File(path));
	int a=photoService.insert(photo);
	return a;
}
@RequestMapping(value = "/count/{id}/{time}",method = RequestMethod.GET)
@ResponseBody
public Msg getPhoto(@PathVariable("id") Integer id,@PathVariable("time") Date time){
	int countPhot=photoService.getPhoto(id,time);
	return Msg.success().add("count",countPhot);
}
}
