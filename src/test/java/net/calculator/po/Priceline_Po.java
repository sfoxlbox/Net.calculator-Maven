package net.calculator.po;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Priceline_Po {
WebDriver driver;
	
	
	public Priceline_Po(WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.XPATH, using= "//div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[1]")
	WebElement StartDate;
	
	@FindBy (how =How.XPATH, using= "//input[@id='hotelDates']")
	WebElement Date;
	
	@FindBy (how = How.CSS, using =".CalendarCard__Arrow-sc-1jxm5yu-2 path")
	WebElement next;
	@FindBy (how = How.XPATH, using="//*[@id=\"hotel-date-range-box\"]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]")
	WebElement InsertDate;
	@FindBy (how = How.XPATH, using= "//div[4]/div[3]/div[17]/div[1]/div[1]")
	WebElement date1;
	@FindBy (how = How.XPATH, using= "//div[4]/div[3]/div[37]/div[1]/div[1]")
	WebElement date2;
	@FindBy (how = How.XPATH, using= "//div[2]/div/div/div/div/div/div[4]/div[1]")
	WebElement exactmonth;
	@FindBy (how = How.XPATH, using= "//div [ contains (text(), 'Cruises' )]")
	WebElement Cruises;
	@FindBy (how = How.XPATH, using= "//div [ contains (text(), 'Cars' )]")
	WebElement Cars;
	@FindBy (how = How.XPATH, using= "//div [ contains (text(), 'Bundle ' )]")
	WebElement BundleSave;
	@FindBy (how = How.XPATH, using= "//div [ contains (text(), 'Flights' )]")
	WebElement Flights;
	
	
	// hotelDates
	
	public void move(String month, String Year) throws InterruptedException {
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			
		action.moveToElement(Date).click().perform();
		
		for (int x =0; x< 10; x++) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(BundleSave));
		BundleSave.click();
		
		wait.until(ExpectedConditions.visibilityOf(Cruises));
		Cruises.click();
		
		wait.until(ExpectedConditions.visibilityOf(Flights));
		Flights.click();
		
		wait.until(ExpectedConditions.visibilityOf(Cars));
		Cars.click();
		
		action.sendKeys(Keys.CLEAR);
		}
		
	}
	}

