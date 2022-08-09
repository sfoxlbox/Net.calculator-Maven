package net.calculator.po;

import java.util.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		//Actions action = new Actions(driver);
		 List<WebElement> elements = driver.findElements(By.tagName("a"));
		 List<WebElement> elements2 = driver.findElements(By.xpath("//a[contains(text(),' ')]"));
		    
		    System.out.println("Number of elements:" + elements.size());
		for ( WebElement e : elements) {
			if(e.getText() != "") {
				System.out.println(e.getText());
			}else {
					
			}
		
		}
		System.out.println("Number of elements:" + elements.size());
		    	
		
		    }}
		
	

