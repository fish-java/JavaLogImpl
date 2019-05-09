package slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
    private static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void log(){
        logger.info("hello world");
        logger.warn("Wow");
    }
}
