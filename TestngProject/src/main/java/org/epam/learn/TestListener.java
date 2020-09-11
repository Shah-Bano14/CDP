package org.epam.learn;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test execution is started");
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test case is PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test case is FAILED");
    }

}
