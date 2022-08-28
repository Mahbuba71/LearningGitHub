package automation_test.php_travels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGWebDriver {
    @Test

    public void VerifyHomePageTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        String expectedTitle = "Demo Script Test drive - PHPTRAVELS";
        String actualTile = driver.getTitle();
        Assert.assertEquals(actualTile, expectedTitle);
        driver.quit();
    }

}
