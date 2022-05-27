
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HW11 {

    /**
     TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу
     пользователь видит заголовок 99 Bottles of Beer

     Шаги:
     1. Открыть вебсайт на базовой странице
     2. Считать заголовок в правом верхнем углу
     3. Подтвердить, что текст заголовка соответствует ожидаемому
     4. Закрыть браузер
     */

    @Test
    public void test_TC_11_01() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement title = driver.findElement(By.cssSelector("#header h1"));

        String actualResult = title.getText();
        String expectedResult = "99 Bottles of Beer";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     TC_11_02 Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language

     Шаги:
     1. Открыть вебсайт на базовой странице
     2. Считать название последнего пункта меню
     3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
     4. Закрыть браузер
     */

    @Test
    public void test_TC_11_02() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
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

    /**
     TC_11_03 Подтвердите, что на странице по базовой ссылке последний пункт меню имеет
     подзаголовок Submit new Language

     Шаги:
     1. Открыть вебсайт на базовой странице
     2. Нажать на пункт меню Submit new Language
     3. Считать название подзаголовка последнего пункта меню
     4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
     5. Закрыть браузер
     */

    @Test
    public void test_TC_11_03() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement submitNewLanguage = driver.findElement(By.xpath("//*[@id='menu']/li[6]/a"));
        submitNewLanguage.click();

        WebElement subTitleLastOfMenu = driver.findElement(By.cssSelector("[href='./submitnewlanguage.html']"));
        String expectedResult = subTitleLastOfMenu.getText();

        String actualResult = "Submit New Language";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     TC_11_04 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html ,
     первый пункт подменю называется 0-9

     Шаги:
     1. Открыть вебсайт на странице
     2. Считать название первого подзаголовка
     3. Подтвердить, что название подменю соответствует ожидаемому
     4. Закрыть браузер
     */

    @Test
    public void test_TC_11_04() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/abc.html";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement firstSubMenu = driver.findElement(By.cssSelector("#submenu [href='0.html']"));
        String actualResult = firstSubMenu.getText();
        String expectedResult = "0-9";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     TC_11_06 Подтвердите, что имена создателей сайта:
     Oliver Schade
     Gregor Scheithauer
     Stefan Scheler

     Шаги:
     Напишите самостоятельно (найдите информацию о создателях на сайте,
     и опишите шаги для навигации и исполнения тест кейса)
     */

    @Test
    public void test_TC_11_06() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement team = driver.findElement(By.xpath("//*[@id='submenu']/li[1]/a"));
        team.click();

        WebElement oliver = driver.findElement(By.xpath("//h3[1]"));
        WebElement gregor = driver.findElement(By.xpath("//h3[2]"));
        WebElement stefan = driver.findElement(By.xpath("//h3[3]"));
        String actualResult1 = oliver.getText();
        String actualResult2 = gregor.getText();
        String actualResult3 = stefan.getText();
        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);

        driver.quit();
    }

    /**
     TC_11_07 Придумайте и автоматизируйте свой собственный тест кейс на сайте http://www.99-bottles-of-beer.net/
     */

    @Test
    public void test_TC_11_07() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement song = driver.findElement(By.cssSelector("[href='lyrics.html']"));
        song.click();
        WebElement titleSong = driver.findElement(By.cssSelector("#main h2"));
        String actualResult = titleSong.getText();
        String expectedResult = "Lyrics of the song 99 Bottles of Beer";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     TC_11_11 Подтвердите, что если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
     пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях, будет показана ошибка
     Error: Precondition failed - Incomplete Input.

     Шаги:
     1. Открыть вебсайт на странице
     2. Нажать на кнопку Submit Language
     3. Подтвердить, что на странице показана ошибка
     4. Подтвердить, что текст ошибки соответствует ожидаемому
     5. Закрыть браузер
     */

    @Test
    public void test_TC_11_11() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement submitLanguage = driver.findElement(By.name("submitlanguage"));
        submitLanguage.click();

        WebElement error = driver.findElement(By.cssSelector("#main p"));
        String actualResult = error.getText();
        String expectedResult = "Error: Precondition failed - Incomplete Input.";
        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    /**
     TC_11_12 Precondition: Если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
     пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях,
     будет показана ошибка с текстом
     Error: Precondition failed - Incomplete Input.

     Подтвертите, что в тексте ошибки слова Error, Precondition, Incomplete и Input написаны с большой буквы,
     а слово failed  написано  с маленькой буквы.
     Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .

     Шаги:
     1. Открыть вебсайт на странице
     2. Нажать на кнопку Submit Language
     3. Считать текст ошибки
     4. Подтвердить requirenments
     5. Закрыть браузер
     */

    @Test
    public void test_TC_11_12() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement submitLanguage = driver.findElement(By.name("submitlanguage"));
        submitLanguage.click();

        WebElement error = driver.findElement(By.cssSelector("#main p"));


        String expectedResult1 = "E";
        String expectedResult2 = "P";
        String expectedResult3 = "I";
        String expectedResult4 = "I";
        String expectedResult5 = "f";
        String expectedResult6 = ":";
        String expectedResult7 = "-";
        String expectedResult8 = ".";

        Assert.assertEquals(error.getText().substring(0,1), expectedResult1);
        Assert.assertEquals(error.getText().substring(7,8), expectedResult2);
        Assert.assertEquals(error.getText().substring(29,30), expectedResult3);
        Assert.assertEquals(error.getText().substring(40,41), expectedResult4);
        Assert.assertEquals(error.getText().substring(20,21), expectedResult5);
        Assert.assertEquals(error.getText().substring(5,6), expectedResult6);
        Assert.assertEquals(error.getText().substring(27,28), expectedResult7);
        Assert.assertEquals(error.getText().substring(45), expectedResult8);

        driver.quit();
    }

    /**
     TC_11_13 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
     в первом пункте списка пользователь видит текст
     IMPORTANT: Take your time! The more carefully you fill out this form
     (especially the language name and description), the easier it will be for us and the faster your
     language will show up on this page. We don't have the time to mess around with fixing your descriptions etc.
     Thanks for your understanding.

     Шаги:
     1. Открыть вебсайт на странице
     2. Считать текст
     3. Подтвердить, что текст соответствует ожидаемому
     4. Закрыть браузер
     */

    @Test
    public void test_TC_11_13() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement submitLanguage = driver.findElement(By.name("submitlanguage"));
        submitLanguage.click();

        WebElement text = driver.findElement(By.xpath("//div[@id='main']/ul/li[1]"));
        String actualResult = text.getText();
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this "
                + "form (especially the language name and description), the easier it will "
                + "be for us and the faster your language will show up on this page. We don't "
                + "have the time to mess around with fixing your descriptions etc. Thanks for "
                + "your understanding.";

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     TC_11_14 Подтвердите, что нажав на пункт меню Browse Languages, пользователь увидит таблицу
     со следующими названиями для первого и второго столбцов:
     Language
     Author

     Шаги:
     1. Открыть вебсайт на базовой странице
     2. Нажать на пункт меню Browse Languages
     3. Считать названия первого и второго столбцов таблицы
     3. Подтвердить, что названия соответствует ожидаемым
     4. Закрыть браузер
     */

    @Test
    public void test_TC_11_14() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement browseLanguage = driver.findElement(By.xpath("//ul[@id='menu']/li[2]"));
        browseLanguage.click();

        WebElement column1 = driver.findElement(By.cssSelector("#category th:nth-child(1)"));
        String actualResult1 = column1.getText();
        String expectedResult1 = "Language";
        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement column2 = driver.findElement(By.cssSelector("#category th:nth-child(2)"));
        String actualResult2 = column2.getText();
        String expectedResult2 = "Author";
        Assert.assertEquals(actualResult2, expectedResult2);
        driver.quit();
    }

    /**
     TC_11_15 Подтвердите, что на странице по базовой ссылке  пользователь НЕ увидит новые комментарии,
     если нажмет на пункты меню Top List → New Comments

     Шаги:
     Придумать самостоятельно.

     */

    @Test
    public void test_TC_11_15() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement topList = driver.findElement(By.cssSelector("#footer a:nth-child(4)"));
        topList.click();

        WebElement newComments = driver.findElement(By.cssSelector("#submenu li:last-child"));
        newComments.click();

        WebElement empty = driver.findElement(By.cssSelector("#main p"));
        String actual = empty.getText();
        String expected = "";
        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    /**
     TC_11_21 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
     пользователь видит предупреждение IMPORTANT:, написанное белыми буквами bold шрифтом на красном фоне,
     и что все буквы - capital

     Шаги:
     1. Открыть вебсайт на странице
     2. Считать слово IMPORTANT: из списка
     3. Подтвердить requirenments
     4. Закрыть браузер
     */

    @Test
    public void test_TC_11_16() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedColor = "background-color: red; color: white;";
        String expected = "IMPORTANT:";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement important = driver.findElement(By.cssSelector("li span"));
        String actualColor = important.getAttribute("style");
        String actual = important.getText();

        Assert.assertEquals(actualColor, expectedColor);
        Assert.assertEquals(actual, expected);

        driver.quit();
    }
}
