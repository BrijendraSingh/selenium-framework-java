package bps.factory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriverSetup {
    WebDriver driver;
    String url = "http://localhost:4444";

    public RemoteDriverSetup(){
        try {
            driver= new RemoteWebDriver(new URL(url), new ChromeOptions());
        } catch (MalformedURLException e) {
            throw new Error("url <"+ url + "> is not valid");
        }
    }

    public WebDriver init(){
        return driver;
    }
    
}
