package playGround;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.DateUtils;

public class DateUtilsTest {

    private static final Logger LOGGER = LogManager.getLogger(DateUtilsTest.class);

    @Test

    public void run() {

        LOGGER.info(DateUtils.returnNextMonth());
    }
}
