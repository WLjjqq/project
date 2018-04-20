package com.jbj.mapper;


import com.jbj.bean.Feedback;

public interface FeedbackMapper {
	/**
	 * 保存问题反馈
	 * @param feedback
	 * @return  保存成功，数据库返回一个int，受影响的行数。
	 */
	 int saveFeedback(Feedback feedback);

}
