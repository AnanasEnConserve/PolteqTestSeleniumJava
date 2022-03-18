package abstraction;

import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailsPage extends HomePage{
    private static final By ProductName = By.xpath("//*[@id='main']/div[1]/div[2]/h1");
    private static final By ProductPrice = By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/div[1]/div/span");
    private static final By ProductDescription = By.xpath("//*[@id='main']/div[1]/div[2]/div[2]/div[1]/p/span");

    public ProductsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsDetailsPage(){
        super(driver);
    }

    public String getProductName(){
        return driver.findElement(ProductName).getText();
    }

    public String getPrice() {
        return driver.findElement(ProductPrice).getText();
    }

    public String getProductDescription() {
        return driver.findElement(ProductDescription).getText();
    }
}
