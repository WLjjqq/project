package com.jbj.service;

import com.jbj.bean.Feedback;

public interface FeedbackService {
    //问题反馈保存。
    Object saveFeedback(Feedback feedback);
}
