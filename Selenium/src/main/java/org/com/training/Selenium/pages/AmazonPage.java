package org.com.training.Selenium.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xddf.usermodel.TileFlipMode;
import org.com.training.seleniumTests.Hometask1;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class AmazonPage {

	WebDriver driver;
	static Logger logger = LogManager.getLogger(Hometask1.class);

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchTab;

	@FindBy(xpath = "//input[@class='nav-input'][@value='Go']")
	private WebElement searchButton;

	@FindBy(xpath = ".//*[@id='search']//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")
	private WebElement resultvalueOnSearch;

	@FindBy(xpath = "//li[@id='p_85/10440599031']//label//i[contains(@class,'a-icon-checkbox')]")
	private WebElement primeButton;

	@FindBy(xpath = "//div[@data-component-type='s-search-result']//a[@class='a-link-normal a-text-normal']")
	private List<WebElement> mobileLinks;

	@FindBy(xpath = "//*[contains(text(),'Apple iPhone 11 (128GB) - Black')]//ancestor::a")
	private WebElement mobilePath;

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartButton;

	@FindBy(xpath = "//*[contains(text(),'Get It Today')]//ancestor::a//input//following::i")
	private WebElement deliveryCheckbox;

	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	private WebElement computerTab;

	@FindBy(xpath = "//*[contains(text(),'Clear')]//ancestor::li//following::li//i")
	private WebElement madeInAmazon;

	@FindBy(xpath = "//*[contains(text(),'Made for Amazon')]")
	private WebElement madeForAmazonInHeader;

	@FindBy(xpath = "//*[text()='pantry']")
	WebElement pantry;

	public AmazonPage(WebDriver driver) {
		this.driver = driver;
	}

	// search on amazon page
	public void doSearch(String searchTerm) {
		searchTab.sendKeys(searchTerm);
		searchButton.click();

	}

	// do prime product search on amazon Page
	public void doPrimeClick() {
		while (!primeButton.isDisplayed()) {
			driver.navigate().refresh();
		}
		primeButton.click();
	}

	// get count of result on search
	public String getCountOfResults() {
		driver.navigate().refresh();
		return resultvalueOnSearch.getText();

	}

	// get list of results on a particular search
	public List<String> getListOfResultsOnSearch() {
		List<WebElement> mobileLinkList = mobileLinks;
		List<String> resultList = new ArrayList<String>();
		Iterator<WebElement> itr = mobileLinkList.iterator();
		while (itr.hasNext()) {
			resultList.add(itr.next().getText());
		}
		return resultList;

	}

	// get page title
	public String getPageTitle() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.getTitle();
	}

	// navigate back to the previous page
	public void navigateBack() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().back();
	}

	// open a search result for mobile in new tab
	public void openPhoneInNewTab() {
		mobilePath.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	// add result to cart on the new tab , create an alert, close it, get back
	// to previous window
	public void AddToCartAndComeBackToPreviousWindow() {
		String oldTab = driver.getWindowHandle();
		ArrayList<String> tabList = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabList.get(1));
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(addToCartButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addToCartButton);
		js.executeScript("alert('Item Saved To Cart');");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.close();
		driver.switchTo().window(oldTab);
		Actions action = new Actions(driver);
		action.click(deliveryCheckbox).build().perform();

	}

	// open computer tab from homepage
	public void openComputertab() {
		Wait wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		try {
			wait.until(ExpectedConditions.visibilityOf(computerTab));
			computerTab.click();

		} catch (ElementNotVisibleException e) {
			logger.info("element is not visible on page");
			e.printStackTrace();
		}

	}

	// clicks on made in amazon
	public void clickMadeInAmazon() {
		madeInAmazon.click();
	}

	// checks if made for amazon is present in header
	public boolean CheckMadeForAmazonInHeader() {
		return madeForAmazonInHeader.isDisplayed();
	}

	public void pantryClick() {
		pantry.click();
	}
}
