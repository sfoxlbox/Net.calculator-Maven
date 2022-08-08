package net.calculator.po;

import java.util.ArrayList;
import java.util.List;

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

public class Other_Calculators_PO {
WebDriver driver;
	
	
	public Other_Calculators_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
	WebElement Title2;
	
	public void links() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		for (int x =1; x<11;x++)
		{
		WebElement link = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[4]/ul[1]/li["+x+"]/a"));
		link.getText();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5);
		String [] array= new String [] 
				{"Age Calculator","Date Calculator","Time Calculator"
				,"Hours Calculator","GPA Calculator","Grade Calculator"
				,"Concrete Calculator","Subnet Calculator","Password Generator"
						,"Conversion Calculator"};
		List<String> list2 = new ArrayList<String>();
	      for(String text:array) {
	         list2.add(text);}
	      SoftAssert sa = new SoftAssert();
		sa.assertEquals(list2.get(x-1), link.getText());
		System.out.println("link is : "+link.getText());
		System.out.println(list2.get(x-1) + " is Asserted.");
		link.click();
		Thread.sleep(800);
		System.out.println("Title of the Page :"+Title2.getText());
		driver.navigate().back();
		Thread.sleep(1000);
		}
	} 
}
