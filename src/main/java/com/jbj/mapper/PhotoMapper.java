package com.jbj.mapper;


import com.jbj.bean.Photo;

import java.util.List;
import java.util.Map;

public interface PhotoMapper {
	 int savePhoto(Photo photo);
	 //查询这个楼盘这一天一共多少张图片
	int selectPhoto(Photo photo);

}
