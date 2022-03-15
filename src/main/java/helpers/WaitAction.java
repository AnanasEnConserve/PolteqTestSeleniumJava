package helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class WaitAction {


    public static void waitAndClick(WebDriver driver, int timeInSeconds, By locator){
        WaitAction.waitForElementToBeActive(driver, timeInSeconds, locator);

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


    public static void waitForVisibleElement(WebDriver driver, int timeInSeconds, By locator){
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

    public static void waitForElementToBeActive(WebDriver driver, int timeInSeconds, By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeInSeconds))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
    }

    public static void waitAndSendkeys(WebDriver driver, int timeInSeconds, By locator, String keys){
        WaitAction.waitForElementToBeActive(driver, timeInSeconds, locator);

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
