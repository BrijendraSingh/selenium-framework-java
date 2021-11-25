package bps.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverSetup {
    WebDriver driver;
    public ChromeDriverSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }  
    
    public WebDriver init(){
        return driver;
    }
}
