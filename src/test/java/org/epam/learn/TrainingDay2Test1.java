package org.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainingDay2Test1 {

    @Test(priority = 2, testName = "Addition", description = "Method to add two numbers")
    public void add(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test(priority = 1, enabled = false)
    public void subtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 3);
        Assert.assertEquals(-1, result);
    }

    @Test(priority = 1, invocationCount = 5)
    public void multiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        Assert.assertEquals(6, result);
    }

    @Test(priority = 1, timeOut = 1)
    public void multiply2(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(244443423, 352352588);
        Assert.assertEquals(1614881370, result);
    }


    @Test(priority = 1, invocationCount = 15, invocationTimeOut = 1)
    public void multiply3(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(160000000, 4);
        Assert.assertEquals(result, 40000000);
    }
}
