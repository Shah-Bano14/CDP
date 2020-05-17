package com.my.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicChromeDriver implements WebDriverOptions {

	@Override
	public WebDriver createDriver() {
		System.out.println("this is a basic chrome driver");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shah_Bano\\Drivers\\chromedriver_win32\\chromedriver.exe");
      return new ChromeDriver();
		
	}

	
}
