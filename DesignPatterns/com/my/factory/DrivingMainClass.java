package com.my.factory;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class DrivingMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the type of driver 1: basic 2: additional capabilities");
		String typeOfDriver = sc.next();
		System.out.println("enter the driver");
		String driverName = sc.next();
		if (typeOfDriver.equals("basic")) {
			DriverFactory factory = new BasicDriverFactory();
			WebDriver getDriverObject = factory.selectDriverType(driverName);
			getDriverObject.close();

		}
		if (typeOfDriver.equals("additional capabilities")) {
			DriverFactory factory = new AdditionalCapabilitiesDriverFactory();
			WebDriver getDriverObject = factory.selectDriverType(driverName);
			getDriverObject.close();
		}
	}

}
