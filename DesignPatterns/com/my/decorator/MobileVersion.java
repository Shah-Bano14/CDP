package com.my.decorator;

public class MobileVersion implements WebPage {

	int point=5;
	@Override
	public int calculateRank() {
		
		return point;
	}

	
}
