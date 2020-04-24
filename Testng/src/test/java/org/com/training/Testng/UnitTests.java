package org.com.training.Testng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.epam.tat.module4.Calculator;

public class UnitTests {

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

	@Test(dataProvider = "data")
	public void add(int a, int b) {
		Calculator cal = new Calculator();
		long sum = cal.sum(a, b);
		Assert.assertEquals(sum, 11);
	}

	@DataProvider(name = "data")
	public Object[][] getData() {
		return new Object[][] { { 2, 4 }, { 3, 5 } };
	}

	@Test
	public void subtract() {
		Calculator cal = new Calculator();
		long sub = cal.sub(5, 6);
		Assert.assertEquals(sub, -1);
	}

	@Test(testName = "testwithgroup", groups = { "smokeTests" })
	public void multiply() {
		Calculator cal = new Calculator();
		long multi = cal.mult(5, 6);
		Assert.assertEquals(multi, 30);
	}

	@Test(testName = "testwithgroup2", groups = { "smokeTests" })
	public void divide() {
		Calculator cal = new Calculator();
		long div = cal.div(15, 3);
		Assert.assertEquals(div, 5);
	}

	@Test
	public void negativeCheck() {
		Calculator cal = new Calculator();
		boolean isValNegative = cal.isNegative(-1);
		Assert.assertEquals(isValNegative, true);
	}

	@Test(dependsOnGroups = "smokeTests")
	public void positiveCheck() {
		Calculator cal = new Calculator();
		boolean isValPositive = cal.isPositive(14);
		Assert.assertEquals(isValPositive, true);
	}

	@Test
	public void calculatePower() {
		Calculator cal = new Calculator();
		double powerOf = cal.pow(2, 3);
		Assert.assertEquals(powerOf, 8);
	}

	@Test
	public void calculateSqrt() {
		Calculator cal = new Calculator();
		double sqrtOf = cal.sqrt(16);
		Assert.assertEquals(sqrtOf, 4);
	}

	@Test
	public void calculateSin() {
		Calculator cal = new Calculator();
		double sinValue = cal.sin(0.523599);
		Assert.assertEquals(sinValue, 0.5000001943375613);
	}

	@Test
	public void calculateCos() {
		Calculator cal = new Calculator();
		double cosValue = cal.cos(1.0472);
		Assert.assertEquals(cosValue, 0.8660266281835431);
	}
	
	@Test(groups = { "regressionTests" })
	@Parameters({"a"})
	public void positiveCheck2(int a) {
		Calculator cal = new Calculator();
		boolean isValPositive = cal.isPositive(a);
		Assert.assertEquals(isValPositive, true);
	}
	
	@Test(expectedExceptions= ArithmeticException.class)
	public void divide2() {
		Calculator cal = new Calculator();
		long div = cal.div(15, 3);
		Assert.assertEquals(div, 5);
	}

	@AfterMethod
	public void TestEnds() {
		logger.info("*********Test Ends*************");
	}
}
