package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Loan_Calculator_PO;

public class Loan_CalculatorTest extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/loan-calculator.html");
	}
	
	
	
	@Test
	public void Test() throws InterruptedException 
	{
		Loan_Calculator_PO ret = new Loan_Calculator_PO(driver);
		Thread.sleep(2000);
		ret.cloanamount("14000");
		ret.cloanterm("2");
		ret.cloantermmonth("2");
		ret.cinterestrate("6");
		ret.ccompound(5);
		ret.cpayback(6);
		Thread.sleep(1000);
		ret.test1();
		ret.test2();
		
	}
	@AfterMethod
	public  void TearDown()
	{
		
		driver.close();
		driver.quit();
		
	}
}
