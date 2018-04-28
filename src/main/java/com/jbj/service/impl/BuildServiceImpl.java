package com.jbj.service.impl;

import com.jbj.bean.Build;
import com.jbj.bean.ListOf;
import com.jbj.bean.Photo;
import com.jbj.enums.BaseEnum;
import com.jbj.exception.NoDataException;
import com.jbj.mapper.BuildMapper;
import com.jbj.mapper.ListOfMapper;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        //根据城市查询出楼盘
        List<String> list = buildMapper.selectBuildNameByCity(build.getbCity());
        if(list.size() == 0){
            //还没有这个城市的，可以进行保存。
            int a=buildMapper.saveBuild(build);
            if(a>0){
                return a;
            }else {
                return -1;
            }
        }else{
            //有这个城市,取出对应的楼盘名。然后和要保存的数进行比对。如果不一样，保存。
            if(! useLoop(build)){
               int a = buildMapper.saveBuild(build);
                if(a>0){
                    return a;
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }
    }

    /**
     * 去判断根据城市查询出楼盘list中有没有前台传递的楼盘名。
     * @param build
     * @return
     */
    public  boolean useLoop(Build build) {
        List<String> list = buildMapper.selectBuildNameByCity(build.getbCity());
        for(String s: list){
            if(s.equals(build.getbName()))
                return true;
        }
        return false;
    }

    /**
     * 查询id和城市根据楼盘名。保存图片，楼盘和城市的下拉列表
     * @param bName
     * @return
     */
    public List<Map<String, Object>> queryBIdAndBCityByBName(String bName) {
        List<Map<String, Object>> list = buildMapper.selectBIdAndBCity(bName);
        return list;
    }

    /**
     * 楼盘补拍列表
     * @param flag
     * @return
     */
    @Autowired
    ListOfMapper listOfMapper;
    @Autowired
    PhotoMapper photoMapper;
    public List<Map<String, Object>> FillPhotoType() {
            //查询出补拍的原因。
            List<Map<String, Object>> list = listOfMapper.selectListTypes();
            return list;
    }

    /**
     * 修改补拍原因，补拍列表+1
     * @param lId  补拍原因id
     * @param bId  楼盘id
     * @return
     */
    public int updateBuildFillType(Integer lId,Integer bId) {
       if(!"".equals(lId) && (!"".equals(bId)) && !(lId == null) && !(bId == null)){
            //1:修改楼盘中楼盘的补拍原因
           int i = buildMapper.updateBuildFillType(lId, bId);
            //列表中补拍列表 +1.
           int i1 = listOfMapper.updateListOf(lId);
           if(i>0 && i1>0){
               return 1;
           }else {
               return -1;
           }
       }else {
           return -1;
       }
    }

    /**
     * 开始补拍。保存的照片的类型是补拍的。然后累加。
     * @return
     */

    public int updateFillPhotos(Integer bId, Photo photo) {
        Build build = buildMapper.selectBuildById(bId);
        if(build.getbFillType() == null){
            photo.setpIsFill(BaseEnum.ISFILL);
        }else{
            photo.setpIsFill(BaseEnum.ISNOTFILL);
        }
        int bFillPhotos = photoMapper.savePhoto(photo);
        Integer integer = build.getbFillPhotos();
        int photos=integer.intValue();
        photos++;

        int i = buildMapper.updatePhotos(photos,bId);
        return i;
    }
}
