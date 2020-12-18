package com.mosen.springsecurity.model;

import lombok.Data;

@Data
public class Account {

    private String UUID;	//主键
    private String login_name;	//登录名
    private String password;	//密码
    private String mobile;	//手机号
    private String email;	//邮箱
    private String nick_name;	//昵称
    private String create_time;	//创建时间
    private String last_login_time;	//上次登录时间
    private String login_time;	//登录时间


}
