package bps;

import org.testng.annotations.Test;
import bps.setup.BaseTest;

// email address: laverna.dubuque@hotmail.com
// Password: uvygrjoa

public class RegistrationTest extends BaseTest{
    private String error_msg = "Email must be unique";
    @Test
    public void UnstructuredTest(){
        banner().dismissBanner();
        customerCan().openLoginScreen().register();
        error().validateError(error_msg);  
    }   
}