package com.my.factory;

import org.openqa.selenium.WebDriver;

public class BasicDriverFactory implements DriverFactory {

	@Override
	public WebDriver selectDriverType(String driverType) {
		System.out.println("class which returns the basic drivers");
		switch (driverType) {
		case "chrome":
			return new BasicChromeDriver().createDriver();
		case "ie":
			return new BasicIEdriver().createDriver();
		case "gecko":
			return new BasicGeckoDriver().createDriver();
		}
		return null;

	}

}
