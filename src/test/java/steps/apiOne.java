package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class apiOne extends GeneralTest {

    @Given("I log in with valid credentials")
    public Response attemptAccessWithValidCredentials(){
        return RestAssured.given().baseUri(environment.getApiUrl() + "/api")
                .when()
                .formParam("username", apiKey)
                .and().formParam("password", "")
                .and().post();
                //.then().log().status();
    }

    @Then("I should get a {int} response")
    public void iShouldGetA200Response(int expectedResponse){
        softAssertions.assertThat(attemptAccessWithValidCredentials().getStatusCode()).as("Server response different than expected").isEqualTo(expectedResponse);
        softAssertions.assertAll();
    }

//
//    public void getAccessWithValidCredentials() {
//
//        RestAssured.given().baseUri(environment.getApiUrl())
//                .and().header().and().post()
//                .then().log().status();
//    }
}
