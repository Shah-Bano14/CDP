package com.my.training.helper;

import com.my.training.utilities.Account;
import com.my.training.utilities.Cashslot;
import com.my.training.utilities.Tellar;

public class Helper {

	public Account account;
	public Cashslot cashlot;
	public Tellar tellar;
	
	public Account getAccount()
	{
		if(account == null)
		{
			account= new Account();
		}
		return account;
	}
	
	public Cashslot getCashslot()
	{
		if(cashlot == null)
		{
			cashlot= new Cashslot(getAccount());
		}
		return cashlot;
	}
	public Tellar getTellar()
	{
		if(tellar == null)
		{
			tellar= new Tellar(getCashslot());
		}
		return tellar;
	}
}

