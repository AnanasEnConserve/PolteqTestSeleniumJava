package steps;

import abstraction.PageObject;
import helpers.BrowserDriver;
import helpers.TimeStampHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration;
import java.util.Properties;

public class SetupTeardown extends GeneralTest{



    @Before
    public void setup(Scenario scenario){
        System.out.println("running before ");
        Properties properties = System.getProperties();
        //Print some information about the test being run
        System.out.println("Running scenario " + scenario.getName());

        /*
        Below steps are only for FE tests and can be skipped in API test
        No selenium driver is required for API tests
         */
        if (!scenario.getSourceTagNames().contains("@api")) {
        System.out.println("userdir" + System.getProperty("user.dir"));
        System.out.println("Driver: " + System.getProperty("driver"));
        //Get driver
        driver = DriverManager.getDriver(BrowserDriver.valueOf(System.getProperty("driver")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

            //Set driver in POM
            new PageObject(driver);
            //Load initial page
            driver.get(environment.getApplicationUrl());
            driver.manage().window().fullscreen();
        }
    }


    @After
    public static void teardown(Scenario scenario){

        System.out.println("running after");

        System.out.println("Ending scenario " + scenario.getName());
        System.out.println("Status " + scenario.getStatus());

        if (!scenario.getSourceTagNames().contains("@api")) {
            //Take screenshot if test failed (only relevant for FE tests)
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failed test \"" + scenario.getName() + "\" at " + TimeStampHelper.now());
            }


            //close session
            driver.close();
            driver.quit();
        }
    }



}
