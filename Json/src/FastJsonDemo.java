import com.alibaba.fastjson.JSON;

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

    }
}
