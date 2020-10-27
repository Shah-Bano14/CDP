package org.com.training.MavenDemo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTests {

	@Test
	@Parameters({"a"})
	public void positiveCheck2(int a) {
		boolean isValPositive;
		if(a>0)
			isValPositive= true;
		else 
			isValPositive= false;
		Assert.assertEquals(isValPositive, true);
	}
}
