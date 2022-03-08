package steps;

import abstraction.PageObject;
import helpers.BrowserDriver;
import helpers.Environment;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class SetupTeardown {

    public static WebDriver driver;

    @Before
    public void setup(Scenario scenario){
        System.out.println("running before ");
        //Get driver
        driver = DriverManager.getDriver(BrowserDriver.valueOf(System.getProperty("driver")));

        //Print some information about the test being run
        System.out.println("Running scenario " + scenario.getName());

        //Set driver
        new PageObject(driver);
        //Load initial page
        driver.get(Environment.valueOf(System.getProperty("env")).getApplicationUrl());
        driver.manage().window().fullscreen();
    }


    @After
    public static void teardown(Scenario scenario){

        System.out.println("running after");

        System.out.println("Ending scenario " + scenario.getName());
        System.out.println("Status " + scenario.getStatus());

        //close session
        driver.close();
        driver.quit();

    }



}
