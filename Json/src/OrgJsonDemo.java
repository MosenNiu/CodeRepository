import org.json.JSONObject;

/**
 * Created by Mosen on 2017/8/31.
 */
public class OrgJsonDemo {
    public static void main(String[] args) {
        //创建测试object
        User user = new User("李宁",24,"北京");
        System.out.println(user);

        //转成json字符串
        String json = new JSONObject(user).toString();
        System.out.println(json);

        //json字符串转成对象
        JSONObject jsonObject = new JSONObject(json);
        String name = jsonObject.getString("name");
        Integer age = jsonObject.getInt("age");
        String location = jsonObject.getString("location");
        User user1 = new User(name,age,location);
        System.out.println(user1);
    }
}
