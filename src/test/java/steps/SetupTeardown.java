package steps;

import helpers.BrowserDriver;
import helpers.Environment;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class SetupTeardown {

    public static WebDriver driver;
    public static WebDriverManager wdm;

    @Before
    public void setup(Scenario scenario){
        System.out.println("running before ");
        //Get driver
        driver = DriverManager.getDriver(BrowserDriver.valueOf(System.getProperty("driver")));

        //Print some information about the test being run
        System.out.println("Running scenario " + scenario.getName());

        //Load initial page
        driver.get(Environment.valueOf(System.getProperty("env")).getApplicationUrl());
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
