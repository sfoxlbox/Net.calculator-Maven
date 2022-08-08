package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Main_Financial_PO;


public class Main_FinancialTest extends base{
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/financial-calculator.html");
		
		Thread.sleep(1000);
	}
	
	@Test(priority =1)
	public void Test_Links1() throws InterruptedException 
	{
		Main_Financial_PO all = new Main_Financial_PO(driver);
		
		
		all.links();
		
		
	}
	
	@Test(priority = 2)
	public void Test_Links2() throws InterruptedException 
	{
		Main_Financial_PO all = new Main_Financial_PO(driver);
		
		all.links2();
	}
	@AfterMethod
	public  void TearDown() 
	{
		driver.close();
		driver.quit();
		
	}
}

