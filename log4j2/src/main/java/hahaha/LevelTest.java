package hahaha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Mosen on 2017/11/16.
 */
public class LevelTest {
    public static final Logger logger = LogManager.getLogger(LevelTest.class);

    public static void main(String[] args) {
        logger.debug("this is {} !!!", "debug");
        logger.info("this is {} !!!", "info");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.warn("this is {} !!!", "warn");
        logger.error("this is {} !!!", "error");
    }
}
