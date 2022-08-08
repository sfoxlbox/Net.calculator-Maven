package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Calculator_PO;

public class Calculator_Test extends base {
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/");
	}
	@Test
	public void Test_Calculator() throws InterruptedException 
	{
		
	for (int x =0; x<1; x++)	
	{
		Calculator_PO poc = new Calculator_PO(driver);
		
		poc.calculator(2,3,1);	
		poc.calculator(2,3,2);	
		poc.calculator(2,1,4);	
		poc.calculator(2,2,3);	 
		poc.calculator(2,5,4);	
		poc.calculator(1,3,2);	
		poc.calculator(1,3,3);	
		poc.calculator(1,4,1);
		poc.calculator(2,3,2);
		poc.calculator(2,1,4);	
		poc.calculator(1,1,1);	
		poc.calculator(2,2,1);	
		poc.calculator(2,2,2);	
		poc.calculator(1,5,2);
		poc.calculator(2,5,3);
		poc.calculator(2,1,3);
		poc.Title();
		poc.SearchField();
		poc.Search();
		poc.GetTitle();
		poc.logo();
	}
	}
	
	@AfterMethod
	public  void TearDown()
	{ 
		driver.close();
		driver.quit();
		
	}
}
