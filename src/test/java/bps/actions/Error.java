package bps.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import bps.elements.IErrorElements;

public class Error extends BaseAction implements IErrorElements {

    public Error(WebDriver driver) {
        super(driver);
    }

    public void validateError(String error ){
        Assert.assertEquals(getText(error_msg), error);
    }
}
