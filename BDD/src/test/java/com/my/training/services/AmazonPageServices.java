package com.my.training.services;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.my.training.Selenium.pages.AmazonPage;
import com.my.training.Selenium.utilities.BrowserManager;


public class AmazonPageServices implements IAmazonPageServices{

	static Logger logger=LogManager.getLogger(AmazonPageServices.class);
	AmazonPage amazonPage;
	public AmazonPageServices() {	
		 amazonPage= PageFactory.initElements(BrowserManager.getDriver(), AmazonPage.class);
	}
	
	@Override
	public AmazonPage doSearchOnPage(String searchTerm) {
		logger.info("Doing a search on amazon page");
		amazonPage.doSearch(searchTerm);
		return amazonPage;
	}

	@Override
	public AmazonPage doPrimeClickOnPage() {
		logger.info("clicking on prime button on amazon page");
		try{
			amazonPage.doPrimeClick();
			}
			catch(NoSuchElementException e)
			{
				logger.info("element not found");
				logger.error(e);
			}
		
		return amazonPage;
	}

	@Override
	public String getCountOfResultsOnPage() {
		logger.info("the count of results on search");
		return amazonPage.getCountOfResults();
	}

	@Override
	public List<String> getCountOfResultsOnsearchOnPage() {
		logger.info("the list of results on search");
		return amazonPage.getListOfResultsOnSearch();
	}

	@Override
	public String getTitleOfThePage() {
		logger.info("the title of the page is");
		return amazonPage.getPageTitle();
	}

	public void selectMobile()
	{
		logger.info("selecting a mobile from amazon page");
		amazonPage.openPhoneInNewTab();
		logger.info("mobile opened in new tab");
	}
	
	public void checkoutMobile()
	{
		logger.info("adding mobile to cart");
		amazonPage.AddToCartAndComeBackToPreviousWindow();
		logger.info("mobile added , returning to previous tab");
	}
	
	
	public boolean checksForComputerTabPage() {
		logger.info("opening computer tab");
		amazonPage.openComputertab();
		amazonPage.clickMadeInAmazon();
		return amazonPage.CheckMadeForAmazonInHeader();
		
	}

	@Override
	public void HandleSeleniumException() {
		logger.info("click on pantry on amazon page");
		try{
		amazonPage.pantryClick();
		}
		catch(NoSuchElementException e)
		{
			logger.info("element not found");
			logger.error(e);
		}
		
	}
}
