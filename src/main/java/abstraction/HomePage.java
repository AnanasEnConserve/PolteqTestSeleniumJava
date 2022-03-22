package abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    /*
    Bys
     */
    private static final By header = By.id("header");
    private static final By signUpButton = By.xpath("//a[@href='https://npto-dev.polteq-testing.com/index.php?controller=my-account']");
    private static final By emailField = By.xpath("//div[contains(@class,'form-group')]//input[@name='email']");
    private static final By passwordField = By.xpath("//input[@type='password']");
    private static final By submitLoginButton = By.id("submit-login");

    private static final By selectKledingButton = By.id("category-3");
    private static final By selectKunstButton = By.id("category-9");
    private static final By selectAccessoiresButton= By.id("category-6");
    private static final By selectPolteqButton= By.id("category-10");
    private static final By mainHeader = By.xpath("//*[@id='js-product-list-header']/div/h1");
   

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Boolean isHeaderLoaded(){
        return driver.findElement(header).isDisplayed();
    }


    public void signUp(String username, String password){
        driver.findElement(signUpButton).click();
        driver.findElement(emailField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitLoginButton).click();
    }

    public void clickOnKledingButton() {
        driver.findElement(selectKledingButton).click();
    }
    public void clickOnKunstButton() {
        driver.findElement(selectKunstButton).click();
    }
    public void clickOnAccessoiresButton() {
        driver.findElement(selectAccessoiresButton).click();
    }

    public void clickOnPolteqButton() {
        driver.findElement(selectPolteqButton).click();
    }

    public String getMainHeaderText(){
        return driver.findElement(mainHeader).getText();
    }


}
