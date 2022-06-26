import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizeTests {


    @Test(dataProvider = "expectedEmailPos") // Use the data provider for getting expected emails,
                                             // see the line 36
    public void testFieldEmailPositive(String expectedEmail) throws InterruptedException {
        // Initialization the driver
        final String chromeDriver = "webdriver.chrome.driver";
        final String driverPath = "D:\\IDEAProjects\\3 QAFOREVERYONE\\Web_Tests_Selenium_TestNG_Java\\src\\test\\resources\\chromedriver.exe";
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        // Initialization the url of the test page signv2.html
        final String url = "http://www.99-bottles-of-beer.net/signv2.html";
        driver.get(url);

        // Set the field Email
        driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(expectedEmail);
        driver.findElement(By.cssSelector("[name=\"submit\"]")).click();

        // Read the value email and compare with expected one
        String actualEmail = driver.findElement(By.cssSelector("[name=\"email\"]")).getAttribute("value");
        Assert.assertEquals(actualEmail, expectedEmail); // the expected result and the actual one should be equal

        // Close the driver
        driver.quit();
    }

    @DataProvider(name = "expectedEmailPos")
    public Object[][] provideData() {

        return new Object[][] {
                {"aaaaaaaaaaassssssssssssssssssssssssssssssssssssss22222222222222222222222222222222333333333399@a.com"},
                {"aaaaaaaaaaaassssssssssssssssssssssssssssssssssssss22222222222222222222222222222222333333333100@a.com"},
        };
    }

    @Test(dataProvider = "expectedEmailNeg")
    public void testFieldEmailNegative(String expectedEmail) throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "D:\\IDEAProjects\\3 QAFOREVERYONE\\Web_Tests_Selenium_TestNG_Java\\src\\test\\resources\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/signv2.html";
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(expectedEmail);
        driver.findElement(By.cssSelector("[name=\"submit\"]")).click();


        String actualEmail = driver.findElement(By.cssSelector("[name=\"email\"]")).getAttribute("value");
        Assert.assertNotEquals(actualEmail, expectedEmail);
        driver.quit();
    }
    @DataProvider(name = "expectedEmailNeg")
    public Object[][] provideDataNeg() {

        return new Object[][] {
               {"aaaaaaaaaaaassssssssssssssssssssssssssssssssssssss222222222222222222222222222222223333333333101@a.com"},
               {"aaaaaaaaaaaassssssssssssssssssssssssssssssssssssss222222222222222222222222222222223333333333a102@a.com"}

        };
    }

}


