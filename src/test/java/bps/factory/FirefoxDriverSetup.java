package bps.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverSetup {
    WebDriver driver;
    public FirefoxDriverSetup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public WebDriver init(){
        return driver;
    }
    
}
