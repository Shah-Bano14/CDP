package fta.practice.Shah;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class RestAssuredHomeTask03 {

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://events.epam.com/api/";
		RestAssured.basePath = "v2";
		RestAssured.requestSpecification = new RequestSpecBuilder().setContentType("application/json").build();

	}

	@Test
	public void getNamesInEnglish() {

		Response response = given().spec(requestSpecification).when().get("/events").then().extract().response();
		List<String> titles = response.path("events.findAll{it.language=='En'}.title");
		System.out.println(titles);
		assertEquals(response.statusCode(), 200);
		assertEquals(titles.contains("EPAM IT Nights presents Java Zurich"), true);

		// method 2
		/*
		 * given(). baseUri("https://events.epam.com/api/").
		 * when().get("v2/events"). then().assertThat().
		 * //body("events.findAll{it.language=='Ru'}.title",
		 * hasItems("Data Science Meetup","Solution Architecture Day #2"));
		 * body("events.findAll{it.language=='En'}.title",
		 * hasItems("EPAM IT Nights presents Java Zurich"));
		 */
	}

}
