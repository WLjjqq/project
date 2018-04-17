package com.jbj.service.impl;

import com.jbj.bean.Photo;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.sql.Date;
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
		System.out.println("Date转String后的值"+date);

		int a=photoMapper.selectPhoto(photo);
		return a;


	}
}
