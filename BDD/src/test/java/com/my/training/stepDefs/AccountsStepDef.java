package com.my.training.stepDefs;

import org.junit.Assert;

import com.my.training.helper.Helper;

import io.cucumber.java.en.Given;




public class AccountsStepDef {
	
	Helper helper;
	public AccountsStepDef(Helper helper)
	{
		this.helper=helper;
	}
	@Given("I have a balance of ${int} in my account")
	public void IHaveBalanceOfThisInMyAccount(int amount) {
	   int bal= helper.getAccount().getBalance();
	    System.out.println("Account Balance is "+bal);
	  Assert.assertEquals(amount,   bal);
	   
	}

	
	
	/*@When("I request $20")
	public void i_request_$20() {
	  System.out.println("m here");
	}

	@Then("$20 should be dispensed")
	public void $20_should_be_dispensed() {
	  System.out.println("world");
	}

*/
}
