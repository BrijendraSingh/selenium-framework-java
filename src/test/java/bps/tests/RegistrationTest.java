package bps.tests;

import org.testng.annotations.Test;

import bps.builder.NewCustomer;
import bps.setup.BaseTest;

public class RegistrationTest extends BaseTest{
    private final String UNIQUE_USER_ERROR = "Email must be unique";
    private final String UNIQUE_PASSWORD_ERROR = "Passwords do not match";
    
    @Test
    public void testOnlyUniqueRegistration(){
        //Test data setup
        NewCustomer newCustomer = NewCustomer
            .builder()
            .email("laverna.dubuque@hotmail.com")
            .password("uvygrjoa")
            .repeatPassword("uvygrjoa")
            .maidenName("middleName")
            .build();

        //Test    
        banner().dismissBanner();
        customerCan().openLoginScreen().register(newCustomer).checkRegistrationBtnState(true);
        error().validateUniqueUserError(UNIQUE_USER_ERROR);  
    }   

    @Test
    public void testNewRegistrationErrorRepeatPasswordNotProvided(){
        //Test data setup - RepeatPassword is default value
        NewCustomer newCustomer = NewCustomer
            .builder()
            .email("bps.brij@gmail.comm")
            .password("uvygrjoa")
            .maidenName("middleName")
            .build();

        //Test    
        banner().dismissBanner();
        customerCan().openLoginScreen().register(newCustomer).checkRegistrationBtnState(false);
        error().validateUniqueRepeatPasswordError(UNIQUE_PASSWORD_ERROR);  
    } 
}