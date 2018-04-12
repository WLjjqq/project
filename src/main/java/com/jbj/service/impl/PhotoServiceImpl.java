package com.jbj.service.impl;

import com.jbj.bean.Photo;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoServiceImpl implements PhotoService {
	@Autowired
	private  PhotoMapper photoMapper;

	public void insert(Photo photo) {

		photoMapper.savePhoto(photo);
	}
}
