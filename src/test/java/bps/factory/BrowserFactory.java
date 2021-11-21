package bps.factory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
    String url = "http://172.18.0.5:5555";
    public WebDriver getWebdriver(BrowserType type){
        switch(type){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case REMOTE:
            try {
                return new RemoteWebDriver(new URL(url), new ChromeOptions());
            } catch (MalformedURLException e) {
                throw new Error("url <"+ url + "> is not valid");
            }    
        }
        throw new Error("Invalid Browser type <"+ type + ">");
    }    
}
