package com.jbj.service;

import com.jbj.bean.Photo;


import java.sql.Date;
import java.util.List;
import java.util.Map;


public interface PhotoService {
	 int insert(Photo photo);
		//根据条件进行查询
	 int getPhoto(Integer id,Date date);
	 //查询照片的类型
	 Object getPhotoType();
	 //返回上传记录。
	 List<Map<String, Object>> getPhotoJilu(Date date);
}
