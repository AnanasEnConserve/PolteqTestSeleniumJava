package steps;

import helpers.Environment;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

public class GeneralTest {
    //Alle globale variabelen hier definieren
    protected static final SoftAssertions softAssertions = new SoftAssertions();
    protected static WebDriver driver;
    protected Environment environment = Environment.valueOf(System.getProperty("env"));

    /*
    Request spec - voor API calls
     */

}
