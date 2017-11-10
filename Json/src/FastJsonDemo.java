import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mosen on 2017/8/31.
 */
public class FastJsonDemo {
    public static void main(String[] args) {
        //创建测试object
        User user = new User("李宁",24,"北京");
        System.out.println(user);

        //转成json字符串
        String json = JSON.toJSON(user).toString();
        System.out.println(json);

        //json字符串转成对象
        User user1 = JSON.parseObject(json,User.class);
        System.out.println(user1);

        User user2 = new User("老王", 36, "无锡");
        List<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user2);
        String jsonList = JSON.toJSON(list).toString();
        System.out.println(jsonList);
        List<User> list1 = JSON.parseArray(jsonList, User.class);
        System.out.println(list1);

        String str = "{'name':['李宁','老王'],'location':['北京','无锡'],'age':[24,36]}";
        System.out.println(JSON.parseArray(str,User.class));
    }
}
