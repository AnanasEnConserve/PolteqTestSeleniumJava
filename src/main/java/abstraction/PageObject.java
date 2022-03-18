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

    public static ProductsPage getProductsPage() {
        ProductsPage pp = new ProductsPage(driver);
        return new ProductsPage(driver);
    }

    public WebDriver getDriver(){
        return driver;
    }



//    public HomePage getHomepage(){
//        return new HomePage(driver);
//    }

}
