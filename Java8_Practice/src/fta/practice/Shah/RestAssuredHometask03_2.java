package fta.practice.Shah;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.number.OrderingComparison.greaterThan;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;

public class RestAssuredHometask03_2 {

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "http://api.openweathermap.org/";
		RestAssured.basePath = "data/2.5/";
		RestAssured.requestSpecification = new RequestSpecBuilder().setContentType("application/json").build();

	}

	@Test
	public void getWeatherData() {

		Response response = given().spec(requestSpecification).when()
				.get("weather?q=hyderabad&appid=9185b7a783c125be9335848be77501cf").then().extract().response();
		assertEquals(response.statusCode(), 200);

		String details = response.asString();
		System.out.println(details);

		float longitude = response.path("coord.lon");
		float latitude = response.path("coord.lat");

		response = given().spec(requestSpecification).when()
				.get("weather?lat=" + latitude + "&lon=" + longitude + "&appid=9185b7a783c125be9335848be77501cf").then()
				.assertThat().body("name", equalTo("Hyderabad")).body("sys.country", equalTo("IN"))
				.body("main.temp_min", greaterThan(0.0f)).body("main.temp", greaterThan(0.0f)).extract().response();
		System.out.println(response.asString() + "verified");

		// method two
		/*
		 * given(). baseUri("http://api.openweathermap.org/data/2.5/"). when().
		 * get(
		 * "weather?lat=17.38&lon=78.47&appid=9185b7a783c125be9335848be77501cf")
		 * .
		 * 
		 * then().
		 * 
		 * assertThat(). body("name" ,equalTo("Hyderabad")).
		 * body("sys.country",equalTo("IN")).
		 * body("main.temp_min",greaterThan(0.0f)).
		 * body("main.temp",greaterThan(0.0f));
		 */

		/*
		 * assertEquals(response.path("name"), "Hyderabad");
		 * assertEquals(response.path("sys.country"), "IN");
		 * assertEquals(response.path("main.temp_min"),greaterThan(0));
		 * assertEquals(response.path("main.temp"),greaterThan(0));
		 */

	}

}
