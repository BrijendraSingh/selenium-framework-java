package bps.actions;

import org.openqa.selenium.WebDriver;
import bps.elements.IRegistrationElements;

public class Registration extends BaseAction implements IRegistrationElements {

     public Registration(WebDriver driver){
        super(driver);
     }
     
     public Registration register(){
         click(newRegistration_link);
         sendKeys(email_textBox, "laverna.dubuque@hotmail.com");
         sendKeys(password_textBox, "uvygrjoa");
         sendKeys(repeatPassword_textBox, "uvygrjoa");
         click(securityQuestion_dropDown);
         click(securityOptionsMaindenName_options);
         sendKeys(securityAnswer_textBox, "lastName");
         click(register_btn);
         return this;
     }

     public Registration openLoginScreen(){
         click(account_link);
         click(login_link);
         return this;
     }
}
