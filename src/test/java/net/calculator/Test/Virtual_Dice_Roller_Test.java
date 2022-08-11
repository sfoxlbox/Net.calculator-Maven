package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Virtual_Dice_Roller_PO;


public class Virtual_Dice_Roller_Test extends base{

	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/dice-roller.html");
	}
	@Test
	public void Test_Virtual_Dice_Roller() throws InterruptedException 
	{
		Virtual_Dice_Roller_PO vdr = new Virtual_Dice_Roller_PO(driver);
		
		vdr.mover(10,"18");
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}

