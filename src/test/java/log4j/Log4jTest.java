package log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);

    @Test
    public void logLevel(){
        logger.fatal("ops fatal~~");

        logger.error("... error");

        logger.info("a warn from 2048");

        logger.info("wow info");

        logger.info("wow debug");

        logger.info("hello trace");
    }
}
