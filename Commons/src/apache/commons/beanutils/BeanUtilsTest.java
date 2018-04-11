package apache.commons.beanutils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mosen on 2018/1/17.
 */
public class BeanUtilsTest {
    public static void main(String[] args) {

        User user = new User();
        user.setId("1");
        user.setLogin_name("登录");
        user.setName("bean");
        user.setOffice_name("科室");
        user.setCreate_user_id("0");
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        user.setUpdate_time(date);
        System.out.println(user);

        AccountVO avo = new AccountVO();
        try {
            //从第二个参数拷贝到第一个参数中
            BeanUtils.copyProperties(avo,user);
            System.out.println(user);
            System.out.println(avo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
