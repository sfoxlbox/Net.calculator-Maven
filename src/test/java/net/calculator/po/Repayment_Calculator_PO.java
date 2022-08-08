package net.calculator.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Repayment_Calculator_PO {
	 WebDriver driver;
		
		public Repayment_Calculator_PO(WebDriver driver) {  // creating constractor
			this.driver = driver;            
			PageFactory.initElements(driver, this); 
		}
			@FindBy (how =How.XPATH, using= "//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
			WebElement cloanamount;
			
			@FindBy (how =How.XPATH, using= "//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
			WebElement cupfrontfee;
			
			@FindBy (how =How.XPATH, using= "//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")
			WebElement cinterestrate;
			
			@FindBy (how =How.XPATH, using= "//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/select[1]")
			WebElement ccompound;
			
			@FindBy (how =How.XPATH, using= "//table[1]/tbody[1]/tr[5]/td[2]/select[1]")
			WebElement cpayback;
			
			@FindBy (how =How.XPATH , using= "//tbody/tr[6]/td[1]/div[1]/label[1]")
			WebElement cpaybackway1;
			
			@FindBy (how =How.XPATH , using= "//tbody/tr[6]/td[1]/div[1]/label[2]")
			WebElement cpaybackway2;
			
			@FindBy (how =How.XPATH , using= "//tbody/tr[7]/td[1]/input[2]")
			WebElement calculate;
			
			@FindBy (how =How.XPATH , using= "//*[name()='path' and contains(@fill,'#8bbc21')]") 
			WebElement circle1;
			
			@FindBy (how =How.XPATH , using= "//*[name()='path' and contains(@fill,'#0d233a')]")
			WebElement circle2;
			
			@FindBy (how =How.XPATH , using= "//*[name()='path' and contains(@fill,'#2f7ed8')]")
			WebElement circle3;
			
			//*[name()='path' and contains(@fill,'#0d233a')]
			
			public void cloanamount(String x) throws InterruptedException
			
			{
				
				Thread.sleep(800);
				cloanamount.click();
				cloanamount.clear();
				cloanamount.sendKeys(x);
			}
			public void cupfrontfee(String x) {
				
				cupfrontfee.click();
				cupfrontfee.clear();
				cupfrontfee.sendKeys(x);
			}
			public void cinterestrate(String x) {
				
				cinterestrate.click();
				cinterestrate.clear();
				cinterestrate.sendKeys(x);
			}
			public void ccompound(int x) {
				ccompound.click();
				Select select = new Select(ccompound);
				select.selectByIndex(x);
			}
			public void cpayback(int x) {
				
				cpayback.click();
				Select select1 = new Select(cpayback);
				select1.selectByIndex(x);
				}
			public void cpaybackway1() {
				
				cpaybackway1.click();
				cpaybackway1.getText();
				Assert.assertEquals(cpaybackway1.getText(), "Fixed Loan Term");
			}
			public void cpaybackway2() {
				
				cpaybackway2.click();
				cpaybackway1.getText();
				Assert.assertEquals(cpaybackway2.getText(), "Fixed Installments");
			}
			public void calculate() {
	
				calculate.click();
			}
			public void circle() throws InterruptedException {
				
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				
				Actions action = new Actions(driver);
				//action.moveToElement(circle1).click().perform();
				Thread.sleep(1000);
				//action.moveToElement(circle2).click().perform();
				Thread.sleep(1000);
				action.moveToElement(circle3).click(circle3).perform();
				Thread.sleep(1000);
				
			}
				
				
			}
			
			
			

