package abstraction;


import org.openqa.selenium.WebDriver;

public class PageObject {

    protected static WebDriver driver;

    public PageObject(WebDriver driver){
        PageObject.driver = driver;
    }

    public static HomePage getHomePage() {
        return new HomePage(driver);
    }

//    public HomePage getHomepage(){
//        return new HomePage(driver);
//    }

}
