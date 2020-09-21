package com.my.training.stepDefs;



import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import com.my.training.services.AmazonPageServices;
import com.my.training.services.IAmazonPageServices;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPageStepDefinitions {

	static Logger logger = LogManager.getLogger(AmazonPageStepDefinitions.class);
	IAmazonPageServices amazonPageSevices;


	@When("^I search using \"([^\"]*)\"$")
	public void i_search_using(String string) {
		amazonPageSevices = new AmazonPageServices();
		amazonPageSevices.doSearchOnPage(string);
	}

	@When("I count the search result on the page")
	public void i_count_the_search_result_on_the_page() {
	 String searchResultCount = amazonPageSevices.getCountOfResultsOnPage();
		logger.info("result count is " + searchResultCount);
	}

	@When("I click on Prime button\"")
	public void i_click_on_Prime_button() {
		amazonPageSevices.doPrimeClickOnPage();
	}

	@Then("I print the result list")
	public void i_print_the_result_list() {
		List<String> resultList = amazonPageSevices.getCountOfResultsOnsearchOnPage();
		for (String reList : resultList) {
			logger.info(reList);
		}

	}
	
	@When("I enter search Term")
	public void i_enter_search_Term(DataTable dataTable) {
		amazonPageSevices = new AmazonPageServices();
	   List<List<String>> rowData=dataTable.asLists();
	   for(List<String> col:rowData)
	   {
		   System.out.println("hello printed col values "+ col.get(0)+" "+col.get(1));
		   String searchValue= col.get(1);
		   System.out.println(searchValue);
		amazonPageSevices.doSearchOnPage(searchValue);
	   }
	}

	@When("I select an Item")
	public void i_select_an_Item() {
		amazonPageSevices.selectMobile();
	}

	@When("I checkout the selected item")
	public void i_checkout_the_selected_item() {
		amazonPageSevices.checkoutMobile(); 
	}

	@Then("^I verify the title of the page should be \"([^\"]*)\"$")
	public void i_verify_the_title_of_the_page_should_be(String pageTitle) {
		Assert.assertEquals(amazonPageSevices.getTitleOfThePage(), pageTitle);
	}



}
