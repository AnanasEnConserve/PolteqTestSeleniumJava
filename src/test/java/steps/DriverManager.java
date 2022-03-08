package steps;

import helpers.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class DriverManager {

    private static WebDriverManager wdm;

    public static WebDriver getDriver(BrowserDriver browserDriver){
        /*
        NB: When running tests on jenkins it may be required to add a remote webdriver
        This function can be extended as such
        --> If/Else Local Remote --> Remote should return WebdriverManager.chromedriver.GetWebDriver();
        */
        if (browserDriver.getBrowserName().equals("chrome")){
            wdm = WebDriverManager.chromedriver();
            return wdm.create();
        } else if (browserDriver.getBrowserName().equals("firefox")){
            wdm = WebDriverManager.firefoxdriver();
            return wdm.create();
        }
        System.out.println("ERR: Invalid driver selection");
        return null;
    }

}
