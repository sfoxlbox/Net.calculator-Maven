package net.calculator.po;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class unsplash_PO {
WebDriver driver;
	
	
	public unsplash_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.XPATH, using= "//*[@id=\"app\"]/div/header/nav/div[9]/div/div[2]/div/div[1]/button")
	WebElement gotit;
	
	@FindBy (how =How.XPATH, using= "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/form/div[1]/input")
	WebElement search;
	
	@FindBy (how =How.XPATH, using= "//img[@alt='woman in green, gold, and red sari dress hiding her right eye while smiling']")
	WebElement image1;
	@FindBy (how =How.XPATH, using= "//button[contains(text(),'Load more photos')]")
	WebElement botton;
	
	public void links(String input) throws InterruptedException, IOException
	{
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Actions action = new Actions(driver);
		
		//Title.click();
		//Thread.sleep(2000);
		action.moveToElement(gotit).click().perform();
		//Thread.sleep(1000);
		action.moveToElement(search).click().perform();
		search.sendKeys(input);
		action.moveToElement(search).sendKeys(Keys.ENTER).perform();
		//Thread.sleep(2000);
		//action.moveToElement(botton).sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.F5).perform();
		for (int y=1; y < 4; y++) {
		for (int x=1; x < 5; x++) {
			WebElement image = driver.findElement(By.xpath("//div[1]/div["+y+"]/figure["+x+"]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/img[1]"));
		action.moveToElement(image).build().perform();
		//Thread.sleep(500);
		action.moveToElement(image).click().perform();
		//Thread.sleep(1000);
		WebElement image2 = driver.findElement(By.xpath("//button[1]/div[2]/div[2]/div[1]/img[1]"));
		if (image2 != null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			image2.isDisplayed();
		}else if (image2 == null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			action.moveToElement(image2).build().perform();
			image2.isDisplayed();
		}
		
		File srcFile = (image2.getScreenshotAs(OutputType.FILE));
		FileUtils.copyToDirectory(srcFile, new File("C:\\net.calculator_Maven\\Screenshots"));
		
	
		Assert.assertEquals(image2.isDisplayed(), true);
		System.out.println("Picture "+ x + " Of Line "+ y + " is Asserted");
		action.sendKeys(Keys.ESCAPE).perform();
		//Thread.sleep(2000);
		}
		action.sendKeys(Keys.F5).perform();
		}
		
	}
}
