package bps.setup;

import com.github.javafaker.Faker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import bps.actions.Banner;
import bps.actions.ErrorHandeling;
import bps.actions.Registration;
import bps.factory.BrowserFactory;
import bps.factory.BrowserType;

public class BaseTest {

    public WebDriver driver;
    public Faker testData; 

    @BeforeMethod
    public void setup(){
        driver = new BrowserFactory().getWebdriver(BrowserType.CHROME);
        testData= new Faker();
        driver.get("http://localhost:3000/#/");
        // driver.get("https://juice-shop.herokuapp.com/#/");
        driver.manage().window().fullscreen();
    }

    public Registration customerCan(){
        return new Registration(driver);
    }

    public ErrorHandeling error(){
        return new ErrorHandeling(driver);
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
