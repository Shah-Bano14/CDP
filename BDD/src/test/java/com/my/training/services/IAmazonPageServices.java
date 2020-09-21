package com.my.training.services;

import java.util.List;

import com.my.training.Selenium.pages.AmazonPage;

public interface IAmazonPageServices {

	public AmazonPage doSearchOnPage(String searchTerm);
	
	public AmazonPage doPrimeClickOnPage();
	
	public String getCountOfResultsOnPage();
	
	public List<String> getCountOfResultsOnsearchOnPage();
	
	public String getTitleOfThePage();
	
	public void selectMobile();
	
	public void checkoutMobile();
	
	public boolean checksForComputerTabPage();
	
	public void HandleSeleniumException();
}
