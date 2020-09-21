package org.com.training.Testng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testGroups {

	static Logger logger = LogManager.getLogger(UnitTests.class);

	@BeforeMethod
	public void testStart() {

		logger.info("*********Test Starts*************");
	}

	@Test(testName = "testwithgroup", groups = { "smokeTests" })
	public void multiply() {
		MyCalculator cal = new MyCalculator();
		long multi = cal.mult(5, 6);
		Assert.assertEquals(multi, 30);
	}

	@Test
	public void add1() {
		MyCalculator cal = new MyCalculator();
		long sum = cal.sum(5, 6);
		Assert.assertEquals(sum, 11);
	}

	@Test(testName = "testwithgroup2", groups = { "smokeTests" })
	public void divide() {
		MyCalculator cal = new MyCalculator();
		long div = cal.div(15, 3);
		Assert.assertEquals(div, 5);
	}
	@Test(dependsOnGroups = "smokeTests")
	public void positiveCheck() {
		MyCalculator cal = new MyCalculator();
		boolean isValPositive = cal.isPositive(14);
		Assert.assertEquals(isValPositive, true);
	}

	@AfterMethod
	public void TestEnds() {
		logger.info("*********Test Ends*************");
	}
}
