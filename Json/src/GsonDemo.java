import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mosen on 2017/8/31.
 */
public class GsonDemo {

    @SerializedName("class_name") //转换json字段
    private String className;

    public static void main(String[] args) {
        //创建测试object
        User user = new User("李宁",24,"北京");
        System.out.println(user);

        //转成json字符串
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);

        //json字符串转成对象
        User user1 = gson.fromJson(json,User.class);
        System.out.println(user1);

        User user2 = new User("老王", 36, "无锡");
        List<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user2);
        String jsonList = gson.toJson(list);
        System.out.println(jsonList);
        List<User> list1 = gson.fromJson(jsonList, new TypeToken<List<User>>(){}.getType());
        System.out.println(list1);

        //获取json中特定的值
        JsonElement je = new JsonParser().parse(json);
        JsonObject jobj = je.getAsJsonObject();
        JsonArray jarr = je.getAsJsonArray();
        JsonElement aaa =je.getAsJsonObject().get("aaa");
    }
}
