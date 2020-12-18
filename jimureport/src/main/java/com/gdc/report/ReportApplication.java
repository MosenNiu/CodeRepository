package com.gdc.report;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value={"org.jeecg.modules.jmreport.**.mapper*"})
@SpringBootApplication(scanBasePackages = {"org.jeecg.modules.jmreport"}, exclude = DruidDataSourceAutoConfigure.class)
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }

}
