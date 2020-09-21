package com.my.training.stepDefs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.my.training.Selenium.utilities.BrowserManager;
import com.my.training.Selenium.utilities.ConfigDataProvider;
import com.my.training.Selenium.utilities.ExcelDataProviderClass;
import com.my.training.Selenium.utilities.Helper;
import com.my.training.Selenium.utilities.PageObjectsFactory;
import com.my.training.Selenium.utilities.XMLDataProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider dataProvider;
	public ExcelDataProviderClass excelDp;
	public PageObjectsFactory pageObjectsFactory;
	public XMLDataProvider xmlDataProvider;
	static Logger logger = LogManager.getLogger(BaseClass.class);

	@Before
	public void suiteSetup() {
		dataProvider = new ConfigDataProvider();
		pageObjectsFactory = new PageObjectsFactory();
		excelDp = new ExcelDataProviderClass();
		xmlDataProvider = new XMLDataProvider();
	}

	@Given("^I navigate to amazon HomePage$")
	public void i_navigate_to_amazon_HomePage() {
		driver = BrowserManager.setupDriver(dataProvider.getConfigData("browser"));
		driver.manage().window().maximize();
		logger.info("opening amazon website");
		driver.get(dataProvider.getConfigData("stagingURL"));
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@AfterMethod
	public void teardownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE)
			Helper.captureScreenshot(driver);

	}
}
