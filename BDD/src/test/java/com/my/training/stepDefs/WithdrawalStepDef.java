package com.my.training.stepDefs;

import org.junit.Assert;

import com.my.training.helper.Helper;

import io.cucumber.java.en.When;


public class WithdrawalStepDef {

	Helper helper;
	int balance;
	public WithdrawalStepDef(Helper helper)
	{
		this.helper=helper;
	}
	
	@When("I request ${int}")
	public void iRequest(int amount) {
	 System.out.println("requesting for withdrawal");
	 balance=helper.getAccount().getBalance();
	 helper.getTellar().withdrawCash(amount);
	 Assert.assertEquals(amount, balance-helper.getAccount().getBalance());
	}
}
