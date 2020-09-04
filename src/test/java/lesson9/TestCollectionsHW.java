package test.java.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCollectionsHW {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrom.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        wait  = new WebDriverWait(driver, 10 , 550 );
    }
    @Test
    public void test1() {
        driver.get("https://rozetka.com.ua/");
        driver.
                findElement(By.xpath("//input"));
        List<WebElement> goods = driver.findElements(By.cssSelector("[class ='goods-tile__title']"));
        for (WebElement good : goods) {
            String actualGoods = good.getText();
            System.out.println(actualGoods);
        }
    }





    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
