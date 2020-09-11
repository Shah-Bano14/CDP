package org.epam.learn;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TrainingDay4test2 {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before test-method. Thread id is: 1");
    }

    @Test
    public void testMethodsOne() {
        System.out.println("Simple test-method One. Thread id is: ");
    }

    @Test
    public void testMethodsTwo() {
        Assert.assertEquals(1, 2);
        System.out.println("Simple test-method One. Thread id is: ");
    }
}
