package com.my.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicGeckoDriver implements WebDriverOptions {

	@Override
	public WebDriver createDriver() {
		System.out.println("this is a basic gecko driver");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shah_Bano\\Drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
      return new FirefoxDriver();
		
	}

	
}
