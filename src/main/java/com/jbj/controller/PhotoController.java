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
import java.util.ArrayList;
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
	 * 查询上传记录
	 * @return
	 */
	@RequestMapping(value = "/jilu",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhoto(){
		List<Map<String,Object>> list=photoService.getPhotoJilu();
		if(list != null){
			return Msg.success().add("photos",list);
		}else {
			return Msg.fail().add("mession", "今天没有上传照片");
		}
}

	/**
	 * 查询上传记录的统计
	 * @return
	 */
	@RequestMapping(value = "/photoCount",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotCount(){
		List<Map<String,Object>> list=photoService.getPhotoCount();
		if(list.size()==0){
			return Msg.fail().add("mession","今天没有上传图片");
		}else {
			return Msg.success().add("photoCount",list);
		}
	}

	/**
	 * 查询照片类型
	 */
	@RequestMapping(value = "/photoTypes",method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotoType(){
		Object photoType = photoService.getPhotoType();
		if(photoType instanceof String){
			return Msg.fail().add("mession","对不起，数据库中还没有照片类型");
		}else {
			return Msg.success().add("photoType",photoType);
		}
	}

	/**
	 * 测试DTO的使用。
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/photoTest/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotoTest(@PathVariable("id") Integer id){
		if(! "".equals(id)){
			PhotoDto photoDto = photoService.getPhotoTest(id);
			if(photoDto == null){
				return Msg.fail().add("mession", "对不起，数据库中没有这张照片");
			}else {
				return Msg.success().add("photoTest", photoDto);
			}
		}else {
			return Msg.fail().add("mession","id不能为空");
		}
	}

	/**
	 * 根据id查询出这张图片所有的信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/photoById/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getPhotoById(@PathVariable("id") Integer id){
		if(! "".equals(id)){
			Photo photo = photoService.getPhoto(id);
			if (photo == null) {
				return Msg.fail().add("mession", "对不起，数据库中没有这张照片");
			}
			return Msg.success().add("photo", photo);
		}else {
			return Msg.fail().add("mession","id不能为空");
		}
	}

	/**
	 * 保存图片
	 * @param photo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/savePhoto",method = RequestMethod.GET)
	@ResponseBody
	public Msg savePhoto(Photo photo) throws Exception {
		if(!"".equals(photo.getpType()) && !(photo.getpCity() ==null)
				&& !"".equals(photo.getpCity()) && !(photo.getpCity() ==null)
				){
			int a=photoService.insert(photo);
			if(a>0){
				return Msg.success().add("success", "保存成功");
			}else{
				return Msg.fail().add("fail", "保存不成功");
			}
		}else {
			return Msg.fail().add("mession","请选择照片类型");
		}
	}

	/**
	 * 批量删除。传递的是一个String。然后去除掉“-”，转换成Integer。放到List中。
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deletePhoto/{ids}", method = RequestMethod.GET)
	@ResponseBody
	public Msg deletePhotos(@PathVariable("ids") String ids) throws Exception{
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");
			for(String string:str_ids){
				del_ids.add(Integer.parseInt(string));
			}
			if(del_ids.size()==0){
				return Msg.fail().add("mession","请选择要删除的数据");
			}
		int i = photoService.deletePhotos(del_ids);
			if(i>0){
				return Msg.success().add("mession", "删除成功");
			}else {
				return Msg.fail().add("mession","删除失败");
			}
	}
}
