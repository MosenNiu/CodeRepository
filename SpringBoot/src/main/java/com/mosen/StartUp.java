package com.mosen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**实现CommandLineRunner接口，用于启动时调用，服务启动后调用run方法
 * Created by Mosen on 2017/9/14.
 */
@Component
public class StartUp implements CommandLineRunner {

//    @Autowired
//	private Domain domain;

    @Override
    public void run(String... strings) throws Exception {
//        domain.taxpayerPush();
//        domain.ptAndTaxRelationPush();
//        domain.ptPush();
    }

}
