package org.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainingDay2Test2 {

    @Test(priority = 2)
    public void add(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test(priority = 1)
    public void subtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 3);
        Assert.assertEquals(-1, result);
    }

    @Test(priority = 3)
    public void multiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        Assert.assertEquals(6, result);
    }


}
