package bps.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import bps.builder.NewCustomer;
import bps.elements.IRegistrationElements;

public class Registration extends BaseAction implements IRegistrationElements {

    boolean registrationBtnState; 
    public Registration(WebDriver driver){
        super(driver);
     }
     
     public Registration register(NewCustomer customer){
         click(newRegistration_link);
         sendKeys(email_textBox, customer.email);
         sendKeys(password_textBox, customer.password);
         sendKeys(repeatPassword_textBox, customer.repeatPassword);
         click(securityQuestion_dropDown);
         click(securityOptionsMaindenName_options);
         sendKeys(securityAnswer_textBox, customer.maidenName);
         registrationBtnState=click(register_btn);
         return this;
     }

     public Registration openLoginScreen(){
         click(account_link);
         click(login_link);
         return this;
     }

     public Registration checkRegistrationBtnState(boolean btnState){
          Assert.assertEquals(btnState, registrationBtnState);
          return this;  
     }
}
