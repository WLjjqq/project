package com.jbj.mapper;

import com.jbj.bean.Photo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PhotoMapper {
	/**
	 * 保存图片
	 * @param photo
	 * @return
	 */
	int savePhoto(Photo photo);

	/**
	 * 多条件查询。
	 * @param photo  使用photo.set去设置值，然后来查询
	 * @return
	 */
	int getPhoto(Photo photo);

	/**
	 * 上传记录中统计每天的楼盘总数。照片总数
	 * 使用dto。
	 * @return
	 */
	List<Map<String,Object>> selectPhotoCount();

	/**
	 * 查询工程拍照的类型
	 * @return
	 */
	List<String> queryPhotoType();

	/**
	 * 查询上传记录的详细信息
	 * @return
	 */
	List<Map<String, Object>> selectPhotoJilu();

	/**
	 * 测试dto的使用
	 * @param id
	 * @return
	 */
	Photo  selectPhotoTest(@Param("id") Integer id);
}
