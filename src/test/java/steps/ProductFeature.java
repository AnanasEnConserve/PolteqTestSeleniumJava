package steps;

import abstraction.HomePage;
import abstraction.PageObject;
import abstraction.ProductsPage;
import abstraction.ProductsDetailsPage;
import helpers.Environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ProductFeature extends GeneralTest{
    private ProductsPage productsPage;
    private ProductsDetailsPage productsDetailsPage;

    @Given("I am on the Accessoires page")
    public void iAmOnTheAccessoiresPage(){
        productsPage = PageObject.getProductsPage();
        productsPage.gotToProduct("accessoires");
    }

    @When("I open the product {string} details")
    public void iOpenTheProductDetails(String productname) {
        productsPage.clickProductByDescription(productname);
        productsDetailsPage = new ProductsDetailsPage(productsPage.getDriver());
    }

    @Then("I should see the {string} with a price of {string}")
    public void iShouldSeeTheWithAPriceOf(String productname, String price) {
        assertEquals(productsDetailsPage.getProductName(), productname.toUpperCase());
        assertEquals(productsDetailsPage.getPrice(), price);

    }

    @And("The description should be {string}")
    public void theDescriptionShouldBe(String description) {
        assertEquals(productsDetailsPage.getProductDescription(), description);
    }
}
