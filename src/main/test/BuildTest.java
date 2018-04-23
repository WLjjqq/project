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
    public void testBuildByCity() {
        List<Map<String, Object>> list = buildService.queryBuildByCity("西安");
        System.out.println(list.size());
        for (Map<String, Object> m : list
                ) {
            System.out.println(m);
        }
    }

    @Test
    public void test() {
        List<Map<String, Object>> list = buildMapper.selectBuildByCity("上海");
        if (list.size() == 0) {
            System.out.println("没有城市");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Map map1 = (Map) list.get(i);
                String str = (String) map1.get("bName");

                if (str == null) {
                    System.out.println("有城市，没有楼盘");
                } else {
                    System.out.println(str);
                }
            }
        }
    }

    /**
     * 测试保存
     */
    @Test
    public void testSaveBuild() {
        Build build = new Build(29, "美景美景", null, null, "重庆", null, null, null, null, null, "是", null, null, null, null, new Date());
        //根据城市查询出楼盘
        List<String> list = buildMapper.selectBuildNameByCity("重庆");
        if (list.size() == 0) {
            //还没有这个城市的，可以进行保存。
            int a = buildMapper.saveBuild(build);
            if (a > 0) {
                System.out.println("保存成功");
            } else {
                System.out.println("保存失败");
            }
            return;
        } else {
            //有这个城市,取出对应的楼盘名。然后和要保存的数进行比对。如果不一样，保存。
            if( ! useLoop(build)){
                System.out.println("没有");
            }else {
                System.out.println("有");
            }
        }
    }

    @Test
    public boolean useLoop(Build build) {
               List<String> list = buildMapper.selectBuildNameByCity(build.getbCity());
        for(String s: list){
            if(s.equals(build.getbName()))
                return true;
        }
        return false;
    }
}
