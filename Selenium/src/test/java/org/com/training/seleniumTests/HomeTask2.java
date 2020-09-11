package org.com.training.seleniumTests;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.com.training.Selenium.pages.AmazonPage;
import org.com.training.services.AmazonPageServices;
import org.com.training.services.IAmazonPageServices;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTask2 extends BaseClass {

	private static final String SEARCH_TERM = "mobile";
	static Logger logger = LogManager.getLogger(HomeTask2.class);

	IAmazonPageServices amazonPageSevices;

	/*
	 * without service and abstraction, does search in amazon page, gets count
	 * of results on search, clicks on prime button, gets count of result,
	 * prints list of search result
	 */
	@Test
	public void AmazonPageTest() {
		AmazonPage amazonPage = PageFactory.initElements(driver, AmazonPage.class);
		amazonPage.doSearch(SEARCH_TERM);
		String resultWithoutPrimeClick = amazonPage.getCountOfResults();
		logger.info("result without prime click " + resultWithoutPrimeClick);
		amazonPage.doPrimeClick();
		String resultWithPrimeClick = amazonPage.getCountOfResults();
		logger.info("result with prime click " + resultWithPrimeClick);
		List<String> resultList = amazonPage.getListOfResultsOnSearch();
		for (String reList : resultList) {
			logger.info(reList);
		}

	}

	/*
	 * using service level abstraction without service and abstraction, does
	 * search in amazon page taking data from excel, gets count of results on
	 * search, clicks on prime button, gets count of result, prints list of
	 * search result
	 */
	@Test
	public void AmazonPageTestUsingServices() {
		String expectedTitle = "Amazon.in : mobile";
		amazonPageSevices = new AmazonPageServices();
		amazonPageSevices.doSearchOnPage(excelDp.getSheetData(0, 0, 0));
		Assert.assertEquals(amazonPageSevices.getTitleOfThePage(), expectedTitle);
		String resultWithoutPrimeClick = amazonPageSevices.getCountOfResultsOnPage();
		logger.info("result without prime click " + resultWithoutPrimeClick);
		amazonPageSevices.doPrimeClickOnPage();
		String resultWithPrimeClick = amazonPageSevices.getCountOfResultsOnPage();
		logger.info("result with prime click " + resultWithPrimeClick);
		List<String> resultList = amazonPageSevices.getCountOfResultsOnsearchOnPage();
		for (String reList : resultList) {
			logger.info(reList);
		}

	}

	/*
	 * does search on amazon page, selects a mobile, add mobile to cart on a new
	 * tab, returns back to previous tab closing new tab
	 */
	@Test
	public void amazonPageFunctionalityCheck() {
		String expectedTitle = "Amazon.in: mobile - Get It Today";
		amazonPageSevices = new AmazonPageServices();
		amazonPageSevices.doSearchOnPage(SEARCH_TERM);
		amazonPageSevices.selectMobile();
		amazonPageSevices.checkoutMobile();
		Assert.assertEquals(amazonPageSevices.getTitleOfThePage(), expectedTitle);

	}

	/*
	 * open amazon page, does a global search using xml data provider, and
	 * checks page title
	 */
	@Test
	public void gettingDataFromXMLCheck() {
		String expectedTitle = "Amazon.in : Mobile";
		amazonPageSevices = new AmazonPageServices();
		amazonPageSevices.doSearchOnPage(xmlDataProvider.getXMLData());
		Assert.assertEquals(amazonPageSevices.getTitleOfThePage(), expectedTitle);
	}

	/*
	 * navigates to computer tab on amzon home page, clicks on Made fr amazon
	 * checkbox, and verify if it is present in header, Fluent wait used
	 */
	@Test
	public void computerPagecheck() {
		amazonPageSevices = new AmazonPageServices();
		Boolean madeForAmazonHeaderCheck = amazonPageSevices.checksForComputerTabPage();
		Assert.assertTrue(madeForAmazonHeaderCheck);

	}
	
	/*To handle SeleniumException, opens Amazonpage, clicks on pantry*/
	@Test
	public void HandleExceptionInSelenium()
	{
		amazonPageSevices=new AmazonPageServices();
		amazonPageSevices.HandleSeleniumException();
	}
}
