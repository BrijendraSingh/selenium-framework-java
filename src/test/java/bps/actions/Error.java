package bps.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import bps.elements.IErrorElements;

public class Error extends BaseAction implements IErrorElements {

    public Error(WebDriver driver) {
        super(driver);
    }

    public void validateUniqueUserError(String error_msg ){
        Assert.assertEquals(getText(uniqueUserError_msg), error_msg);
    }

    public void validateUniqueRepeatPasswordError(String error_txt ){
        Assert.assertEquals(getText(uniqueRepeatPasswordError).trim(), error_txt);
    }
}
