package bps.setup;

import com.github.javafaker.Faker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ErrorCodes;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import bps.actions.Banner;
import bps.actions.Error;
import bps.actions.Registration;
import bps.factory.BrowserFactory;
import bps.factory.BrowserType;

public class BaseTest {
    public WebDriver driver;
    public Faker testData; 
    @BeforeTest
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

    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("Browser closed.. !!");
    } 
    
}
