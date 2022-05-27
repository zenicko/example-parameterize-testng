import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HW12 {

    /**
     * TC_12_01 Подтвердите, что в меню BROWSE LANGUAGES, подменю  J,
     * пользователь может найти описание страницы, на которой перечеслены все программные языки,
     * начинающиеся с буквы J,  отсортированные по названию
     * <p>
     * Шаги:
     * Открыть базовую страницу
     * Нажать на пункт меню BROWSE LANGUAGES
     * Нажать на подменю J
     * Подтвердить, что пользователь видит текст
     * “All languages starting with the letter J are shown, sorted by Language.”
     */

    @Test
    public void TC_12_01() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu li [href='j.html']")).click();

        WebElement text = driver.findElement(By.cssSelector("#main p"));
        Assert.assertEquals(text.getText(), "All languages starting with the letter J are shown, sorted by Language.");
        driver.quit();
    }

    /**
     * TC_12_02 Подтвердите, что в меню BROWSE LANGUAGES, подменю  M,
     * последний программный язык в таблице -  MySQL
     * <p>
     * Шаги:
     * Открыть базовую страницу
     * Нажать на пункт меню BROWSE LANGUAGES
     * Нажать на подменю M
     * Подтвердить, что последний язык программирования на странице - MySQL
     */
    @Test
    public void TC_12_02() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu li [href='m.html']")).click();

        WebElement text = driver.findElement(By.cssSelector("[href='language-mysql-1252.html']"));
        Assert.assertEquals(text.getText(), "MySQL");
        driver.quit();
    }

    /**
     * TC_12_03 Подтвердите, что в меню BROWSE LANGUAGES существует таблица
     * с заголовками Language, Author, Date, Comments, Rate
     */

    @Test
    public void TC_12_03() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        List<WebElement> table = driver.findElements(By.cssSelector("#category tbody tr:first-child"));

        String actualResult = "";
        for (int i = 0; i < table.size(); i++) {
            actualResult += table.get(i).getText();
        }

        Assert.assertEquals(actualResult, "Language Author Date Comments Rate");

        driver.quit();
    }

    /**
     * TC_12_04 Подтвердите, что создатель решения на языке Mathematica - Brenton Bostick,
     * дата обновления решения на этом языке - 03/16/06, и что это решение имеет 1 комментарий
     */
    @Test
    public void TC_12_04() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu li [href='m.html']")).click();

        List<WebElement> math = driver.findElements(By.xpath("//table[@id='category']/tbody/tr[22]"));
        String actualResult = "";
        for (int i = 0; i < math.size(); i++) {
            actualResult += math.get(i).getText();
        }

        Assert.assertEquals(actualResult, "Mathematica Brenton Bostick 03/16/06 1");

        driver.quit();
    }

    /**
     * TC_12_05 Подтвердите, что на сайте существует 10 языков, названия которых начинаются с цифр.
     */
    @Test
    public void TC_12_05() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu [href='0.html']")).click();


        WebElement column1 = driver.findElement(By.cssSelector("td a[href='language-1c-enterprize-805.html']"));
        WebElement column2 = driver.findElement(By.cssSelector("td a[href='language-3code-767.html']"));
        WebElement column3 = driver.findElement(By.cssSelector("td a[href='language-4d-56.html']"));
        WebElement column4 = driver.findElement(By.cssSelector("td a[href='language-4dos-batch-57.html']"));
        WebElement column5 = driver.findElement(By.cssSelector("td a[href='language-4test-58.html']"));
        WebElement column6 = driver.findElement(By.cssSelector("td a[href='language-6502-assembler-2410.html']"));
        WebElement column7 = driver.findElement(By.cssSelector("td a[href='language-6800-assembler-2423.html']"));
        WebElement column8 = driver.findElement(By.cssSelector("td a[href='language-8008-assembler-2438.html']"));
        WebElement column9 = driver.findElement(By.cssSelector("td a[href='language-96-2572.html']"));
        WebElement column10 = driver.findElement(By.cssSelector("td a[href='language-99-804.html']"));


        String expectedResult = column1.getText() + column2.getText() + column3.getText() + column4.getText()
                + column5.getText() + column6.getText() + column7.getText() + column8.getText() + column9.getText()
                + column10.getText();
        String actualResult = "1C Enterprize3code4D4DOS Batch4Test6502 Assembler6800 Assembler8008 Assembler9699";
        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }


    /**
     * TC_12_06 Подтвердите, что если на странице Sign Guestbook http://www.99-bottles-of-beer.net/signv2.html
     * вы заполните все поля формы, но введете случайно сгенерированное трехзначное число в поле  Security Code:
     * , то вы получите сообщение об ошибке  Error: Error: Invalid security code.
     */
    @Test
    public void TC_12_06() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/signv2.html";
        int random_number = 0 + (int) (Math.random() * 999);

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.name("name")).sendKeys("Olga");
        driver.findElement(By.name("email")).sendKeys("a@mail.ru");
        driver.findElement(By.name("captcha")).sendKeys(String.valueOf(random_number));
        driver.findElement(By.name("comment")).sendKeys("asgfh");
        driver.findElement(By.cssSelector("input.button")).click();
        WebElement error = driver.findElement(By.cssSelector("#main > p"));

        Assert.assertEquals("Error: Error: Invalid security code.", error.getText());
        driver.quit();

    }
    /**
     TC_12_07 Выберите любой язык программирования (из меню BROWSE LANGUAGES) и любую версию решения
     (из раздела Alternative Versions, если такой раздел существует  для выбранного языка)
     Подтвердите, что пользователь может сделать закладку на это решение на сайте Reddit
     (нажав на иконку сайта Reddit, пользователь перейдет на Логин страницу сайта Reddit)
     */
    @Test
    public void TC_12_07() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu li [href='h.html']")).click();
        driver.findElement(By.cssSelector("td a[href='language-haxe-1341.html']")).click();
        driver.findElement(By.cssSelector("a[title='reddit']")).click();

        Assert.assertEquals("reddit.com: Log in", driver.getTitle());

        driver.quit();
    }

    /**
     TC_12_08 Подтвердите, что решение на языке Shakespeare входит в топ 20 всех решений,
     в топ 10 решений на Esoteric Languages и в топ 6 решений-хитов. Но решение на языке Shakespeare
     не входит в список топовых решений на реальных языках программирования.
     (Можно написать одним тестом, но так, чтобы все Asserts были в конце теста.
     Или можно написать отдельные тесты на каждый requirenment.)
     */
    @Test
    public void TC_12_08() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/toplist.html']")).click();

        driver.findElement(By.cssSelector("#submenu a[href='./toplist.html']")).click();
        WebElement lenguage = driver.findElement(By.cssSelector("td a[href='language-shakespeare-664.html'"));
        Assert.assertEquals("Shakespeare",lenguage.getText());

        driver.findElement(By.cssSelector("#submenu a[href='./toplist_esoteric.html']")).click();
        WebElement lenguage1 = driver.findElement(By.cssSelector("td a[href='language-shakespeare-664.html'"));
        Assert.assertEquals("Shakespeare",lenguage1.getText());

        driver.findElement(By.cssSelector("#submenu a[href='./tophits.html'")).click();
        WebElement lenguage2 = driver.findElement(By.cssSelector("td a[href='language-shakespeare-664.html'"));
        Assert.assertEquals("Shakespeare",lenguage2.getText());

        driver.quit();
    }


    /**
     TC_12_09 Подтвердите, что существует 6 версий решений на языке программирования Java.
     */

    @Test
    public void TC_12_09() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu li [href='j.html']")).click();
        driver.findElement(By.cssSelector("td a[href='language-java-3.html']")).click();

        WebElement version1 = driver.findElement(By.xpath("//div[@id='main']/p[1]"));
        WebElement version2 = driver.findElement(By.cssSelector("td a[href='language-java-4.html']"));
        WebElement version3 = driver.findElement(By.cssSelector("td a[href='language-java-866.html']"));
        WebElement version4 = driver.findElement(By.cssSelector("td a[href='language-java-1162.html']"));
        WebElement version5 = driver.findElement(By.cssSelector("td a[href='language-java-950.html']"));
        WebElement version6 = driver.findElement(By.cssSelector("td a[href='language-java-1148.html']"));

        Assert.assertEquals("(object-oriented version)",version1.getText());
        Assert.assertEquals("standard version",version2.getText());
        Assert.assertEquals("exception oriented",version3.getText());
        Assert.assertEquals("bytecode-version with loader",version4.getText());
        Assert.assertEquals("Java 5.0 object-oriented version",version5.getText());
        Assert.assertEquals("Singing with Java Speech API",version6.getText());

        driver.quit();
    }

    /**
     TC_12_10 Подтвердите, что самое большое количество комментариев для решений на языке Java
     имеет версия “object-oriented version”
     */
    @Test
    public void TC_12_10() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgapolezaeva/Documents/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("#menu [href='/abc.html']")).click();
        driver.findElement(By.cssSelector("#submenu li [href='j.html']")).click();

        driver.findElement(By.cssSelector("td a[href='language-java-3.html']")).click();
        List <WebElement> comments = driver.findElements(By.cssSelector("div #comments p.comment"));
        Assert.assertEquals(33,comments.size());

        driver.findElement(By.cssSelector("td a[href='language-java-4.html']"));
        List <WebElement> comments1 = driver.findElements(By.cssSelector("div #comments p.comment"));
        Assert.assertEquals(12,comments1.size());

        driver.findElement(By.cssSelector("td a[href='language-java-866.html']"));
        List <WebElement> comments2 = driver.findElements(By.cssSelector("div #comments p.comment"));
        Assert.assertEquals(5,comments2.size());

        driver.findElement(By.cssSelector("td a[href='language-java-1162.html']"));
        List <WebElement> comments3 = driver.findElements(By.cssSelector("div #comments p.comment"));
        Assert.assertEquals(10,comments3.size());

        driver.findElement(By.cssSelector("td a[href='language-java-950.html']"));
        List <WebElement> comments4 = driver.findElements(By.cssSelector("div #comments p.comment"));
        Assert.assertEquals(3,comments4.size());

        driver.findElement(By.cssSelector("td a[href='language-java-1148.html']"));
        List <WebElement> comments5 = driver.findElements(By.cssSelector("div #comments p.comment"));
        Assert.assertEquals(2,comments5.size());

        driver.quit();
    }

}
