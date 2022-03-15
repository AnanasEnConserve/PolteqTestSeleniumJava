package helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class WaitAction {


    public static void WaitAndClick(WebDriver driver, int timeInSeconds, By locator){
        WaitAction.WaitForElementToBeActive(driver, timeInSeconds, locator);

        for(int attempts=0; attempts<=1000; attempts++){
            try{
                driver.findElement(locator).click();
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


    public static void WaitForVisibleElement(WebDriver driver, int timeInSeconds, By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeInSeconds))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    public static void WaitForElementToBeActive(WebDriver driver, int timeInSeconds, By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeInSeconds))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
    }

    public static void WaitAndSendkeys(WebDriver driver, int timeInSeconds, By locator, String keys){
        WaitAction.WaitForElementToBeActive(driver, timeInSeconds, locator);

        for(int attempts=0; attempts<=1000; attempts++){
            try{
                driver.findElement(locator).sendKeys(keys);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
