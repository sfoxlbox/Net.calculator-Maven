package net.calculator.po;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Main_Financial_PO {

     WebDriver driver;
	
	public Main_Financial_PO(WebDriver driver) {  // creating constractor
		this.driver = driver;            
		PageFactory.initElements(driver, this); 
	}
		@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
		WebElement Title2;
		
		
	
		
		@SuppressWarnings("unused")
		public void links() throws InterruptedException 
		{

			Thread.sleep(500);
			List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr[1]/td[1]/div"));
			System.out.println("Number of elements:" +elements.size());
			SoftAssert sa = new SoftAssert();
			int num = 30;
			for (int x =1; x<num;x++)
			{
				driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
			WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div["+x+"]/a[1]"));
			Actions action = new Actions(driver);
			action.moveToElement(link).build().perform();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,50)", link);
			
			//Thread.sleep(4000);
			link.getText();
			
			String [] array= new String [] 
					{"Mortgage Calculator", 
					"Amortization Calculator",
					"Mortgage Payoff Calculator",
					"House Affordability Calculator",
					"Rent Calculator",
					"Debt-to-Income Ratio Calculator",
					"Real Estate Calculator",
					"Refinance Calculator",
					"Rental Property Calculator",
					"APR Calculator",
					"FHA Loan Calculator",
					"VA Mortgage Calculator",
					"Down Payment Calculator",
					"Rent vs. Buy Calculator",
					"Auto Loan Calculator",
					"Cash Back or Low Interest Calculator",
					"Auto Lease Calculator",
					"Interest Calculator",
					"Investment Calculator",
					"Finance Calculator",
					"Compound Interest Calculator",
					"Interest Rate Calculator", 
					"Savings Calculator",
					"CD Calculator",
					"Average Return Calculator",
					"ROI Calculator",
					"Payback Period Calculator",
					"Present Value Calculator",
					"Future Value Calculator"};
			List<String> list2 = new ArrayList<String>();
		      for(String text:array) {
		         list2.add(text);}
		      /*for(String e : array) {
		    	  System.out.println(e);
		      }*/
			sa.assertEquals(list2.get(x-1), link.getText());
			System.out.println(list2.get(x-1) + " is Asserted.");
			if (link != null) {
				driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
				link.click();
			}else if (link == null) {
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				action.moveToElement(link).build().perform();
				link.click();
			}
			//Thread.sleep(3000);
			driver.navigate().back();
			
			//Thread.sleep(2000);
			
            }
		}
		@SuppressWarnings("unused")
		public void links2() throws InterruptedException
		{
			Thread.sleep(3000);
			
			for (int y =1; y<34;y++)
			{
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	
			WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div["+y+"]/a[1]"));
			SoftAssert sa = new SoftAssert();
			Actions action = new Actions(driver);
			action.moveToElement(link).build().perform();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,50)", link);
			//Thread.sleep(3000);
			link.getText();
			action.sendKeys(Keys.F5);
			String [] array= new String [] 
					{        "Retirement Calculator","401K Calculator",
							 "Pension Calculator","Social Security Calculator",
							 "Annuity Calculator","Annuity Payout Calculator",
							 "Roth IRA Calculator","IRA Calculator",
							 "Income Tax Calculator","Salary Calculator",
							 "Marriage Tax Calculator","Estate Tax Calculator",
							 "Take-Home-Paycheck Calculator","Loan Calculator",
							 "Payment Calculator","Currency Calculator",
							 "Inflation Calculator","Sales Tax Calculator",
							 "Credit Card Calculator","Credit Cards Payoff Calculator",
							 "Debt Payoff Calculator","Debt Consolidation Calculator",
							 "Repayment Calculator","Student Loan Calculator",
							 "College Cost Calculator","VAT Calculator",
							 "Depreciation Calculator","Margin Calculator",
							 "Discount Calculator","Business Loan Calculator",
							 "Personal Loan Calculator","Lease Calculator",
							 "Budget Calculator"};
			List<String> list2 = new ArrayList<String>();
		      for(String text:array) {
		         list2.add(text);}
			sa.assertEquals(list2.get(y-1), link.getText());
			System.out.println(list2.get(y-1) + " is Asserted.");
			if (link != null) {
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				link.click();
			}else if (link == null) {
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				action.moveToElement(link).build().perform();
				link.click();
			}
			//Thread.sleep(3000);
			driver.navigate().back();
			//Thread.sleep(2000);
			
			
            }
			
			}
		}
