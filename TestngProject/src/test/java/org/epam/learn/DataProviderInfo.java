package org.epam.learn;

import org.testng.annotations.DataProvider;

public class DataProviderInfo {

    @DataProvider(name = "data")
    public static Object[][] getData() {
        return new Object[][]{
                {1, 1, 2},
                {2, 3, 5},
                {3, 7, 10}
        };
    }
}
