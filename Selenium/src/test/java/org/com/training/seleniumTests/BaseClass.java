package org.com.training.seleniumTests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.com.training.Selenium.utilities.BrowserManager;
import org.com.training.Selenium.utilities.ConfigDataProvider;
import org.com.training.Selenium.utilities.ExcelDataProviderClass;
import org.com.training.Selenium.utilities.Helper;
import org.com.training.Selenium.utilities.PageObjectsFactory;
import org.com.training.Selenium.utilities.XMLDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;




public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider dataProvider;
	public ExcelDataProviderClass excelDp;
	public PageObjectsFactory pageObjectsFactory;
	public XMLDataProvider xmlDataProvider;
	static Logger logger = LogManager.getLogger(Hometask1.class);

	@BeforeSuite
	public void suiteSetup()
	{
		dataProvider=new ConfigDataProvider();
		pageObjectsFactory=new PageObjectsFactory();
		excelDp= new ExcelDataProviderClass();
		xmlDataProvider=new XMLDataProvider();
	}
	
	@BeforeClass
	public void startApp()
	{
		
		driver= BrowserManager.setupDriver(dataProvider.getConfigData("browser"));
		driver.manage().window().maximize();
		logger.info("opening amazon website");
		driver.get(dataProvider.getConfigData("stagingURL"));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	@AfterMethod
	public void teardownMethod(ITestResult result)
	{
		if(result.getStatus()== ITestResult.FAILURE)
			Helper.captureScreenshot(driver);
			
	}
}
