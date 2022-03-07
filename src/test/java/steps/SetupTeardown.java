package steps;

import helpers.BrowserDriver;
import helpers.Environment;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class SetupTeardown {

    public static WebDriver driver;

    @Before
    public void setup(Environment environment, BrowserDriver browserDriver){

        //get driver
        driver = DriverManager.getDriver(browserDriver);
        driver.get(environment.getApplicationUrl());
        driver.manage().window().fullscreen();


    }


    @After
    public static void teardown(){

        //close session
        driver.close();
        driver.quit();

    }



}
