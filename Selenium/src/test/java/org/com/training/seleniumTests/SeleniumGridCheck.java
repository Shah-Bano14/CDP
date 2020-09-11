package org.com.training.seleniumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridCheck {

	WebDriver driver;
	static Logger logger = LogManager.getLogger(HomeTask2.class);

	@Test
	public void testUsingGrid() throws MalformedURLException {

		ChromeOptions options = new ChromeOptions();
		String url = "http://10.71.11.243:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(url), options);
		driver.get("https://www.igniteui.com/editors/date-picker-overview");

	}

	@Test
	public void DatePickerTest() throws InterruptedException {
		logger.info("setup the driver");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shah_Bano\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.igniteui.com/editors/date-picker-overview");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String dateToEnter = "14/12/2020";
		String[] newDate = dateToEnter.split("/");
		LocalDate l = LocalDate.now();
		String[] currentDate = l.toString().split("-");
		int yeardiff= Integer.valueOf(newDate[2])-Integer.valueOf(currentDate[0]);
		int monthdiff= Integer.valueOf(newDate[1])-Integer.valueOf(currentDate[1]);
		int diff=yeardiff*12 + monthdiff;
		
	//set month and year
		driver.findElement(By.xpath("//*[@id='departure_calendarButton']")).click();
		if(diff<0)
		{
			WebElement prev = driver.findElement(By.xpath("//*[text()='Prev']"));
			for(int i=0;i>diff;i--)
			{
				prev.click();
			}
		}
		if(diff>0)
		{
			//WebElement next = driver.findElement(By.xpath("//*[@title='Next']"));
			for(int i=0;i<diff;i++)
			{
				 driver.findElement(By.xpath("//*[@title='Next']")).click();
			}
		}
		
		List<WebElement> dateList=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//*[@data-event='click']/a"));
		for(int i=0;i<dateList.size();i++ )
		{
			if(dateList.get(i).getText().equals(newDate[0]))
				try{
				dateList.get(i).click();
				}catch(StaleElementReferenceException e)
			{
					logger.equals(e);
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
