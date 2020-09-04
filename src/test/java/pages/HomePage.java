package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;



    public  HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 550);

    }
    public HomePage open(){
        driver.get("https://rozetka.com.ua/");
        return this;
    }
    public HomePage clickInput(){
        WebElement inputButton = driver.findElement(By.xpath("//input[@class = 'search-form__input ng-untouched ng-pristine ng-valid']"));
        return this;




    }
}
