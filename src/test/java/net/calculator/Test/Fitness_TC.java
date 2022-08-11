package net.calculator.Test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Fitness_PO;
;

public class Fitnesstest extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/");
	}
	@Test
	public void Test_location() throws InterruptedException 
	{
		Fitness_PO Fitness = new Fitness_PO(driver);
		
		Fitness.links();
	}
	@AfterMethod
	public  void TearDown() 
	{
		driver.close();
		driver.quit();
		
	}
}
