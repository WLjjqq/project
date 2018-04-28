package com.jbj.service;

import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;
import org.apache.ibatis.annotations.Param;


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
	 * 查询照片的类型
	 * @return
	 */
	Object getPhotoType();

	/**
	 * 返回上传记录。
	 * @return
	 */
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

	/**
	 *
	 * @return
	 */
	Photo getPhoto(@Param("pId") Integer pId);

	/**
	 * 批量删除
	 * @param pId
	 * @return
	 */
	int deletePhotos(List<Integer> pId);
}
