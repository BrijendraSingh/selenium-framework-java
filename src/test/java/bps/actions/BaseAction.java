package bps.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.function.Predicate;
import org.awaitility.Duration;
import static org.awaitility.Awaitility.await;

public class BaseAction {
    WebDriver driver;
    public final String DEFAULT_VALUE="default";

    public BaseAction(WebDriver driver){
        this.driver = driver;
    }

    public boolean click(By by){
        WebElement ele= waitAndFindElement(by);
        if (ele.isEnabled() && ele.isEnabled()){
            ele.click(); 
            return true;
        }else{
            return false;
        }
    }

    public void sendKeys(By by, String data){
        if(data!=null){
            waitAndFindElement(by).sendKeys(data);
        }else{
            waitAndFindElement(by).sendKeys(DEFAULT_VALUE);    
        }
    }

    public String getText(By by){
        return waitAndFindElement(by).getAttribute("innerText");
    }

    Predicate<WebElement> isElementLocated = WebElement::isDisplayed;

    public WebElement waitAndFindElement(By by){
        await().atMost(Duration.TEN_SECONDS)
            .pollInterval(Duration.ONE_HUNDRED_MILLISECONDS)
            .ignoreExceptions()
            .until(()-> isElementLocated.test(driver.findElement(by)));
        return driver.findElement(by); 
    }
    
}
