package com.jbj.controller;

import com.jbj.bean.Feedback;
import com.jbj.service.FeedbackService;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    /**
     * 问题反馈保存。
     * @param feedback
     * @return
     */
    @RequestMapping(value = "/saveFeedback",method = RequestMethod.GET)
    @ResponseBody
    public Msg saveFeedbackController(Feedback feedback){
        Object o = feedbackService.saveFeedback(feedback);
        if(o instanceof String){
            return Msg.fail().add("mession","您输入的信息有误，请认真检查");
        }else {
            return Msg.success().add("mession","保存成功");
        }
    }
}
