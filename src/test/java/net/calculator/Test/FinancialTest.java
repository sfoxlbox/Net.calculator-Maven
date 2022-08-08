package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import net.calculator.base;
import net.calculator.po.Financial_PO;

public class FinancialTest extends base{
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
		Financial_PO Financial = new Financial_PO(driver);
		
		Financial.links();
	}
	@AfterMethod
	public  void TearDown()
	{ 
		 teardown( driver);
		
	}
}
