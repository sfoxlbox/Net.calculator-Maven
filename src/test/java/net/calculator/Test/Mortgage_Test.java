package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Mortgage_PO;

public class Mortgage_Test  extends base{

	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		
		driver = setproperty();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
	}
	@Test
	public void Test() throws InterruptedException
	{
		 
		Mortgage_PO po = new Mortgage_PO(driver);
		
		
		po.Home_Price("520000"); 
		po.Down_Payment("25");
		po.Loan_Term("15");
		po.Interest_Rate("2.3");
		po.cstartmonth(7);
		po.cstartyear("2022");
		po.optional();
		po.cpropertytaxes("1.2");
		po.insurance("1520");
		po.cpmi("0");
		po.HOA_Fee("250");
		po.Other_Costs("5600");
		po.Calculate();
		po.Monthly_Payment();
		po.PayoffDate();
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}

