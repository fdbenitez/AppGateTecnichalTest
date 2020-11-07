package com.co.appgate.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;

public class ApiGoogleSteps {
    private Response response;
    private int codeStatusResponse;

    @Given("I send request (.*)$")
    public void ia( String url){
        response = SerenityRest
                        .when()
                        .get(url);
        codeStatusResponse = response.getStatusCode();
    }
    @Then("I see the status code (.*)$")
    public void iai(int statusCode){
        assertThat(
                codeStatusResponse,
                        is(greaterThanOrEqualTo(statusCode)));
    }
}
