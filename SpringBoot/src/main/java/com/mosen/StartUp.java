package com.mosen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**实现CommandLineRunner接口，用于启动时调用，服务启动后调用run方法
 * Created by Mosen on 2017/9/14.
 */
@Component
public class StartUp implements CommandLineRunner {

//    @Autowired
//	private Domain domain;
    @Autowired
    private ThreadPoolTaskExecutor myExecutor;      //线程池

    @Override
    public void run(String... strings) throws Exception {
//        domain.taxpayerPush();
//        domain.ptAndTaxRelationPush();
//        domain.ptPush();

        //可执行jar的方式最后不关闭线程池，jar包会一直处于运行状态
        myExecutor.shutdown();
    }

}
