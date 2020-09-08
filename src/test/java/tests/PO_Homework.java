package test.java.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PO_Homework {
    WebDriver driver;
    HomePage homePage;
    WebDriverWait wait;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrom.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 10, 550);
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test1() throws InterruptedException {
        homePage.open();
        homePage.clickInput();
        WebElement inputButton = driver.findElement(By.xpath("//input[@class = 'search-form__input ng-untouched ng-pristine ng-valid']"));
        inputButton.sendKeys("iPhone");
        inputButton.sendKeys(Keys.ENTER);
        //Thread.sleep(8000);

        List<WebElement> goods = driver.findElements(By.cssSelector("span.goods-tile__title"));
        for (WebElement good : goods) {
            String actualText = good.getText();
            assertTrue(actualText.contains("iPhone"));
            //System.out.println("qq");
        }
    }


        @Test
        public void test2 () throws InterruptedException {
            homePage.open();
            homePage.clickInput();
            WebElement inputButtons = driver.findElement(By.xpath("//input[@class = 'search-form__input ng-untouched ng-pristine ng-valid']"));
            inputButtons.sendKeys("Samsung");
            inputButtons.sendKeys(Keys.ENTER);
            //Thread.sleep(8000);

            List<WebElement> gods = driver.findElements(By.cssSelector("span.goods-tile__title"));
            for (WebElement good : gods) {
                String actualText = good.getText();
                assertTrue(actualText.contains("Samsung"));
                //System.out.println("qq");
            }
        }


        @AfterMethod
        public void tearDown () {
            driver.quit();
        }
    }

