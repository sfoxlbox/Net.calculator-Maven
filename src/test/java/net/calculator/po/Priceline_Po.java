package net.calculator.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy (how = How.XPATH, using= "//div [ contains (text(), 'Bundle & Save' )]")
	WebElement BundleSave;
	@FindBy (how = How.XPATH, using= "//div [ contains (text(), 'Flights' )]")
	WebElement Flights;
	
	
	// hotelDates
	
	public void move(String month, String Year) throws InterruptedException {
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		action.moveToElement(Date).click().perform();
		Thread.sleep(500);
		
		
		Thread.sleep(500);
		action.moveToElement(Cruises).click().perform();
		Thread.sleep(500);
		action.moveToElement(BundleSave).click().perform();
		Thread.sleep(500);
		action.moveToElement(Flights).click().perform();
		Thread.sleep(500);
		action.moveToElement(Cars).click().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.CLEAR);
		Thread.sleep(2000);
		
	}
	}

