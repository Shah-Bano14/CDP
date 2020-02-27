package org.epam.learn;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TrainingDay2Test3 {

    Calculator calculator;


    public void beforeTest(){

    }


    @BeforeClass
    public void setUp() {
        System.out.println("@BeforeClass: Printed before starting the first test method");
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("@AfterClass: Printed after executing the last test method");
        calculator = null;
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Starting the testNG test method: ");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Ended the testNG test method: ");
    }

    @Test
    public void add() {
        System.out.println("Inside addition method: add");
        int result = calculator.add(2, 3);
        assertEquals(5, result);
        doNothing();
    }

    @Test
    public void subtract() {
        System.out.println("Inside subtract method: subtract");
        int result = calculator.subtract(2, 3);
        assertEquals(-1, result);
    }

    @Test
    public void multiply() {
        System.out.println("Inside multiply method: multiply");
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    public void doNothing(){
//        multiply();
        System.out.println("hello");
    }

   /* @Test(priority = 1, timeOut = 1)
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
    }*/
}
