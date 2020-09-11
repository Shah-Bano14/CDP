package org.com.training.Selenium.utilities;

import org.com.training.Selenium.pages.AmazonPage;
import org.openqa.selenium.WebDriver;

public class PageObjectsFactory {

	WebDriver driver;
	AmazonPage amazonPage;
	
	/*public PageObjectsFactory(WebDriver driver) {
		this.driver=driver;
	}
	*/
	public AmazonPage getAmazonPageObject(WebDriver driver)
	{
		if(amazonPage==null)
		{
			amazonPage=new AmazonPage(driver);
		}
		return amazonPage;
	}
}
