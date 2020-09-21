package com.my.training.Selenium.utilities;


import org.openqa.selenium.WebDriver;

import com.my.training.Selenium.pages.AmazonPage;

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
