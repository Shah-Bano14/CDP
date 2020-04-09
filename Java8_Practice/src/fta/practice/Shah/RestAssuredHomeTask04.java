package fta.practice.Shah;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.hasSize;

import org.apache.http.HttpStatus;

import org.testng.annotations.Test;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.testng.Assert.*;
import junit.framework.Assert;

import java.util.List;

public class RestAssuredHomeTask04 {

	 
	    
	    private RequestSpecification requestSpecification = new RequestSpecBuilder().
	            setBaseUri("http://dummy.restapiexample.com/").
	            setBasePath("api/v1").
	            setContentType(ContentType.JSON).
	            build();

	    private ResponseSpecification responseSpecification = new ResponseSpecBuilder().
	            expectStatusCode(HttpStatus.SC_OK).
	            expectContentType(ContentType.JSON).
	            build();

	 /*   @BeforeClass
	    public void setUp(){
	   
	        RestAssured.baseURI = "http://dummy.restapiexample.com/";
	        RestAssured.basePath = "api/v1";
	        RestAssured.requestSpecification = new RequestSpecBuilder().
	                setContentType("application/json").build();

	        RestAssured.responseSpecification = new ResponseSpecBuilder().
	                                               build();

	    }*/

	    @Test
	    public void employee_test1_get() {

	    	Response response=given().spec(requestSpecification).when().get("/employees").then().spec(responseSpecification) 
	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	    			.contentType("application/json;charset=utf-8")
	    			 .extract().response();      
	    	Assert.assertEquals((int)response.path("data.findAll{it.id}.size()"), 24);

	    }


	    @Test
	    public void employee_test6_delete(){
	          
	    	
	    	given().spec(requestSpecification).when().delete("/delete/69").then().spec(responseSpecification)
	    			.assertThat().statusLine("HTTP/1.1 200 OK");
	    	Response response= given().spec(requestSpecification).when().get("/employees").then().spec(responseSpecification) 
	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	    			.contentType("application/json;charset=utf-8")
	    			 .extract().response();      
	    	assertEquals((int)response.path("data.findAll{it.id}.size()"), 24);


	    }

	    @Test
	    public void employee_test2_3_post(){

	        EmployeeClass emp = new EmployeeClass("Shah new created","50000","23");
	        
	    given().spec(requestSpecification).body(emp).when().post("/create").then().spec(responseSpecification) 
	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	    			.contentType("application/json;charset=utf-8");
	    Response response= given().spec(requestSpecification).when().get("/employees").then().spec(responseSpecification) 
    			.assertThat().statusLine("HTTP/1.1 200 OK")
    			.contentType("application/json;charset=utf-8")
    			 .extract().response();      
    	assertEquals((int)response.path("data.findAll{it.id}.size()"), 24);
    	List<String> emp_names= response.path("data.employee_name");
    	System.out.println(emp_names);
    	assertEquals(emp_names.contains("Garrett Winters"),true);
		
	    }
	    	



	    @Test
	    public void employee_test4_update(){
	    	   EmployeeClass emp = new EmployeeClass("Shah new created","50000","23");
		        
	   	    given().spec(requestSpecification).body(emp).when().put("/update/24").then().spec(responseSpecification) 
	   	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	   	    			.contentType("application/json;charset=utf-8");
	   	    Response response= given().spec(requestSpecification).when().get("/employees").then().spec(responseSpecification) 
	       			.assertThat().statusLine("HTTP/1.1 200 OK")
	       			.contentType("application/json;charset=utf-8")
	       			 .extract().response();     
	   	   
	       	assertEquals((int)response.path("data.findAll{it.id}.size()"), 24);
	       	List<String> emp_names= response.path("data.employee_name");
	       	System.out.println(emp_names);
	       	assertEquals(emp_names.contains("Garrett Winters"),true);
	   		
	    }

	    @Test
	    public void employee_test1_get2() {

	        get("employees")
	                .then()
	                .assertThat()
	                .statusCode(200)
	                .statusLine("HTTP/1.1 200 OK")
	                .contentType("application/json;charset=utf-8")
	                .body("data.findAll{it.id}", hasSize(24));

	    }

}
