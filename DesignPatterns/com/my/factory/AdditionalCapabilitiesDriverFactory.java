package com.my.factory;

import org.openqa.selenium.WebDriver;

public class AdditionalCapabilitiesDriverFactory implements DriverFactory {

	@Override
	public WebDriver selectDriverType(String driverType) {
		System.out.println("class which returns the additional capabilities drivers");
		switch (driverType) {
		case "chrome":
			return new ChromeDriverWithCapabilities().createDriver();
		case "ie":
			return new IEdriverWithCapabilities().createDriver();
		case "gecko":
			return new GeckoDriverWithCapabilities().createDriver();
		}
		return null;

	}
}
