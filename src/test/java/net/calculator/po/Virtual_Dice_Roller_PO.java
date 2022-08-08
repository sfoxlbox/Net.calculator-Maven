package net.calculator.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Virtual_Dice_Roller_PO {
WebDriver driver;
	
	
	public Virtual_Dice_Roller_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
	WebElement Title2;
	@FindBy (how =How.XPATH, using= "//tbody/tr[1]/td[2]/div[1]/input[1]")
	WebElement lenrange;
	
	@FindBy (how =How.XPATH, using= "//div[@id='resultid']")
	WebElement resultid;
	
	@FindBy (how =How.NAME, using= "lennumber")
	WebElement lennumber;
	
	@FindBy (how =How.NAME, using= "submit1")
	WebElement submit1;
	
	
	
	public void mover(int x,String y) throws InterruptedException
	{
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,80)", "");
		lenrange.getTagName();
		lenrange.isSelected();
		lennumber.click();
		lennumber.clear();
		lennumber.sendKeys(Keys.BACK_SPACE);
		lennumber.sendKeys(y);
		Thread.sleep(500);
		lennumber.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		lennumber.clear();
		
		for (int z =0; z<x; z++ )
		{
			Thread.sleep(500);
			 lenrange.sendKeys(Keys.RIGHT);
			Thread.sleep(100);
			submit1.click();
			js.executeScript("window.scrollBy(0,15)", "");
		}
		Thread.sleep(2000);
		}
}
