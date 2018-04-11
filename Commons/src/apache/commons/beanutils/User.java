package apache.commons.beanutils;

/**
 * Created by Mosen on 2018/1/12.
 */
public class User {

    private String id;	            //主键
    private String login_name;	    //登录名
    private String name;	        //用户名
    private String password;	    //登录密码
    private String office_name;	    //科室名称
    private String enable;	        //是否冻结可用，0不可用，1可用
    private String create_user_id;	//新建数据人
    private String create_time;	    //新建数据时间
    private String update_user_id;	//最后修改人
    private String update_time;     //修改时间

    public User() {
    }

    public User(String login_name, String password) {
        this.login_name = login_name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(String update_user_id) {
        this.update_user_id = update_user_id;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", login_name='" + login_name + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", office_name='" + office_name + '\'' +
                ", enable='" + enable + '\'' +
                ", create_user_id='" + create_user_id + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_user_id='" + update_user_id + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
