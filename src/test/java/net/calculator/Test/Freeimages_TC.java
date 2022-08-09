package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.freeimages_po;

public class Freeimages_TC extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/financial-calculator.html");
	}
	@Test
	public void Test_location() throws InterruptedException 
	{
		freeimages_po Fitness = new freeimages_po(driver);
		
		Fitness.links();
	}
	  @AfterMethod
	   public  void TearDown()
	   { 
		driver.close();
		driver.quit();
		
	}
}
