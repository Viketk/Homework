package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Waits {
    @Test
    public void test1 () {
        System.setProperty("webdriver.chrom.driver" , "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rozetka.com.ua/");
        driver
                .findElement(By.cssSelector("[class='menu-categories menu-categories_type_main']"))
                .click();

    }
}
