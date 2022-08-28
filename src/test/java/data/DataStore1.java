package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataStore1 {

    @DataProvider(name = "SingleColumn")
    public Object[][] storeSingleColumnValue() {
        return new Object[][]{
                {"Rifat"},
                {"Farid"},
                {"Ashraf"}};
    }

    @Test(dataProvider = "SingleColumn")
    public void run(String name) {
        System.out.println("Name is:" + name);
    }

    @DataProvider (name = "MultipleColumnValues")
    public Object [] [] storeMultipleColumnValues() {
        return new Object[][] {
                {"Rifat", "Florida", 33018},
                {"Farid","New York", 12457},
                {"Ashraf", "Bangladesh", 1207}
        };
    }
    @Test (dataProvider = "MultipleColumnValues")
    public void run ( String name, String state, int zipcode) {
        System.out.println("Name is:" + name);
        System.out.println("State is:" + state);
        System.out.println("Zip Code is:" + zipcode);
    }

}


