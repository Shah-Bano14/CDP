package org.com.training.Testng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterizedTest {


	static Logger logger = LogManager.getLogger(UnitTests.class);

	@BeforeMethod
	public void testStart() {

		logger.info("*********Test Starts*************");
	}

	@Test(groups = { "regressionTests" })
	@Parameters({"a"})
	public void positiveCheck2(int a) {
		MyCalculator cal = new MyCalculator();
		boolean isValPositive = cal.isPositive(a);
		Assert.assertEquals(isValPositive, true);
	}
	@AfterMethod
	public void TestEnds() {
		logger.info("*********Test Ends*************");
	}
}
