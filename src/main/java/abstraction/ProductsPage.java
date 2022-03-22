package abstraction;

import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class ProductsPage extends HomePage{
    private static final  String ProductsKledingURI = "index.php?id_category=3&controller=category&id_lang=2";
    private static final String ProductsAccessoiresURI = "index.php?id_category=6&controller=category&id_lang=2";
    private static final String ProductsKunstURI = "index.php?id_category=9&controller=category&id_lang=2";
    private static final String ProductsPolteqURI = "index.php?id_category=10&controller=category&id_lang=2";
    private static final String ProductsListProductName = "//*[@id='js-product-list']/div[1]/*/div/div[1]/h2/a";

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage(){
        super(driver);

    }

    public void clickProductByDescription(String productDescription){
        String xpath = ProductsListProductName + "[normalize-space() = '" + productDescription + "']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public void gotToProduct(String product){
        String uri = getUri(product);
        String server = Environment.valueOf(System.getProperty("env")).getServer();
        String url = "https://" + server + "/" + getUri(product);
        System.out.println(url);

        driver.get(url);

    }

    private String getUri(String product){
        product = product.toLowerCase();
        switch(product){
            case "kleding":
                return ProductsKledingURI;
            case "accessoires":
                return ProductsAccessoiresURI;
            case "kunst":
                return ProductsKunstURI;
            case "polteq":
                return ProductsPolteqURI;

        }
        return product + " is not a known case for a productspage......... (slampamper)";
    }

    public static ProductsPage getProductsPage(String product) {
        ProductsPage pp = getProductsPage();
        return pp;
    }

}
