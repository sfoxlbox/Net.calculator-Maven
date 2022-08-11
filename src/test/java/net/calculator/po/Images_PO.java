package net.calculator.po;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Images_PO {
WebDriver driver; 
	
	public Images_PO (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	
	@FindBy (how =How.TAG_NAME, using= "h1")
	WebElement Title2;
	
	@SuppressWarnings("null")
	public void images() throws InterruptedException
	{
		for (int x1 =1; x1<2;x1++)
		{
		for (int x =1; x<5;x++)
		{
		Thread.sleep(800);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		WebElement link = driver.findElement(By.xpath("//td["+x+"]/div[1]/a/img"));
		
		//WebElement logo = driver.findElement(By.tagName("img"));

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOf(link));
		Actions action = new Actions(driver);
		SoftAssert sa = new SoftAssert();
		
		
		action.sendKeys(Keys.F5);
		String text;
		switch (x) {
		case 1 : text ="Financial Calculators";
		break;
		case 2 : text ="Fitness and Health Calculators";
		break;
		case 3 : text ="Math Calculators";
		break;
		case 4 : text ="Other Calculators";
		break;
		default: text = "fix it"; 
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[\"+x+\"]/div[1]/a/img")));
		//sa.assertEquals(logo.isDisplayed(), true);
		System.out.println("Logo "+x+ " is Asserted");
		if (link != null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			link.click();
		}else if (link == null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			action.moveToElement(link).build().perform();
			link.click();
		}
		Thread.sleep(1000);
		sa.assertEquals(Title2.getText(),text );
		System.out.println("Title Text "+x+ " is Asserted");
		driver.navigate().back();
		//Thread.sleep(1000);
		}}
	}
}
