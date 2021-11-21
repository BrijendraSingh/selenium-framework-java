package bps.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseAction {
    WebDriver driver;
    public BaseAction(WebDriver driver){
        this.driver = driver;
    }

    public void click(By by){
        driver.findElement(by).click();
    }

    public void sendKeys(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public String getText(By by){
        return driver.findElement(by).getText().toString();
    }
    
}
