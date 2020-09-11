package org.epam.learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClassesTestTwo {

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class Class Two. Thread id is: " + id);
    }

    @Test
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method One Class Two. Thread id is: " + id);
    }

    @Test
    public void testMethodTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method Two Class Two. Thread id is: " + id);
    }

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class Class Two. Thread id is: " + id);
    }

}
