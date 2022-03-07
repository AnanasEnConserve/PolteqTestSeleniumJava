package steps;

import helpers.BrowserDriver;
import helpers.Environment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class DriverManager {


    public static WebDriver getDriver(BrowserDriver browserDriver){
        if (browserDriver.getBrowserName().equals("chrome")){
            return WebDriverManager.chromedriver().getWebDriver();
        } else if (browserDriver.getBrowserName().equals("firefox")){
            return WebDriverManager.firefoxdriver().getWebDriver();
        }
        System.out.println("ERR: Invalid driver selection");
        return null;
    }

}
