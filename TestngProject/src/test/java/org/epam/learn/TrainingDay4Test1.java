package org.epam.learn;

import org.testng.annotations.Test;

public class TrainingDay4Test1 {

    @Test(invocationCount = 10, threadPoolSize = 10)
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method One Class One. Thread id is: " + id);
    }
}
