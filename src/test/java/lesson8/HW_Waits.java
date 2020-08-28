package test.java.lesson8;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class HW_Waits {
    WebDriver driver;
    WebDriver wait;


    By enterButton = By.xpath("//a [@class = 'header-topline__user-link link-dashed']");
    By registrationButton = By.xpath("//a [@class = 'auth-modal__register-link']");
    By surname = By.xpath("//input[@formcontrolname='surname']");
    By name = By.xpath("//input[@formcontrolname='name']");
    By email = By.xpath("//input[@formcontrolname='username']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By enterBy = By.xpath("//button[@type='submit']");

    String expectedColor = "rgb(248, 65, 71)";
    String expectedColor3 = "rgb(210, 210, 210)";
    String expectedColor4 = "rgb(210, 210, 210)";

    //WebElement name = driver.findElement(By.xpath("//input[@formcontrolname='name']");
    //String actualColor = name.getCssValue("border-color");


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrom.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);

    }


    @Test
    public void test() throws InternalException, InterruptedException {
        driver.get("https://rozetka.com.ua/");

        driver
                .findElement(enterButton)
                .click();
        driver
                .findElement(registrationButton)
                .click();

        driver
                .findElement(surname)
                .click();

        driver
                .findElement(name)
                .click();

        driver
                .findElement(email)
                .click();

        driver
                .findElement(password)
                .click();

        driver
                .findElement(enterBy)
                .click();

        String actualColor1 = driver
                .findElement(name)
                .getCssValue("border-color");
        String actualColor2 = driver
                .findElement(name)
                .getCssValue("border-color");
        String actualColor3 = driver
                .findElement(name)
                .getCssValue("border-color");
        String actualColor4 = driver
                .findElement(name)
                .getCssValue("border-color");

        assertEquals(actualColor1,expectedColor);
        assertEquals(actualColor2,expectedColor);
        assertEquals(actualColor3,expectedColor);
        assertEquals(actualColor4,expectedColor);

    }

    @Test
    public void test_2() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        driver
                .findElement(enterButton)
                .click();
        driver
                .findElement(registrationButton)
                .click();
        driver
                .findElement(surname)
                .click();
        driver
                .findElement(name)
                .click();

        driver.findElement(email)
                .sendKeys("vloa@gmail.com");

        driver.findElement(password)
                .sendKeys("Natre2145");

        driver.findElement(enterBy)
                .click();

        String actualColor1 = driver
                .findElement(surname)
                .getCssValue("border-color");
        String actualColor2 = driver
                .findElement(name)
                .getCssValue("border-color");
        String actualColor3 = driver
                .findElement(email)
                .getCssValue("border-color");
        String actualColor4 = driver
                .findElement(password)
                .getCssValue("border-color");

        System.out.println(actualColor2);
        assertEquals(actualColor1,expectedColor);
        assertEquals(actualColor2,expectedColor);
        assertEquals(actualColor3,expectedColor3);
        assertEquals(actualColor3,expectedColor4);


    }


}





