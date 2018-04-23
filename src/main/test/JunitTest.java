import com.jbj.bean.Feedback;
import com.jbj.bean.Photo;
import com.jbj.dto.PhotoDto;
import com.jbj.mapper.FeedbackMapper;
import com.jbj.mapper.PhotoMapper;
import com.jbj.mapper.UserMapper;
import com.jbj.service.BuildService;
import com.jbj.service.PhotoService;
import com.jbj.service.VersionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JunitTest {

	@Autowired
	private PhotoMapper photoMapper;
	private PhotoService photoService;
	@Autowired
	private FeedbackMapper feedbackMapper;
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testSaveFeedback(){
		Feedback feedback=new Feedback(6,2,"2的问题",null);
		feedbackMapper.saveFeedback(feedback);
	}


/*	@Test
	public void test1(){
		Photo photo=new Photo();
		photo.setPbId(2);
		java.sql.Date date=new java.sql.Date(2018-1900,03,16);
		photo.setpTime(date);
		System.out.println(photo.getpTime());
		photoService.getPhoto(photo.getPbId(),photo.getpTime());
	}*/

	//查询照片的类型
	@Test
	public void test2(){
		List<String> list=photoMapper.queryPhotoType();
		for (String lists:list) {
				System.out.println(lists);
		}
	}
	@Autowired
	private VersionService versionService;
	@Test
	public void test3(){
		versionService.queryVersion("1.1.6");
		System.out.println(versionService.queryVersion("1.1.6"));
	}

	@Autowired
	private BuildService buildService;
	@Test
	public void test4(){
		List<String> citys=buildService.getCity();
		for (String c:citys
			 ) {
			System.out.println("城市 "+c);
		}
	}

	@Test
	public void test5(){
		/*Photo photo = new Photo();
		Calendar ca = Calendar.getInstance();//得到一个Calendar的实例
		ca.set(2018, 3, 19);//月份是从0开始的，所以11表示12月
		java.util.Date now = ca.getTime();
		photo.setpTime(now);
		System.out.println(photo.getpTime());*/
		List<Map<String,Object>> maps=photoService.getPhotoJilu();
		for (Map<String,Object> m: maps
			 ) {
			System.out.println(m);
		}
	}

/*	@Test
	public void test6(){
		List<Map<String,Object>> maps=photoService.getPhotoCount();
		for (Map<String,Object> m: maps
				) {
			System.out.println(m);
		}
	}*/
	@Test
	public void test7(){
        PhotoDto photoDto = photoService.getPhotoTest(2);
        System.out.println("测试photoDto"+photoDto);
    }
}
