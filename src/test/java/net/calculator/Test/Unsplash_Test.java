package net.calculator.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.unsplash_PO;

public class Unsplash_Test extends base{
	
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
		unsplash_PO zz = new unsplash_PO(driver);
		
		zz.links("morocco");
	}
	@AfterMethod
	public  void TearDown()
	{
		driver.close();
		driver.quit();
		
	}
}
