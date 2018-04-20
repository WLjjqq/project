package com.jbj.service.impl;

import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PhotoServiceImpl implements PhotoService {
	@Autowired
	private  PhotoMapper photoMapper;

	/**
	 * 保存图片
	 * @param photo
	 * @return
	 */
	public int insert(Photo photo) {
		int a = photoMapper.savePhoto(photo);
		if(a > 0){
			return a;
		}else{
			return -1;
		}
	}

	/**
	 * 多个条件查询。传递要查询的条件作为参数，然后用对象去查询。
	 * @param id
	 * @param date
	 * @return
	 */
	public int getPhoto(Integer id,Date date) {
		Photo photo=new Photo();
		photo.setPbId(id);
		photo.setpTime(date);

		int countPhoto=photoMapper.getPhoto(photo);
		if(countPhoto > 0){
			return countPhoto;
		}else{
			return -1;
		}
	}

	/**
	 * 查询照片类型
	 * @return
	 */
	public Object getPhotoType() {
		List<String> types=photoMapper.queryPhotoType();
		if(types.size()>0){
			return types;
		}else{
			return "数据库中没有照片类型";
		}
	}

	/**
	 * 查询上传记录，查询出的数据用Map来接收。然后保存。和DTO的思想一样。
	 * @return
	 */
	public List<Map<String, Object>> getPhotoJilu() {
		List<Map<String, Object>> photos = photoMapper.selectPhotoJilu();
		return photos;
	}

	/**
	 * 上传记录的统计
	 * @return
	 */
	public List<Map<String,Object>> getPhotoCount() {
		List<Map<String,Object>> maps = photoMapper.selectPhotoCount();
		return maps;
	}

	/**
	 * 测试DTO的使用。用PhotoDto类来接收查询的Photo类的数据。
	 * @param id
	 * @return
	 */
	public PhotoDto getPhotoTest(Integer id) {
		Photo photo = photoMapper.selectPhotoTest(id);
		return new PhotoDto(photo.getpId(), photo.getPbId(),photo.getpTime(), photo.getpCity());
	}
}
