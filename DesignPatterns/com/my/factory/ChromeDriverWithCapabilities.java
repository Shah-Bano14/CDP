package com.my.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverWithCapabilities implements WebDriverOptions {

	@Override
	public WebDriver createDriver() {
		System.out.println("this is a chrome driver with additional capabilities");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shah_Bano\\Drivers\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities browserVersion = DesiredCapabilities.chrome();
		browserVersion.setCapability(CapabilityType.BROWSER_VERSION, "81.0.4044.69");
		return new ChromeDriver();

	}

}
