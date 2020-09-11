package com.my.training.stepDefs;

import org.junit.Assert;

import com.my.training.helper.Helper;

import io.cucumber.java.en.Then;


public class CashSlotCheckStepDef {

	
	Helper helper;
	public CashSlotCheckStepDef(Helper helper)
	{
		this.helper=helper;
	}
	@Then("${int} should be dispensed")
	public void should_be_dispensed(int amount) {
		  System.out.print("prints the amount dispensed ");
	Assert.assertEquals(amount, helper.getCashslot().dispensedamount());
	System.out.print(helper.getCashslot().dispensedamount());
	}


}
