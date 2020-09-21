package com.my.training.Selenium.utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserManager {

	static WebDriver driver;
	static Logger logger = LogManager.getLogger(BrowserManager.class);
	public static WebDriver setupDriver(String browser)
	{
		logger.info("setup the driver");
		Browsers br=Browsers.valueOf(browser.toUpperCase());
		switch(br)
		{
		case CHROME_GRID:
			ChromeOptions options=new ChromeOptions();	
			String url="http://10.71.11.243:4444/wd/hub";			
      		try {
				driver=new RemoteWebDriver(new URL(url), options);
			} catch (MalformedURLException e) {
				logger.info("remote web driver object not created");
				logger.error(e);
			}
			break;
		case FIREFOX:
			logger.info("setting up firefox driver");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shah_Bano\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case IE:
			logger.info("setting up IE driver");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shah_Bano\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case CHROME:
			logger.info("creating chrome object");
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
	    default:
	    	logger.info("creating chrome object");
	    	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		}
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
