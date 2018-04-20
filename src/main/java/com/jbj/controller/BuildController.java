package com.jbj.controller;

import com.jbj.service.BuildService;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class BuildController {
    @Autowired
    private BuildService buildService;

    /**
     * 城市列表
     * @return
     */
    @RequestMapping(value = "/city",method = RequestMethod.GET)
    @ResponseBody
    public Msg getCity(){
        return Msg.success().add("city",buildService.getCity());
    }
}
