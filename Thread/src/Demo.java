/**
 * Created by Mosen on 2018/4/3.
 */
public class Demo {

    public User test1() {
        User user1 = new User();
        user1.setName(Thread.currentThread().getName()+"test1");
        user1.setAge(1);
        test2(user1);
        return user1;
    }

    public void test2(User user){
        user.setName(Thread.currentThread().getName()+"test2");
        user.setAge(2);
    }

    public static void main(String[] args) {
        for(int i=1;i<501;i++) {
            System.out.println("/home/tomcat_shortUrl/pdf/test/"+i+".pdf");
        }
    }

}
