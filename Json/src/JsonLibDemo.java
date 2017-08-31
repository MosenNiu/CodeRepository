import net.sf.json.JSONObject;

/**
 * Created by Mosen on 2017/8/31.
 */
public class JsonLibDemo {

    public static void main(String[] args) {
        //创建测试object
        User user = new User("李宁",24,"北京");
        System.out.println(user);

        //转成json字符串
        JSONObject jsonObject = JSONObject.fromObject(user);
        String json = jsonObject.toString();
        System.out.println(json);

        //json字符串转成对象
        JSONObject jsonObject1 = JSONObject.fromObject(json);
        User user1 = (User) JSONObject.toBean(jsonObject1,User.class);
        System.out.println(user1);


    }
}
