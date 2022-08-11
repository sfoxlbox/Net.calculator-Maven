package net.calculator.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Mortgage_PO {
WebDriver driver; 
	
	public Mortgage_PO (WebDriver driver) {  // creating constractor
		this.driver = driver;            
		PageFactory.initElements(driver, this); // 
	}
		public @FindBy (how =How.XPATH, using= "//input[@id='chouseprice']")
		WebElement Home_Price;
		
		public @FindBy (how =How.XPATH, using= "//input[@id='cdownpayment']")
		WebElement Down_Payment;
		
		@FindBy (how =How.ID , using= "cloanterm")
		WebElement Loan_Term;
		
		@FindBy (how =How.ID , using= "cinterestrate")
		WebElement Interest_Rate	;
		
		@FindBy (how =How.ID , using= "cstartmonth")
		WebElement cstartmonth;
		
		@FindBy (how =How.ID , using= "cstartyear")
		WebElement cstartyear;
		
		@FindBy (how =How.XPATH, using= "//b[contains(text(),'Include Options Below')]")
		WebElement optional;
		
		@FindBy ( how = How.ID, using = "cpropertytaxes")
		WebElement cpropertytaxes;
		
		@FindBy ( how = How.ID, using = "chomeins")
		WebElement insurance;
		
		@FindBy (how =How.ID , using= "cpmi")
		WebElement cpmi;
		
		@FindBy (how =How.ID , using= "choa")
		WebElement HOA_Fee;
		
		@FindBy (how =How.ID , using= "cothercost")
		WebElement Other_Costs;
		
		@FindBy ( how = How.XPATH , using = "//*[@cellpadding='3'and width ='100%']/tbody[1]/tr[8]/td[2]")
		WebElement Price;
		
		@FindBy ( how = How.XPATH , using = "//*[@cellpadding='3']/tbody[1]/tr[14]")
		WebElement PayoffDate;
		
		@FindBy ( how = How.XPATH , using = "//input[@type='image']")
		WebElement Calculate;
		
		@FindBy ( how = How.XPATH , using = "//h2[@class='h2result']")
		WebElement Monthly_Payment;
		
		public void Home_Price(String price)
		{
			Home_Price.click();
			Home_Price.clear();
			Home_Price.sendKeys(price);
		}
		public void Down_Payment(String p)
		{
			Down_Payment.click();
			Down_Payment.clear();
			Down_Payment.sendKeys(p);
		}
		public void Loan_Term(String x)
		{
			Loan_Term.click();
			Loan_Term.clear();
			Loan_Term.sendKeys(x);
		}
		public void Interest_Rate(String x)
		{
			Interest_Rate.click();
			Interest_Rate.clear();
			Interest_Rate.sendKeys(x);
		}
		public void cstartmonth(int x) throws InterruptedException
		{
			cstartmonth.click();
			Select select = new Select(cstartmonth);
			select.selectByIndex(x);
			Thread.sleep(500);
			
			
		}
		public void cstartyear(String x)
		{
			cstartyear.click();
			cstartyear.clear();
			cstartyear.sendKeys(x);
			
		}
		public void optional()
		{
			optional.click();
			optional.click();
			
		}
		public void cpropertytaxes(String x)
		{
			cpropertytaxes.click();
			cpropertytaxes.clear();
			cpropertytaxes.sendKeys(x);
		}
		public void insurance(String x)
		{
			insurance.click();
			insurance.clear();
			insurance.sendKeys(x);
		}
		public void cpmi(String x)
		{
			cpmi.click();
			cpmi.clear();
			cpmi.sendKeys(x);
		}
		public void HOA_Fee(String x)
		{
			HOA_Fee.click();
			HOA_Fee.clear();
			HOA_Fee.sendKeys(x);
		}
		public void Other_Costs(String x)
		{
			Other_Costs.click();
			Other_Costs.clear();
			Other_Costs.sendKeys(x);
		}
		public void Calculate()
		{
			Calculate.click();
			
		}
		public void Monthly_Payment()
		{
			SoftAssert sa = new SoftAssert();
			for (int x=0; x< 2; x++) {
				System.out.println("---------------------------------");
			}
			System.out.println(Monthly_Payment.getText() + "is asserted.");
			sa.assertEquals(Monthly_Payment.getText(), "Monthly Pay:   $2,563.92");
			
			for (int x=0; x< 2; x++) {
				System.out.println("---------------------------------");
			}
		}
		public void PayoffDate() throws InterruptedException
		{
			SoftAssert sa = new SoftAssert();
			System.out.println(PayoffDate.getText()+ " is asserted.");
			sa.assertEquals(PayoffDate.getText(),  "Mortgage Payoff Date Aug. 2037");
			
			for (int x=0; x< 2; x++) {
				System.out.println("---------------------------------");
				Thread.sleep(2000);
			}
		}
}
