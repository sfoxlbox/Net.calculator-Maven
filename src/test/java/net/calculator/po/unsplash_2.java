package net.calculator.po;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class unsplash_2 {
WebDriver driver;
	
	
	public unsplash_2 (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.CLASS_NAME, using= "DG_Wq")
	WebElement svc;
	
	 
	public void links() throws InterruptedException, IOException
	{
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5);
		action.sendKeys(Keys.F5);
		HashSet<String> h_set = new HashSet<String>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		    System.out.println("Number of elements:" + elements.size());
		    action.sendKeys(Keys.F5);
		    elements.get(2).toString();
		for ( WebElement e : elements) {
			if(e.getText() != "") {
				System.out.println(e.getText());
			}else {
					
			}
			
			h_set.add(e.getText());
		}
		h_set.toArray();
		
		System.out.println("Number of elements:" + elements.get(9).getText());
		System.out.println("Number of elements:" + elements.get(15).getText());
		System.out.println("Number of elements:" + elements.get(14).getSize());
		
		    }}
		
	

