package org.com.training.Testng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;



public class UnitTests {

	static Logger logger = LogManager.getLogger(UnitTests.class);

	@BeforeMethod
	public void testStart() {

		logger.info("*********Test Starts*************");
	}

	@Test
	public void add1() {
		MyCalculator cal = new MyCalculator();
		long sum = cal.sum(5, 6);
		Assert.assertEquals(sum, 11);
	}

	@Test(dataProvider = "data")
	public void add(int a, int b) {
		MyCalculator cal = new MyCalculator();
		long sum = cal.sum(a, b);
		Assert.assertEquals(sum, 11);
	}

	@DataProvider(name = "data")
	public Object[][] getData() {
		return new Object[][] { { 2, 4 }, { 3, 5 } };
	}

	@Test
	public void subtract() {
		MyCalculator cal = new MyCalculator();
		long sub = cal.sub(5, 6);
		Assert.assertEquals(sub, -1);
	}

	@Test(testName = "testwithgroup", groups = { "smokeTests" })
	public void multiply() {
		MyCalculator cal = new MyCalculator();
		long multi = cal.mult(5, 6);
		Assert.assertEquals(multi, 30);
	}

	@Test(testName = "testwithgroup2", groups = { "smokeTests" })
	public void divide() {
		MyCalculator cal = new MyCalculator();
		long div = cal.div(15, 3);
		Assert.assertEquals(div, 5);
	}

	@Test
	public void negativeCheck() {
		MyCalculator cal = new MyCalculator();
		boolean isValNegative = cal.isNegative(-1);
		Assert.assertEquals(isValNegative, true);
	}

	@Test(dependsOnGroups = "smokeTests")
	public void positiveCheck() {
		MyCalculator cal = new MyCalculator();
		boolean isValPositive = cal.isPositive(14);
		Assert.assertEquals(isValPositive, true);
	}

	@Test
	public void calculatePower() {
		MyCalculator cal = new MyCalculator();
		double powerOf = cal.pow(2, 3);
		Assert.assertEquals(powerOf, 8);
	}

	@Test
	public void calculateSqrt() {
		MyCalculator cal = new MyCalculator();
		double sqrtOf = cal.sqrt(16);
		Assert.assertEquals(sqrtOf, 4);
	}

	@Test
	public void calculateSin() {
		MyCalculator cal = new MyCalculator();	
		double sinValue = cal.sin(0);
		Assert.assertEquals(sinValue, cal.sin(0));
	}

	@Test
	public void calculateCos() {
		MyCalculator cal = new MyCalculator();
		double cosValue = cal.cos(1.0472);
		Assert.assertEquals(cosValue, 0.8660266281835431);
	}
	
	
	@Test(expectedExceptions= ArithmeticException.class)
	public void divide2() {
		MyCalculator cal = new MyCalculator();
		long div = cal.div(15, 0);
		Assert.assertEquals(div, 5);
	}

	@AfterMethod
	public void TestEnds() {
		logger.info("*********Test Ends*************");
	}
}
