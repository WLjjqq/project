package com.jbj.controller;

import com.jbj.bean.Build;
import com.jbj.service.BuildService;
import com.jbj.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/build")
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

    /**
     * 根据城市来查询楼盘。
     * @param city
     * @return
     */
    @RequestMapping(value = "/queryBuildByCity",method = RequestMethod.GET)
    @ResponseBody
    public Msg queryBuildByCity(@RequestParam("city") String city){
        if(! "".equals(city)){
            List<Map<String, Object>> list = buildService.queryBuildByCity(city);
            return Msg.success().add("list",list);
        }else {
            return Msg.fail().add("mession","请输入城市");
        }
    }

    /**
     * 保存楼盘
     * @param build
     * @return
     */
    @RequestMapping(value = "/saveBuild", method = RequestMethod.GET)
    @ResponseBody
    public Msg saveBuild(Build build){
        if(! "".equals(build.getbCity()) && ! (build.getbCity() == null) ){
            try {
                int i = buildService.saveBuild(build);
                if(i>0){
                    return Msg.success().add("mession","保存成功");
                }else {
                    return Msg.fail().add("mession","数据库中这个城市已经有这个楼盘了");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            return Msg.fail().add("mession","您输入的城市有误，不能为null");
        }
        return null;
       }

    /**
     * 根据楼盘名查询城市和id
     * @param bName
     * @return
     */
    @RequestMapping(value = "/queryCityByName/{bName}",method = RequestMethod.GET)
    @ResponseBody
    public Msg queryBIdAndBCityByBName(@PathVariable("bName") String bName){
        if(! "".equals(bName)) {
            List<Map<String, Object>> list = buildService.queryBIdAndBCityByBName(bName);
            return Msg.success().add("list", list);
        }else {
            return Msg.fail().add("mession", "请输入楼盘的名字");
        }
    }

    /**
     * 查询补拍原因列表
     * @return
     */
    @RequestMapping(value = "/queryFillList",method = RequestMethod.GET)
    @ResponseBody
    public Msg queryFillList(){
        List<Map<String, Object>> list = buildService.FillPhotoType();
        if(list.size()>0){
            return Msg.success().add("list", list);
        }else {
            return Msg.fail().add("mession","请维护补拍原因列表");
        }
    }


    }

