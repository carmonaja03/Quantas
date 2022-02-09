package stepDefinition;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WeatherAPISteps {

    private Response response;

    private static final String KEY = "de9ea9e49ce2450da55a5381a85936fd";

    @Given("^I want to get the current weather data for a specific location based on (.*) and (.*) with status code (.*)")
    public void get_current_weather_based_on_lat_and_long(String latitude, String longitude, int expectedStatus) {
        response = RestAssured.given().when()
                .get("https://api.weatherbit.io/v2.0/current?lat="+latitude+"&lon="+longitude+"&key="+KEY+"")
                .then().statusCode(expectedStatus).log().ifError().extract().response();
        System.out.println(response.asString());
    }
    @Given("^I want to get the current weather data for multiple cities in the world with status code (.*)$")
    public void get_current_weather_data_for_multiple_cities(int expectedStatus) {
        response = RestAssured.given().when()
                .get("https://api.weatherbit.io/v2.0/current?cities=4487042,4494942&key="+KEY+"")
                .then().statusCode(expectedStatus).log().ifError().extract().response();
        System.out.println(response.asString());
    }
    @Given("^I want to get the current air quality data for postcode = (.*) with status code (.*)$")
    public void get_current_air_quality_for_a_particular_postcode(int postCode, int expectedStatus) {
        response = RestAssured.given().when()
                .get("https://api.weatherbit.io/v2.0/current/airquality?postal_code="+postCode+"&key="+KEY+"")
                .then().statusCode(expectedStatus).log().ifError().extract().response();
        System.out.println(response.asString());
    }

}
