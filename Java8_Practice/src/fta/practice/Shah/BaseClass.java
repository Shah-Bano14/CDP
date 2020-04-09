package fta.practice.Shah;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	protected RequestSpecification requestSpecification;
	protected ResponseSpecification responseSpecification;
	
  
	public void setupDone(String url, String basePath)
	{
	  requestSpecification = new RequestSpecBuilder().
		            setBaseUri(url).
		            setBasePath(basePath).
		            setContentType(ContentType.JSON).
		            build();

		    responseSpecification = new ResponseSpecBuilder()
		    		.expectStatusCode(201).
		            //expectStatusCode(HttpStatus.SC_OK).
		            expectContentType(ContentType.JSON).
		            build();
	}
}
