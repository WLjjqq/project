import com.jbj.bean.Build;
import com.jbj.mapper.BuildMapper;
import com.jbj.service.BuildService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class BuildTest extends BaseTest {
    @Autowired
    private BuildMapper buildMapper;
    @Autowired
    private BuildService buildService;
    @Test
    public void testBuildByCity(){
        List<Map<String, Object>> list = buildService.queryBuildByCity("西安");
        System.out.println(list.size());
        for (Map<String,Object> m:list
             ) {
            System.out.println(m);
        }
    }

    @Test
    public void test(){
        List<Map<String, Object>> list = buildMapper.selectBuildByCity("上海");
        if(list.size() ==0){
            System.out.println("没有城市");
        }else {
            for(int i=0;i<list.size();i++){
                Map map1 = (Map) list.get(i);
                String str = (String) map1.get("buildName");

                if(str == null){
                    System.out.println("有城市，没有楼盘");
                }else {
                    System.out.println(str);
                }
            }
        }
        }

    /**
     * 测试保存
     */
    @Test
    public void testSaveBuild(){
        Build build = new Build(7, "美景", "77", "77", "上海", "77", "77", "77", "77", "77", "是", "77", null, null, null, new Date());
        int a=buildMapper.saveBuild(build);
        if(a>0){
            System.out.println("保存成功");
        }else {
            System.out.println("保存失败");
        }
    }
}
