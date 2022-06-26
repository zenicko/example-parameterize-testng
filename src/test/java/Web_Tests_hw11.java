
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicReference;

import static io.qameta.allure.Allure.step;


public class Web_Tests_hw11 {

    /**
     * TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу
     * пользователь видит заголовок 99 Bottles of Beer
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Считать заголовок в правом верхнем углу
     * 3. Подтвердить, что текст заголовка соответствует ожидаемому
     * 4. Закрыть браузер
     */

    @Test(description = "Testing title")
    @Description(value = "Текст заголовка соответствует ожидаемому")
    @Feature("Testing 99-bottles-of-beer.net")
    @Story("Testing title")
    public void test_TC_11_01() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "D:\\IDEAProjects\\3 QAFOREVERYONE\\Web_Tests_Selenium_TestNG_Java\\src\\test\\resources\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        step("Открыть вебсайт на базовой странице",
                () -> {
                    driver.get(url);
                }
        );
        AtomicReference<String> actualResult = new AtomicReference<>();
        step("Считать заголовок в правом верхнем углу", () -> {
                    WebElement title = driver.findElement(By.cssSelector("#header h1"));
                    actualResult.set(title.getText());
                }
        );
        step("Подтвердить, что текст заголовка соответствует ожидаемому", () -> {
                    String expectedResult = "99 Bottles of Beer";
                    Assert.assertEquals(actualResult.get(), expectedResult);
                }
        );
        step("Закрыть браузер", driver::quit);
    }

    /**
     * TC_11_02 Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Считать название последнего пункта меню
     * 3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
     * 4. Закрыть браузер
     */

    @Test(description = "Name of the men")
    @Feature("Testing 99-bottles-of-beer.net")
    @Description("Название последнего пункта меню соответствует ожидаемому")
    @Feature("Testing 99-bottles-of-beer.net")
    @Story("Name of the menu")
    public void test_TC_11_02() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "D:\\IDEAProjects\\3 QAFOREVERYONE\\Web_Tests_Selenium_TestNG_Java\\src\\test\\resources\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement lastOfMenu = driver.findElement(By.cssSelector("#footer [href='/submitnewlanguage.html']"));
        String actualResult = lastOfMenu.getText();
        String expectedResult = "Submit new Language";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

}
