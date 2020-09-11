package org.epam.learn;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TrainingDay3Test2 {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testMe(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4,0));
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testMe1(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4,0));
    }
}
