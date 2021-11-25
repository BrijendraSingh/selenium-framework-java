package bps.factory;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    public WebDriver getWebdriver(BrowserType type){
        switch(type){
            case CHROME:
                return new ChromeDriverSetup().init();
            case FIREFOX:
                return new FirefoxDriverSetup().init();
            case REMOTE:
                return new RemoteDriverSetup().init();    
        }
        throw new Error("Invalid Browser type <"+ type + ">");
    }    
}
