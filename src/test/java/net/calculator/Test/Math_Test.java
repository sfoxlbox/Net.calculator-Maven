package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Math_PO;



public class Math_Test extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/");
	}
	@Test
	public void Test_Math() throws InterruptedException 
	{
		Math_PO Math = new Math_PO(driver);
		
		Math.links();
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}
