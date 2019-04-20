package base;

import org.apache.log4j.Logger;
import org.junit.Test;
import sun.jvm.hotspot.HelloWorld;

public class Env {
    private static Logger logger = Logger.getLogger(HelloWorld.class);

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
