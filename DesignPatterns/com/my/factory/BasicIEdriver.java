package com.my.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicIEdriver implements WebDriverOptions {

	@Override
	public WebDriver createDriver() {
		System.out.println("this is a basic IE driver");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Shah_Bano\\Drivers\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
      return new InternetExplorerDriver();
		
	}

	
}
