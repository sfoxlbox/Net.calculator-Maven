package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Repayment_Calculator_PO;

public class Repayment_Calculator_Test extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/repayment-calculator.html");
	}
	@Test
	public void Test() throws InterruptedException 
	{
		Repayment_Calculator_PO input = new Repayment_Calculator_PO(driver);
		Thread.sleep(2000);
		input.cloanamount("15000");
		input.circle();
		Thread.sleep(2000);
		input.cupfrontfee("720");
		input.cinterestrate("18");
		input.ccompound(8);
		input.cpayback(5);
		input.cpaybackway1();
		input.cpaybackway2();
		input.calculate();
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}
