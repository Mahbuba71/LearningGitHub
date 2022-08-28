package playGround;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestNgMavenExampleTest {

    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExampleTest.class);

    @Test

    public void run(){
        LOGGER.debug("This is debug message");
        LOGGER.info("This is info message");
        LOGGER.warn("This is a warning");
        LOGGER.error("This is an error");
        LOGGER.fatal("This is dangerous");
    }
}
