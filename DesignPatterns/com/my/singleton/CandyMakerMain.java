package com.my.singleton;

public class CandyMakerMain {

	public static void main(String[] args) {

		CandyMaker candyMakerInstance1 = CandyMaker.getInstance();
		System.out.println(candyMakerInstance1);
		
		CandyMaker candyMakerInstance2 = CandyMaker.getInstance();
		System.out.println(candyMakerInstance2);
	}

}
