package hahaha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Mosen on 2017/10/16.
 */
public class Log4j2Test2 {

    public static final Logger logger = LogManager.getLogger(Log4j2Test2.class);
    public static final Logger logger2 = LogManager.getLogger("123.6666");

    public Log4j2Test2() {
        logger.error("aaaa");
    }
}
