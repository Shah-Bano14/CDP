package org.com.training.seleniumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hometask1 {

	WebDriver driver;
	static Logger logger = LogManager.getLogger(Hometask1.class);

	@BeforeMethod
	public void setupDriver() {
		logger.info("setup the driver");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shah_Bano\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("opening amazon website");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@class='nav-input'][@value='Go']")).click();
		// int resultWithoutPrime =
		// driver.findElements(By.xpath(".//*[@data-component-type='s-search-result']")).size();
		String resultWithoutPrime = driver
				.findElement(By
						.xpath(".//*[@id='search']//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"))
				.getText();
		logger.info("number without prime membership " + resultWithoutPrime);

		// clicking on prime button
		driver.findElement(By.xpath("//li[@id='p_85/10440599031']//label//i[contains(@class,'a-icon-checkbox')]"))
				.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		// getting result after prime click
		String resultWithPrime = driver
				.findElement(By
						.xpath(".//*[@id='search']//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"))
				.getText();
		logger.info("number with prime membership " + resultWithPrime);

		List<WebElement> mobileLinks = driver.findElements(
				By.xpath("//div[@data-component-type='s-search-result']//a[@class='a-link-normal a-text-normal']"));
		Iterator<WebElement> itr = mobileLinks.iterator();
		logger.info("printing list of mobile phones");
		while (itr.hasNext()) {
			logger.info(itr.next().getText());
		}
		driver.quit();

	}

	@Test
	public void testUsingGivenXpath() {

		driver.findElement(By.xpath("//div[@id='nav-search']//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//div[@id='nav-search']//input[@type='submit']")).click();
		// int resultWithoutPrime =
		// driver.findElements(By.xpath(".//*[@data-component-type='s-search-result']")).size();
		String resultWithoutPrime = driver
				.findElement(By
						.xpath("//div[@id='nav-search']/parent::div/parent::div/parent::div/parent::header/following::div[@id='search']//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"))
				.getText();
		logger.info("number without prime membership " + resultWithoutPrime);

		// clicking on prime button
		driver.findElement(By
				.xpath("//div[@id='nav-search']/parent::div/parent::div/parent::div/parent::header/following::div//li[@id='p_85/10440599031']//label//i[contains(@class,'a-icon-checkbox')]"))
				.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		// getting result after prime click
		String resultWithPrime = driver
				.findElement(By
						.xpath("//div[@id='nav-search']/parent::div/parent::div/parent::div/parent::header/following::div[@id='search']//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"))
				.getText();
		logger.info("number with prime membership " + resultWithPrime);

		List<WebElement> mobileLinks = driver.findElements(By.xpath(
				"//div[@id='nav-search']/parent::div/parent::div/parent::div/parent::header/following::div[@id='search']//*[@data-component-type='s-search-result']//a[@class='a-link-normal a-text-normal']"));
		Iterator<WebElement> itr = mobileLinks.iterator();
		logger.info("printing list of mobile phones");
		while (itr.hasNext()) {
			logger.info(itr.next().getText());
		}
		driver.quit();

	}
	@Test
	public void testUsingGrid() throws MalformedURLException
	{
		WebDriver driver;
		String url="http://10.71.11.243:4444/wd/hub:";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
			 driver=new RemoteWebDriver(new URL(url), cap);
			 driver.get("www.gmail.com");
	
		
		
	}
	
	
}
