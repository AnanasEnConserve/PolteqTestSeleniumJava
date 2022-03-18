package abstraction;

import helpers.WaitAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    /*
    Bys
     */
    private static final By header = By.id("header");
    private static final By nonexistent = By.id("ikbestaniet");
    private static final By signUpButton = By.xpath("//a[@href='https://npto-dev.polteq-testing.com/index.php?controller=my-account']");
    private static final By emailField = By.xpath("//div[contains(@class,'form-group')]//input[@name='email']");
    private static final By passwordField = By.xpath("//input[@type='password']");
    private static final By submitLoginButton = By.id("submit-login");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Boolean isHeaderLoaded(){
        WaitAction.waitForVisibleElement(driver, 10, header);
        return driver.findElement(header).isDisplayed();
    }

    public Boolean isSomethingLoaded(){
        WaitAction.waitForVisibleElement(driver, 10, nonexistent);
        return driver.findElement(nonexistent).isDisplayed();
    }

    public void signUp(String username, String password){
        WaitAction.waitAndClick(driver, 10, signUpButton);
        WaitAction.waitAndSendkeys(driver, 10, emailField, username);
        WaitAction.waitAndSendkeys(driver, 10, passwordField, password);
        WaitAction.waitAndClick(driver, 10, submitLoginButton);
    }



}
