package com.jbj.controller;

import com.jbj.bean.Version;
import com.jbj.interceptor.MyInterceptor;
import com.jbj.service.VersionService;
import com.jbj.utils.Msg;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/version")
public class VersionController {
    @Autowired
    private VersionService versionService;

    @RequestMapping(value = "/getNewVersion",method = RequestMethod.GET)
    @ResponseBody
    public Msg getNewVersion(@RequestParam("versionNumber") String versionNumber) {

            try{
                return Msg.success().add("NewVersion",versionService.queryVersion(versionNumber));
            } catch (NullPointerException npe){
                npe.printStackTrace();
                return Msg.success().add("mession","versionNumber没有值");
            }

    }
}
