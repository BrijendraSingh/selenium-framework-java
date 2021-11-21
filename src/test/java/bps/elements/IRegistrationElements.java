package bps.elements;

import org.openqa.selenium.By;

public interface IRegistrationElements {
    By account_link = By.xpath("//span[text()=' Account ']");
    By login_link = By.id("navbarLoginButton");
    By newRegistration_link = By.cssSelector("#newCustomerLink a");
    By email_textBox = By.id("emailControl");
    By password_textBox = By.id("passwordControl");
    By repeatPassword_textBox = By.id("repeatPasswordControl");
    By securityQuestion_dropDown = By.cssSelector("div.mat-select-value");
    By securityOptionsMaindenName_options = By.xpath("//span[@class='mat-option-text'][text()[contains(.,'maiden')]]");
    By securityAnswer_textBox = By.id("securityAnswerControl");
    By register_btn = By.id("registerButton");
}
