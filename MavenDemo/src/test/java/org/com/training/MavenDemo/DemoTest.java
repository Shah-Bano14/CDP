package org.com.training.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	@Test
	public void demo()
	{
		  WebDriver driver;
		  WebDriverManager.chromedriver().setup(); 
		  driver= new
		  ChromeDriver();
		  driver.get(demoSrcClass.getURL());
		 
	
	}
}
