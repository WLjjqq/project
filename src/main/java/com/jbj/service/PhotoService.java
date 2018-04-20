package com.jbj.service;

import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;


import java.util.Date;
import java.util.List;
import java.util.Map;


public interface PhotoService {
	/**
	 * 保存图片
	 * @param photo
	 * @return
	 */
	int insert(Photo photo);

	/**
	 * 根据条件进行查询
	 * @param id
	 * @param date
	 * @return
	 */
	 int getPhoto(Integer id,Date date);

	/**
	 * 查询照片的类型
	 * @return
	 */
	Object getPhotoType();

	 //返回上传记录。
	 List<Map<String, Object>> getPhotoJilu();

	/**
	 * 返回上传记录的统计。
	 * @return
	 */
	List<Map<String,Object>> getPhotoCount();

	/**
	 * 测试DTO的使用
	 * @param id
	 * @return
	 */
	PhotoDto getPhotoTest(Integer id);
}
