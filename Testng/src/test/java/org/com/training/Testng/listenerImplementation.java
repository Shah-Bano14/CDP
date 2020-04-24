package org.com.training.Testng;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;



@Listeners(org.com.training.Testng.TestListener.class)
public class listenerImplementation {


	static Logger logger = LogManager.getLogger(UnitTests.class);

	@BeforeMethod
	public void testStart() {

		logger.info("*********Test Starts*************");
	}

	@Test
	public void add1() {
		Calculator cal = new Calculator();
		long sum = cal.sum(5, 6);
		Assert.assertEquals(sum, 11);
	}
	
	@Test
	public void subtract() {
		Calculator cal = new Calculator();
		long sub = cal.sub(5, 6);
		Assert.assertEquals(sub, -1);
	}
	
	@AfterMethod
	public void TestEnds() {
		logger.info("*********Test Ends*************");
	}
}
