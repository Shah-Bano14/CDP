package org.com.training.Testng;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExeptionsCheck {

	static Logger logger = LogManager.getLogger(UnitTests.class);

	@BeforeMethod
	public void testStart() {

		logger.info("*********Test Starts*************");
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void divide2() {
		MyCalculator cal = new MyCalculator();

		assertEquals(2, cal.div(4, 0));
	}

	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	public void testMe1() {
		MyCalculator MyCalculator = new MyCalculator();
		assertEquals(2, MyCalculator.div(4, 0));
	}

	@AfterMethod
	public void TestEnds() {
		logger.info("*********Test Ends*************");
	}
}
