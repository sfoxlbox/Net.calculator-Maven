package net.calculator.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.unsplash_2;

public class Unspashed_2_Test extends base{
	
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://unsplash.com/");
	}
	@Test
	public void Test() throws InterruptedException, IOException 
	{
		unsplash_2 zz = new unsplash_2(driver);
		
		zz.links();
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}
