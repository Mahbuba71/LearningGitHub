package data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class DataStoreClassTest {
    private static final Logger LOGGER = LogManager.getLogger(DataStoreClassTest.class);

    @Test(dataProvider = "MultipleColumnValues", dataProviderClass = DataStore1.class)

    public void run(String name, String state, int zipcode){
        LOGGER.info("Name is:" + name);
        LOGGER.info("State is:" + state);
        LOGGER.info("Zip code is:" + zipcode);

    }
}
