package org.epam.learn;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TrainingDay3Test4 {

    @Test(dataProvider = "data", dataProviderClass = DataProviderInfo.class)
    public void testMe(int a, int b, int result) {
        Calculator calculator = new Calculator();
        assertEquals(result, calculator.add(a, b));
    }


}
