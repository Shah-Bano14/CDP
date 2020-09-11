package fta.practice.Shah;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class RestAssuredHomeTask4Updated extends BaseClass {

	@Test
	public void employee_test1_get() {
		setupDone("http://localhost:3000", "");
		responseSpecification.statusCode(200);
		Response response = given().spec(requestSpecification).when().get("/posts").then().spec(responseSpecification)
				.assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK")
				.contentType("application/json;charset=utf-8").extract().response();
		List<String> idList = response.path("id");
		System.out.println(idList);

	}

	@Test
	public void employee_test6_delete() {

		setupDone("http://localhost:3000", "");
		responseSpecification.statusCode(200);
		given().spec(requestSpecification).when().delete("/posts/3").then().spec(responseSpecification).assertThat()
				.statusLine("HTTP/1.1 200 OK");
		Response response = given().spec(requestSpecification).when().get("/posts").then().spec(responseSpecification)
				.assertThat().statusLine("HTTP/1.1 200 OK").contentType("application/json;charset=utf-8").extract()
				.response();
		List<String> idList = response.path("id");
		System.out.println(idList);
		assertEquals(idList.contains("3"), false);

	}

	@Test
	public void employee_test2_3_post() throws JsonProcessingException {

		setupDone("http://localhost:3000", "");
		responseSpecification.statusCode(201);
		DemoClass demo = new DemoClass(144, "json-server", "Shah_assess");
		/*
		 * ObjectMapper mapper = new ObjectMapper(); // Converting the Object to
		 * JSONString String jsonString = mapper.writeValueAsString(demo);
		 */
		given().spec(requestSpecification).body(demo).when().post("/posts").then().spec(responseSpecification)
				.assertThat().statusLine("HTTP/1.1 201 Created").statusCode(201);

		responseSpecification.statusCode(200);
		Response response = given().spec(requestSpecification).when().get("/posts").then().spec(responseSpecification)
				.assertThat().statusLine("HTTP/1.1 200 OK").statusCode(200)
                .extract().response();
		List<String> authors = response.path("author");
		System.out.println(authors);
		assertEquals(authors.contains("Shah_assess"), true);

	}

	@Test
	public void employee_test4_update() {
		setupDone("http://localhost:3000", "");
		DemoClass demo = new DemoClass(2, "json-server", "Shah_check_latest");

		given().spec(requestSpecification).body(demo).when().put("/posts/2").then().assertThat()
				.statusLine("HTTP/1.1 200 OK").statusCode(200).contentType("application/json;charset=utf-8");
		Response response = given().spec(requestSpecification).when().get("/posts").then().assertThat()
				.statusLine("HTTP/1.1 200 OK").statusCode(200).contentType("application/json;charset=utf-8").extract()
				.response();

		// assertEquals(response.path("findAll{it.id}.size()"), 2);
		List<String> authors = response.path("author");
		System.out.println(authors);
		assertEquals(authors.contains("Shah_Bano_new "), true);

	}

	@Test
	public void employee_test1_get2() {

		get("employees").then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK")
				.contentType("application/json;charset=utf-8").body("data.findAll{it.id}", hasSize(24));

	}

}
