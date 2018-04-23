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
	 * @param pId
	 * @return
	 */
	Photo  selectPhotoTest(@Param("pId") Integer pId);

	/**
	 * 查询照片所有的信息
	 * @param pId
	 * @return
	 */
	Photo selectPhotoById(@Param("pId") Integer pId);

	/**
	 * 多条件查询
	 */
	List<Map<String,Object>> selectPhoto(Photo photo);
}
