package com.my.factory;

import org.openqa.selenium.WebDriver;

public interface DriverFactory {

	public WebDriver selectDriverType(String driverType);
}
