package steps;

import abstraction.HomePage;
import abstraction.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFeature extends GeneralTest{

    private HomePage homePage;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage(){
        homePage = PageObject.getHomePage();
        System.out.println("Added breakpoints here!!!!!!!");
        softAssertions.assertThat(homePage.isHeaderLoaded()).as("Did not see header but expected to").isTrue();
        softAssertions.assertAll();
    }

    @Then("I should be able to click the button")
    public void daw(){
        homePage.signUp("Jan", "12345");
    }





    @Then("I should be shown the kleding selection")
    public void iShouldBeShownTheKledingSelection() {
    }

    @When("I click on kleding")
    public void iClickOnKleding() {
        homePage.clickOnKledingButton();
    }

    @When("I click on kunst")
    public void iClickOnKunst() {
        homePage.clickOnKunstButton();
    }

    @When("I click on accessoires")
    public void iClickOnAccessoires() {
        homePage.clickOnAccessoiresButton();
    }

    @When("I click on Polteq")
    public void iClickOnPolteq() {
        homePage.clickOnPolteqButton();
    }

    @Then("Main header should be shown with the text {string}")
    public void itemsShouldBeShownWithTheText(String onderwerp) {
        System.out.println("Searching for onderwerp with: " + onderwerp);
        System.out.println(homePage.getMainHeaderText());
        assert(homePage.getMainHeaderText().equals(onderwerp));
    }


}
