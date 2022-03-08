package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AuthorizationFeature {

    @Given("I have done this correctly")
    public void test(){
        System.out.println("ok");
    }

    @Then("this should work")
    public void thisshouldwork(){
        System.out.println("yep");
    }

    @Given("aap")
    public void aap(){

    }

}
