package playGround;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;

public class ReadConfigFileTest {

    private static final Logger LOGGER = LogManager.getLogger(ReadConfigFileTest.class);

    @Test

    public void run() {

        LOGGER.info(ReadConfigFiles.getPropertyValues("DbUser"));
        LOGGER.info(ReadConfigFiles.getPropertyValues("DbPassword"));
        LOGGER.info(ReadConfigFiles.getPropertyValues("DbName"));
        LOGGER.info(ReadConfigFiles.getPropertyValues("Url"));
    }
}