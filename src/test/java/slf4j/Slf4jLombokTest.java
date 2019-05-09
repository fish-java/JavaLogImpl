package slf4j;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

// 使用Lombok自动生成logger
@Slf4j
public class Slf4jLombokTest {

    @Test
    public void log(){
        log.info("hello world");
        log.warn("Wow");
    }
}
