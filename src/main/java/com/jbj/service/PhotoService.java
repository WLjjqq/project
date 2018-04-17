package com.jbj.service;

import com.jbj.bean.Photo;
import org.springframework.web.multipart.MultipartFile;


import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface PhotoService {
	 int insert(Photo photo);
	int getPhoto(Integer id,Date param);

}
