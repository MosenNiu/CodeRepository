package com.mosen.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** 定时器配置类
 * Created by Mosen on 2018/2/28.
 */
@Configuration
@EnableScheduling   //开启定时器，也可在启动类上开始
public class MyScheduling {
    Logger LOGGER = LoggerFactory.getLogger(MyScheduling.class);

    @Scheduled(cron = "0/2 * * * * *")
    public void timer(){
        //获取当前时间
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println("当前时间为:" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
