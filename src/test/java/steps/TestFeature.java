package steps;

import abstraction.HomePage;
import abstraction.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestFeature {

    private HomePage homePage;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage(){
        homePage = PageObject.getHomePage();
        homePage.isHeaderLoaded();
    }

    @Then("I should be able to click the button")
    public void daw(){
        homePage.signUp("Jan", "12345");
    }


}
