package org.com.training.Testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class ReportingCheck {

	@Test
	public void test1() {

		Assert.assertTrue(true);

	}
	
	@Test
	public void test2() {

		Assert.assertTrue(false);

	}
	@Test(dependsOnMethods={"test2"})
	public void test3() {

		Assert.assertTrue(true);

	}
	
	

}
