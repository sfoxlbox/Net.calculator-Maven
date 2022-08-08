package net.calculator.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Fitness_PO {

	WebDriver driver;
	
	
	public Fitness_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.TAG_NAME, using= "h1")
	WebElement Title2;
	
	@SuppressWarnings("deprecation")
	public void links() throws InterruptedException
	{
		SoftAssert sa = new SoftAssert();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		js.executeScript("window.scrollBy(0,400)", "");
		for (int x =1; x<10;x++)
		{
		WebElement link = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[2]/ul[1]/li["+x+"]/a"));
		link.getText();
		//Thread.sleep(2000);
		System.out.println("link is : "+link.getText());
		action.sendKeys(Keys.F5);
		String text;
		switch (x) {
		case 1 : text ="BMI Calculator";
		break; 
		case 2 : text ="Calorie Calculator";
		break;
		case 3 : text ="Body Fat Calculator";
		break;
		case 4 : text ="BMR Calculator";
		break;
		case 5 : text ="Ideal Weight Calculator";
		break;
		case 6 : text ="Pace Calculator";
		break;
		case 7 : text ="Pregnancy Calculator";
		break;
		case 8 : text ="Pregnancy Conception Calculator";
		break;
		case 9 : text ="Due Date Calculator";
		break;
		
		default: text = "fix";
		}
		Thread.sleep(1000);
		sa.assertEquals(link.getText(),text );
		link.click();
		action.sendKeys(Keys.F5);
		System.out.println("link "+text+ " is Asserted");
		//Thread.sleep(1000);
		System.out.println("Title of the Page :"+Title2.getText());
		System.out.println(text);
		driver.navigate().back();
		//Thread.sleep(1000);
		}
		
	}

}
