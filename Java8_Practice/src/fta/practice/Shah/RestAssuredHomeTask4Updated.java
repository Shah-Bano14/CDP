package fta.practice.Shah;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RestAssuredHomeTask4Updated extends BaseClass{

	 @Test
	    public void employee_test1_get() {
            setupDone("http://localhost:3000","");
           
	    	Response response=given().spec(requestSpecification).when().get("/posts").then().spec(responseSpecification) 
	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	    			.contentType("application/json;charset=utf-8")
	    			 .extract().response();      
	    	assertEquals((int)response.path("findAll{it.id}.size()"), 3);

	    }


	    @Test
	    public void employee_test6_delete(){
	          
	    	setupDone("http://localhost:3000","");
	    	given().spec(requestSpecification).when().delete("/posts/14").then().spec(responseSpecification)
	    			.assertThat().statusLine("HTTP/1.1 200 OK");
	    	Response response= given().spec(requestSpecification).when().get("/posts").then().spec(responseSpecification) 
	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	    			.contentType("application/json;charset=utf-8")
	    			 .extract().response();      
	    	assertEquals((int)response.path("findAll{it.id}.size()"), 1);


	    }

	    @Test
	    public void employee_test2_3_post(){
            
	    	setupDone("http://localhost:3000","");
	    	 DemoClass demo = new DemoClass(6,"json-server","Shah_Bano_new ");
	        
	    given().spec(requestSpecification).body(demo).when().post("/posts").then().spec(responseSpecification) 
	    			.assertThat()
	    			//.statusLine("HTTP/1.1 201 OK")
	    			.statusCode(201)
	    			.contentType("application/json;charset=utf-8");
	    Response response=given().spec(requestSpecification).when().get("/posts").then()
    			.assertThat().statusLine("HTTP/1.1 200 OK")
    			.statusCode(200)
    			.contentType("application/json;charset=utf-8")
    			 .extract().response();      
    	//assertEquals(response.path("findAll{it.id}.size()"), 3);

 	//assertEquals(response.path("findAll{it.id}.size()"), 3);
 	List<String> authors= response.path("author");
   	System.out.println(authors);
 	assertEquals(authors.contains("Shah_Bano_new Created"),true);
		
	    }
	    	



	    @Test
	    public void employee_test4_update(){
	    	setupDone("http://localhost:3000","");
	    	   DemoClass demo = new DemoClass(1,"json-server","Shah_Bano");
		        
	   	    given().spec(requestSpecification).body(demo).when().put("/posts/1").then()
	   	    			.assertThat().statusLine("HTTP/1.1 200 OK")
	   	    			.statusCode(200)
	   	    			.contentType("application/json;charset=utf-8");
	   	    Response response= given().spec(requestSpecification).when().get("/posts").then()
	       			.assertThat().statusLine("HTTP/1.1 200 OK")
	       			.statusCode(200)
	       			.contentType("application/json;charset=utf-8")
	       			 .extract().response();     
	   	   
	      // 	assertEquals(response.path("findAll{it.id}.size()"), 2);
	       	List<String> authors= response.path("author");
	       	System.out.println(authors);
	       	assertEquals(authors.contains("Shah_Bano"),true);
	   		
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
