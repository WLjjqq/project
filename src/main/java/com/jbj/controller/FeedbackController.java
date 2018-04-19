package com.jbj.controller;

import com.jbj.bean.Feedback;
import com.jbj.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    //问题反馈保存。
    @RequestMapping(value = "/saveFeedback",method = RequestMethod.GET)
    @ResponseBody
    public Object saveFeedbackController(Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }
}
