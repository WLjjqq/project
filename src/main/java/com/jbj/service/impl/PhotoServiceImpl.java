package com.jbj.service.impl;

import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		if(photos.size()>0){
			return photos;
		}
			return null;
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
		 /* 这里用equals就会出错。
		 	object.equals(null)，“equals()”方法是比较“值”是否相等；
		  	object==null,“==”比较运算符是用来比较“对象”是否是同一个。*/
		if(photo == null){
			return null;
		}else {
			return new PhotoDto(photo.getpId(), photo.getPbId(),photo.getpTime(), photo.getpCity());
		}
	}

	/**
	 * 根据id查询出照片所有的信息
	 * @param pId
	 * @return
	 */
	public Photo getPhoto(Integer pId) {
		Photo photo = photoMapper.selectPhotoById(pId);
		if (photo == null) {
			return null;
		}else {
			return photo;
		}
	}
}
