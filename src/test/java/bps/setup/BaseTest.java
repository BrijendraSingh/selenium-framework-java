package bps.setup;

import com.github.javafaker.Faker;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import bps.actions.Banner;
import bps.actions.Error;
import bps.actions.Registration;
import bps.factory.BrowserFactory;
import bps.factory.BrowserType;

@Component
public class BaseTest {

    public WebDriver driver;
    public Faker testData; 

    @BeforeMethod
    public void setup(){
        driver = new BrowserFactory().getWebdriver(BrowserType.CHROME);
        testData= new Faker();
        driver.get("http://localhost:3000/#/");
        driver.manage().window().fullscreen();
    }

    public Registration customerCan(){
        return new Registration(driver);
    }

    public Error error(){
        return new Error(driver);
    }

    public Banner banner(){
        return new Banner(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        System.out.println("Browser closed.. !!");
    } 
    
}
