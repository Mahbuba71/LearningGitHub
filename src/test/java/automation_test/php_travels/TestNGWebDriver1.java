package automation_test.php_travels;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ScreenCapture;

public class TestNGWebDriver1 {
    WebDriver driver;

    @BeforeMethod

    public void browseInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser("https://phptravels.com/demo/");
    }

    @Test

    public void verifyHomePageTitle() {

        String expectedTitle = "Demo Script Test drive - PHPTRAVELS";
        String actualTitle = ActOn.browser(driver).captureTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod

    public void closeBrowser(ITestResult result) {
    if (ITestResult.FAILURE == result.getStatus()) {
        ScreenCapture.getScreenShot(driver);
    }
    driver.quit();
    }
}
