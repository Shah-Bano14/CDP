package fta.practice.Shah;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTask04 {
    private String cookie=null;
    private String cookie1=null;
    @BeforeClass
    public void setUp(){
   
        RestAssured.baseURI = "http://dummy.restapiexample.com/";
        RestAssured.basePath = "api/v1";
        RestAssured.requestSpecification = new RequestSpecBuilder().
                setContentType("application/json").build();

        RestAssured.responseSpecification = new ResponseSpecBuilder().
                                               build();

    }


    @Test
    public void employee_test1_get() {

    	given().
    	when().
        get("/employees")
                .then()
                .assertThat()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json;charset=utf-8")
               .body("data.findAll{it.id}.size()",equalTo(24));

    }


    @Test
    public void employee_test6_delete(){
               
    	given().
    	when().
                delete("/delete/69")
                .then()
                .assertThat()
                .statusCode(200);
                get("employees")
                .then()
                .assertThat()
                .statusCode(200)
                 .body("data.findAll{it.id}.size()",equalTo(24));



    }

    @Test
    public void employee_test2_3_post(){

        EmployeeClass emp = new EmployeeClass("Shah new created","50000","23");

         given()
         .body(emp)
         .when()
         .post("/create")
         .then()
         .assertThat().statusCode(200);
         
         get("employees")
         .then()
         .assertThat()
          .statusCode(200)
        //  .body("data.findAll{it.employee_name='Shah new created'}.employee_salary",hasItems("50000"));
          
    //.body("data.findAll{it.employee_name='Ashton Cox'}.employee_salary",hasItems("86000"));
          
     .body("data.findAll{it.id}.size()",equalTo(24));
    }

    @Test
    public void employee_test4_update(){

        EmployeeClass emp = new EmployeeClass("Shah new created","50000","23");

        given()
        .body(emp)
        .when()
        .put("/update/24")
        .then()
        .assertThat().statusCode(200);
        get("employees")
         .then()
         .assertThat()
        .statusCode(200)
        .body("data.findAll{it.id}.size()",equalTo(24));
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
