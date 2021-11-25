package bps.configuration;

import bps.factory.BrowserType;

public class Browser {
    public static BrowserType getBrowserType(String browserKey){
        switch (browserKey){
            case "chrome":
                return BrowserType.CHROME;
            case "firefox":
                return BrowserType.FIREFOX;
            case "remote":
                return BrowserType.REMOTE;    
        }
        throw new Error("incorrect browser "+ browserKey+" key on config file");
    } 
}
