
import com.jbj.bean.Photo;
import com.jbj.mapper.PhotoMapper;
import com.jbj.mapper.UserMapper;
import com.jbj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JunitTest {

	@Autowired
	UserMapper userMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private PhotoMapper photoMapper;
	@Test
	public void test(){

		Photo photo=new Photo(5,"工程拍照","北京",2,"3","一单元","36","3","4","8",null,null,null,null,"很好",null,null,"E:\\testupload\\1.jpg",new Date(),null);
		photoMapper.savePhoto(photo);
		System.out.println("成功");
	}

}
