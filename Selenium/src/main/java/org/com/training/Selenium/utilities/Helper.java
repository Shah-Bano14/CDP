package org.com.training.Selenium.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	//screenshots, frames, alerts, sync issues, java script executor, multiple windows
	static Logger logger = LogManager.getLogger(Helper.class);
	public static void captureScreenshot(WebDriver driver)
	{
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File("./Screenshots/"+settimeStampForScreenshots()+".png"));
		} catch (IOException e) {
			logger.info("unable to capture screenshots");
		}
	}
	
	
	public static String settimeStampForScreenshots()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date curr =new Date();
		return customFormat.format(curr);
	}
	{
		
}
}