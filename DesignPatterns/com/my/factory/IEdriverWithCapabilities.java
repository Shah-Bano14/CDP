package com.my.factory;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEdriverWithCapabilities implements WebDriverOptions {

	@Override
	public WebDriver createDriver() {
		System.out.println("this is a IE driver with addditional capabilities");
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Shah_Bano\\Drivers\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
		DesiredCapabilities browserName = DesiredCapabilities.internetExplorer();
		browserName.setCapability(CapabilityType.BROWSER_NAME, "IE");
		return new InternetExplorerDriver();

	}

}
