package net.calculator.po;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Math_PO {
WebDriver driver;
	
	
	public Math_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
	WebElement Title2;
	
	public void links() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		for (int x =1; x<7;x++)
		{
		WebElement link = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[3]/ul[1]/li["+x+"]/a"));
		Thread.sleep(2000);
		String text;
		switch (x) {
		case 1 : text ="Scientific Calculator";
		break;
		case 2 : text ="Fraction Calculator";
		break;
		case 3 : text ="Percentage Calculator";
		break;
		case 4 : text ="Random Number Generator";
		break;
		case 5 : text ="Triangle Calculator";
		break;
		case 6 : text ="Standard Deviation Calculator";
		break;
		default: text = "fix";
		}
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(link.getText(),text );
		
		System.out.println("Asserted: "+link.getText());
		link.click();
		System.out.println("link "+text+ " is verified");
		Thread.sleep(1000);
		System.out.println("Title of the Page :"+Title2.getText());
		driver.navigate().back();
		Thread.sleep(1000);
		}
	}
}
