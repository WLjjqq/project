package com.jbj.service.impl;

import com.jbj.bean.Build;
import com.jbj.exception.NoDataException;
import com.jbj.mapper.BuildMapper;
import com.jbj.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BuildServiceImpl implements BuildService {
    @Autowired
    BuildMapper buildMapper;

    /**
     * 城市列表
     * @return
     */
    public List<String> getCity() {
        List<String> citys=buildMapper.queryCity();
        return citys;
    }

    /**
     * 查询楼盘
     * @param city 根据城市
     * @return
     */
    public List<Map<String, Object>> queryBuildByCity(String city) {
        try {
            List<Map<String, Object>> list = buildMapper.selectBuildByCity(city);
            //没有查询出数据。
            if(list.size() ==0){
                throw new NoDataException("没有这个城市");
            }else {
                for(int i=0;i<list.size();i++){
                    Map map1 =  list.get(i);
                    String str = (String) map1.get("bName");
                    //查询出的数据中。map中的buildName为null
                    if(str == null){
                        throw new NoDataException("这个城市还没有楼盘");
                    }
                }
            }
            return list;
        } catch (NoDataException nde) {
            throw nde;
        }
    }

    /**
     * 保存楼盘
     * @param build
     * @return
     */
    public int saveBuild(Build build) {
        int i = buildMapper.saveBuild(build);
     /*  List<Map<String,Object>> list= buildMapper.selectBuildByCity(build.getbCity());
        String buildName=null;
        String buildCity=null;
       for(int a=0;a<list.size();a++){
           Map map = list.get(a);
            buildName = (String) map.get("bName");
            buildCity=  (String) map.get("bCity");
       }
        System.out.println(buildCity);*/
        if(i<=0){
            throw new NoDataException("您输入的信息有误，没能保存，请仔细检查");
        }else {
            return i;
        }
    }
}
