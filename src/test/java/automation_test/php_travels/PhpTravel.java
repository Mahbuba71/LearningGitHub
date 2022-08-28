package automation_test.php_travels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhpTravel {

    WebDriver driver;

    @BeforeMethod
    public void browserInitialization(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Launch the website in Chrome browser
        driver.get("https://phptravels.com/demo/");

        //Maximizing the browser
        driver.manage().window().maximize();
    }

    @Test
    public void validateHomePageTitle(){
        String expectedTitle = "Demo Script Test drive - PHPTRAVELS";
        String actualTitle = driver.getTitle();

        //Validating the tile
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void closeBrowser(){
        //Closing the browser
        driver.quit();
    }

}
