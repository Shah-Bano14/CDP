package org.epam.learn;

import org.testng.Assert;
import org.testng.annotations.*;

public class TrainingDay2Test5 {

    @BeforeClass
    public void ensureNetworkConnection(){
        System.out.println("Network connection is established and in good condition !");
    }

    @AfterClass
    public void closeNetworkConnection(){
        System.out.println("Network connection is closed !");
    }

    @BeforeMethod
    public void clearCache(){
        System.out.println("Clearing cache before next test step");
    }

    @AfterMethod
    public void verifyBrowser(){
        System.out.println("Browser is still open");
    }

    @Test(priority = 0)
    public void openBrowser(){
        System.out.println("Open a browser");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 1, dependsOnMethods = {"openBrowser"})
    public void enterUserName(){
        System.out.println("Enter user name");
    }

    @Test(priority = 1, dependsOnMethods = {"openBrowser", "enterUserName"})
    public void enterPassword(){
        System.out.println("Enter password");
    }

    @Test(priority = 3)
    public void clickLogin(){
        System.out.println("Click login button");
    }

    @Test(priority = 4, groups = {"smokeTest"})
    public void closeBrowser(){
        System.out.println("Close the browser");
    }

}
