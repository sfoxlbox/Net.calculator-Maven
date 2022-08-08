package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Priceline_Po;

public class PricelineTest extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.priceline.com/");
	}
	@Test
	public void Google_PO() throws InterruptedException {
		
		Priceline_Po x = new Priceline_Po(driver);
		
		x.move("March", "2023");
	}
	@AfterMethod
	public  void TearDown()
	{
		
		driver.close();
		driver.quit();
		
	}
}
