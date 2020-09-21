package org.com.training.Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyTestListener implements ITestListener {

    @Override
	public void onStart(ITestContext context) {
	    System.out.println("I entered onStart");
	} 
    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test execution is started" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test case is PASSED" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test case is FAILED" + result.getName());
    }
    
    @Override
    public void onFinish(ITestContext result)
    {
    	 System.out.println("Test case is finished" + result.getName());
    }
}

