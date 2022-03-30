package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apiOne extends GeneralTest {

    @Given("I log in with valid credentials")
    public Response attemptAccessWithValidCredentials(){
        return RestAssured.given().auth()
                .basic(apiKey, "")
                .when()
                .get(environment.getApiUrl() + "/api")
                .then().extract().response();
    }

    @Then("I should get a {int} response")
    public void iShouldGetA200Response(int expectedResponse){
        softAssertions.assertThat(attemptAccessWithValidCredentials().getStatusCode()).as("Server response different than expected").isEqualTo(expectedResponse);
        softAssertions.assertAll();
    }

}
