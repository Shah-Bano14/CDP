package fta.practice.Shah;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.number.OrderingComparison.greaterThan;

import java.util.List;


public class RestAssuredTask03 {

	@Test
	public void getNamesInEnglish()
	{
		
		given().
		baseUri("https://events.epam.com/api/").
		when().get("v2/events").
		then().assertThat().
		//body("events.findAll{it.language=='Ru'}.title",hasItems("Data Science Meetup","Solution Architecture Day #2"));
	    body("events.findAll{it.language=='En'}.title",hasItems("EPAM IT Nights presents Java Zurich"));
		
		/*
		Response response=get("https://events.epam.com/api/v2/events");
		List<String> titles = response.path("events.findAll{it.language=='En'}.title");
		System.out.println(titles);*/
	}
	
	@Test
    public void getWeatherData() {

        given().
                baseUri("http://api.openweathermap.org/data/2.5/").
                when().
                get("weather?lat=17.38&lon=78.47&appid=9185b7a783c125be9335848be77501cf").

                then().

                assertThat().
                body("name" ,equalTo("Hyderabad")).
                body("sys.country",equalTo("IN")).
                body("main.temp_min",greaterThan(0.0f)).
                body("main.temp",greaterThan(0.0f));

    }
	
	@Test
    public void getWeatherData_2() {

        given().
        
                baseUri("http://api.openweathermap.org/data/2.5/").
                when().
                get("weather?lat=17.38&lon=78.47&appid=39ab31b13be0923b87ce7752664abeed").
                then().log();
               

            

             





    }
	
	
	 
}
