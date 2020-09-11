package com.my.training.utilities;

public class Tellar {

	
	Cashslot cashslot;
	public Tellar(Cashslot cashslot)
	{
		this.cashslot=cashslot;
	}
	public void withdrawCash(int amount)
	{
		cashslot.dispense(amount);
	}
}
