package com.jbj.service.impl;

import com.jbj.bean.Photo;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
public class PhotoServiceImpl implements PhotoService {
	@Autowired
	private  PhotoMapper photoMapper;

	public int insert(Photo photo) {
		int a = photoMapper.savePhoto(photo);
		if(a > 0){
			return a;
		}else{
			return -1;
		}
	}

	//多个条件查询。传递要查询的条件作为参数，然后用对象去查询。
	public int getPhoto(Integer id,Date date) {
		Photo photo=new Photo();
		photo.setPbId(id);
		photo.setpTime(date);

		int countPhoto=photoMapper.selectPhoto(photo);
		if(countPhoto > 0){
			return countPhoto;
		}else{
			return -1;
		}
	}
	//查询类型
	public Object getPhotoType() {
		List<String> types=photoMapper.queryPhotoType();
		if(types.size()>0){
			return types;
		}else{
			return "数据库中没有照片类型";
		}
	}

	public List<Map<String, Object>> getPhotoJilu(Date date) {
		Photo photo=new Photo();
		photo.setpTime(date);
		List<Map<String, Object>> photos = photoMapper.selectPhotoJilu(photo);
		return photos;
	}

	
}
