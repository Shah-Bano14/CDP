package com.my.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeckoDriverWithCapabilities implements WebDriverOptions {

	@Override
	public WebDriver createDriver() {
		System.out.println("this is a gecko driver with additonal capabilities");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shah_Bano\\Drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		DesiredCapabilities browserName=DesiredCapabilities.firefox();
		browserName.setCapability(CapabilityType.BROWSER_NAME, "firefox");
      return new FirefoxDriver();
		
	}

	
}
