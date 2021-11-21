package bps.actions;

import org.openqa.selenium.WebDriver;

import bps.elements.IBannerElements;

public class Banner extends BaseAction implements IBannerElements {
    
    public Banner(WebDriver driver){
        super(driver);
    }

    public boolean dismissBanner(){
        return click(dismissBanner);
    }
}
