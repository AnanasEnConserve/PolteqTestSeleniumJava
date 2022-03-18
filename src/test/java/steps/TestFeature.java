package steps;

import abstraction.HomePage;
import abstraction.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestFeature extends GeneralTest{

    private HomePage homePage;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage(){
        homePage = new HomePage(driver);
        softAssertions.assertThat(homePage.isHeaderLoaded()).as("Did not see header but expected to").isTrue();
        softAssertions.assertAll();
    }

    @Then("I should be able to click the button")
    public void daw(){
        homePage.signUp("Jan", "12345");
    }


    @Then("this should not work")
    public void shouldNotWork(){
        homePage = new HomePage(driver);
        softAssertions.assertThat(homePage.isSomethingLoaded()).as("Did not see header but expected to").isTrue();
        softAssertions.assertAll();
    }



}
