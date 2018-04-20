package com.jbj.service;

import com.jbj.bean.Feedback;

public interface FeedbackService {
    /**
     * 问题反馈保存。
     * @param feedback
     * @return
     */
    Object saveFeedback(Feedback feedback);
}
