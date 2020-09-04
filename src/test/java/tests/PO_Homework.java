package test.java.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class PO_Homework {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrom.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);

        homePage = new HomePage(driver);
    }

    @Test
    public void test1() {
        homePage.open();
        homePage.clickInput();
        WebElement inputButton = driver.findElement(By.xpath("//input[@class = 'search-form__input ng-untouched ng-pristine ng-valid']"));
        inputButton.sendKeys("iPhone");
        inputButton.sendKeys(Keys.ENTER);

        List<WebElement> goods = driver.findElements(By.cssSelector("span.goods-tile__title"));
        for (WebElement good : goods) {
            String actualText = good.getText();
            String expectedText = "iphone";

            System.out.println(actualText.contains("iPhone"));
            assertEquals(actualText,expectedText);



        }
    }
    }

