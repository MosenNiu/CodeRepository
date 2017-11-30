import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Mosen on 2017/8/31.
 */
public class JacksonDemo {

    @JsonProperty("class_name") //转换json字段
    private String className;

    public static void main(String[] args) {
        //创建测试object
        User user = new User("李宁",24,"北京");
        System.out.println(user);

        //转成json字符串
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(user);
            System.out.println(json);


            //json字符串转成对象
            User user1 = mapper.readValue(json,User.class);
            System.out.println(user1);

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
