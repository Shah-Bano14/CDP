package com.my.decorator;

public class DeskTopVersion implements WebPage {

	int point=10;

	@Override
	public int calculateRank() {
		
		return point;
	}
	
}
