package bps.elements;

import org.openqa.selenium.By;

public interface IErrorElements {
    By uniqueUserError_msg = By.className("error");
    By uniqueRepeatPasswordError = By.cssSelector("mat-error.mat-error");
}
