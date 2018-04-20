import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Junit2Test {
	@Autowired
	private PhotoService photoService;
	@Autowired
	private PhotoMapper photoMapper;
	@Test
	public void test(){
		PhotoDto photoDto = photoService.getPhotoTest(2);
		System.out.println("测试photoDto"+photoDto);
	}
	@Test
	public void test1(){
		List<Map<String,Object>> list = photoMapper.selectPhotoCount();
		for (Map<String,Object> maps:list
			 ) {
			System.out.println(maps);
		}
	}
}
