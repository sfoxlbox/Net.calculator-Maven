package net.calculator.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Images_PO;

public class ImagesTest extends base{
WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/");
	}
	@Test
	public void Test_Images() throws InterruptedException 
	{
		Images_PO images = new Images_PO(driver);
		
		images.images();
		
	}
	@AfterMethod
	public  void TearDown()
	{
		
		driver.close();
		driver.quit();
		
	}
}
