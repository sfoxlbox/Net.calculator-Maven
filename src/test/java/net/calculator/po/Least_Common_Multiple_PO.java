package net.calculator.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Least_Common_Multiple_PO {
WebDriver driver; 
	
	public Least_Common_Multiple_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	
	@FindBy (how =How.CLASS_NAME, using= "infulltxarea")
	WebElement infulltxarea;
	
	@FindBy (how =How.XPATH, using= "//tbody/tr[1]/td[1]/form[1]/input[1]")
	WebElement Calculate;
	
	@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
	WebElement Title2;
	
	public void infulltxarea(String i,String j , String k, String l) throws InterruptedException
	{

		String [] array= new String [] {i,j,k,l}; // array : 
		
		//List <String> arraylist = new ArrayList<>();
		
		assert Title2 != null: "Least Common Multiple Calculator";
		infulltxarea.click();
		infulltxarea.clear();
		Thread.sleep(2000);
		infulltxarea.isDisplayed();
		
		for(int t =0; t<4; t++)
		{
		infulltxarea.sendKeys(array[t]);
		infulltxarea.sendKeys(",");
		//infulltxarea.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		}
		Thread.sleep(100);
		Calculate.click();
		Thread.sleep(5000);
		
		
		
	}
}
