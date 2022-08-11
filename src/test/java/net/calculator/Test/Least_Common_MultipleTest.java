package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Least_Common_Multiple_PO;


public class Least_Common_MultipleTest extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/lcm-calculator.html");
	}
	@Test
	public void Test_Other() throws InterruptedException 
	{
		Least_Common_Multiple_PO Other = new Least_Common_Multiple_PO(driver);
		
		Other.infulltxarea("445","448","78", "559");
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}