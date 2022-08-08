package net.calculator.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import net.calculator.base;
import net.calculator.po.Financial_PO;
import net.calculator.po.Fitness_PO;
import net.calculator.po.Images_PO;
import net.calculator.po.Least_Common_Multiple_PO;
import net.calculator.po.Main_Financial_PO;
import net.calculator.po.Math_PO;
import net.calculator.po.Mortgage_PO;
import net.calculator.po.Other_Calculators_PO;
import net.calculator.po.Virtual_Dice_Roller_PO;
import net.calculator.po.unsplash_PO;


//@RunWith(Parameterized.class)
public class Main_Test extends base{

	WebDriver driver;
	
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/");

	}
	@Test(priority =1)
	public void Test_calculator() throws InterruptedException 
	{
		net.calculator.po.Calculator_PO poc = new net.calculator.po.Calculator_PO(driver);
	for (int x =0; x<1; x++)	
	{
		
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
		poc.Title();
		poc.SearchField();
		poc.Search();
		poc.GetTitle();
		poc.logo();
	}
	}
	
	@Test(priority =2)
	public void Test_Images() throws InterruptedException 
	{
		Images_PO images = new Images_PO(driver);
		
		images.images();
	}
	@Test(priority =4)
	public void Test_Fitness() throws InterruptedException 
	{
		Fitness_PO Fitness = new Fitness_PO(driver);
		
		Fitness.links();
	}
	@Test(priority =4)
	public void Test_Financial() throws InterruptedException 
	{
		Financial_PO Financial = new Financial_PO(driver);
		
		Financial.links();
	}
	@Test(priority = 5)
	public void Test_Finanial_Main() throws InterruptedException 
	{
		Main_Financial_PO mf = new Main_Financial_PO(driver);
		driver.get("https://www.calculator.net/financial-calculator.html");
		mf.links();
		mf.links2();
	}
	@Test(priority =6)
	public void Test_Math() throws InterruptedException 
	{
        Math_PO Math = new Math_PO(driver);
		Math.links();
	}
	@Test(priority =7)
	public void Test_Other() throws InterruptedException 
	{
		Other_Calculators_PO Other = new Other_Calculators_PO(driver);
		
		Other.links();
	}
	@Test(priority =8)
	public void Test_Mortgage() throws InterruptedException 
	{
		Mortgage_PO po = new Mortgage_PO(driver);
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		po.Home_Price("420000"); 
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
	@Test(priority = 9)
	public void Test_Least_Common_Multiple() throws InterruptedException 
	{
		Least_Common_Multiple_PO Other = new Least_Common_Multiple_PO(driver);
		driver.get("https://www.calculator.net/lcm-calculator.html");
		Other.infulltxarea("112","885","74", "77");
	}
	@Test(priority = 10)
	public void Test_Virtual_Dice_Roller() throws InterruptedException 
	{
		Virtual_Dice_Roller_PO vdr = new Virtual_Dice_Roller_PO(driver);
		driver.get("https://www.calculator.net/dice-roller.html");
		vdr.mover(15,"5");
	}
	@Test(priority = 11)
	public void Test_unsplash() throws InterruptedException, IOException 
	{
		unsplash_PO Other = new unsplash_PO(driver);
		driver.get("https://unsplash.com/");
		Other.links("cat");
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		
	}
}
