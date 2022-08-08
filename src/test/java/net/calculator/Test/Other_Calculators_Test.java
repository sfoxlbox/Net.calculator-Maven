package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Other_Calculators_PO;



public class Other_Calculators_Test extends base{
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/");
	}
	@Test
	public void Test_Other() throws InterruptedException 
	{
		Other_Calculators_PO Other = new Other_Calculators_PO(driver);
		
		Other.links();
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}