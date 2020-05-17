package com.my.builder;

public class BicycleManufacturingCustomerDemo {

	public static void main(String[] args) {

		// basic implementation of BicycleManufaturing
		BicycleManufacturing basicModel = new BicycleManufacturing.Builder(true).setGearsSpec(true)
				.setdoubleSeatsSpec(true).setdoubleSeatsSpec(true).setcarrierSpec(true).build();
		System.out.println(basicModel);

		// Advanced implementation based on users choice
		BicycleManufacturing advancedModelWithUsersChoice = new BicycleManufacturing.Builder(true)
				.setdoubleSeatsSpec(true).setdoubleSeatsSpec(true).setcarrierSpec(false).build();
		System.out.println(advancedModelWithUsersChoice);
	}

}
