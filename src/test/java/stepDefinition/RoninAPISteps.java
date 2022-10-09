package stepDefinition;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RoninAPISteps {

    private Response response;

    @Given("^i want to get staked address from \"(.*)\"")
    public void iWantToGetStakedTokenByAddress(String token) {
        response = RestAssured.given().when()
                .get("https://ronin.rest/katana/pools/"+token+"")
                .then().statusCode(200).log().ifError().extract().response();
        System.out.println(response.asString());
    }
}
