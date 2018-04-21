import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaTest {
    @Test
    public void test(){
        Calendar ca = Calendar.getInstance();//得到一个Calendar的实例
        ca.set(2009, 11, 31);//月份是从0开始的，所以11表示12月
        Date now = ca.getTime();
        ca.add(Calendar.MONTH, -1); //月份减1
        Date lastMonth = ca.getTime(); //结果
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sf.format(now));
        System.out.println(sf.format(lastMonth));
        System.out.println(lastMonth);
    }

}
