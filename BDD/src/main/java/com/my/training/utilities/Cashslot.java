package com.my.training.utilities;

public class Cashslot {

	Account account;
	
	private int balance;
	private int dispensed;
	public Cashslot(Account account)
	{
		this.account=account;
	}
	public void dispense(int amount) {
		dispensed=amount;
		if(account.getBalance()>amount)
		{
		System.out.println("cash withdrwal done for amount "+ amount);
		balance= account.getBalance()-amount;
		account.setBalance(balance);
	
	}
		else
			System.out.println("please enter a valid amount");
	  
	}
	public int dispensedamount()

	{
		return dispensed;
	}
}
