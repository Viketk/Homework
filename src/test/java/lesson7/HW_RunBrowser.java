package test.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HW_RunBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rozetka.com.ua/");
        By number = By.xpath("//button [@class = 'header-phones__button']");

        Thread.sleep(5000);
        String numberValue = driver.findElement(number).getText();
        System.out.println(numberValue);


        driver.quit();

    }
}
