package com.jbj.service.impl;

import com.jbj.bean.Feedback;
import com.jbj.mapper.FeedbackMapper;
import com.jbj.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    //问题反馈保存
    private FeedbackMapper feedbackMapper;
    public Object saveFeedback(Feedback feedback) {
       int isTrue = feedbackMapper.saveFeedback(feedback);
        if(isTrue >0){
            return isTrue;
        }else{
            return "请检查信息，没有保存成功";
        }
    }

}
