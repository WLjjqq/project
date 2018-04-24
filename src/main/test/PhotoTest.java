import com.jbj.bean.Photo;
import com.jbj.mapper.PhotoMapper;
import com.jbj.service.PhotoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class PhotoTest extends BaseTest {
    //selectPhotoById
    @Autowired
    PhotoMapper photoMapper;
    @Autowired
    PhotoService photoService;
    @Test
    public void test(){
        Photo photo = photoMapper.selectPhotoById(2);
        System.out.println(photo);
    }
    @Test
    public void test1(){
        Photo photo = new Photo();
        photo.setpCity("北京");
        photo.setPbId(2);
        List<Map<String,Object>> list = photoMapper.selectPhoto(photo);
        for (Map<String,Object> m:list
             ) {
            System.out.println(m);
        }
    }

    @Test
    public void testPhoto(){
        Photo photo = new Photo();
        photo.setPbId(55);

        photo.setpType("物业拍照");
        photoMapper.savePhoto(photo);
    }

}
