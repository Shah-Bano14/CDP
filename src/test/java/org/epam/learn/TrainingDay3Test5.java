package org.epam.learn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TrainingDay3Test5 {

    @Test
    @Parameters({"a", "b", "result"})
    public void testMe(int a, int b, int result){
        Calculator calculator = new Calculator();
        assertEquals(result, calculator.add(a,b));
    }

   /* @DataProvider(name = "data")
    public Object[][] getData(){
        return new Object[][] {
                {1,1,2},
                {2,3,5},
                {3,7,10}
        };
    }*/

}
