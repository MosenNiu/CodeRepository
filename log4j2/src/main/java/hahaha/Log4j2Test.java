package hahaha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MapMessage;

/**
 * Created by Mosen on 2017/10/16.
 */
public class Log4j2Test {

    public static final Logger logger = LogManager.getLogger(Log4j2Test.class);
    public static final Logger logger2 = LogManager.getLogger("123.6666");

    public static void main(String[] args) {
//        long begin = System.currentTimeMillis();
//        new Log4j2Test2();
//        logger.info("111:{}",Thread.currentThread().getName());
//        logger2.info("111:{}",Thread.currentThread().getName());
//        logger.info("111:{}",Thread.currentThread().getName());
//        System.out.println(System.currentTimeMillis()-begin);
//        System.out.println("1111".getBytes().toString());

        MapMessage mapMessage = new MapMessage();
        mapMessage.put("abc","abc123");
        mapMessage.put("666","999");
        logger.info(mapMessage);
    }
}
