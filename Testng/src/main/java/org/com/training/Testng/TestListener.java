package org.com.training.Testng;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter implements ITestListener {


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
