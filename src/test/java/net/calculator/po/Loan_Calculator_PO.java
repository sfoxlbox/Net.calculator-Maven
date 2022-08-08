package net.calculator.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loan_Calculator_PO {
WebDriver driver;
	
	
	public Loan_Calculator_PO(WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); 
	}
	@FindBy (how =How.XPATH, using= "(//*[name()='path'])[1]")
	WebElement click;
	@FindBy (how =How.XPATH, using= "(//*[name()='text'])[5]")
	WebElement text;
	@FindBy (how =How.XPATH, using= "(//*[name()='path'])[2]")
	WebElement click2;
	@FindBy (how =How.NAME, using= "cloanamount")
	WebElement cloanamount;
	@FindBy (how =How.NAME, using= "cloanterm")
	WebElement cloanterm;
	@FindBy (how =How.XPATH, using= "//input[@id='cloantermmonth']")
	WebElement cloantermmonth;
	@FindBy (how =How.NAME, using= "cinterestrate")
	WebElement cinterestrate;
	@FindBy (how =How.NAME, using= "ccompound")
	WebElement ccompound;
	@FindBy (how =How.NAME, using= "cpayback")
	WebElement cpayback;
	@FindBy (how =How.XPATH, using= "(//input[@value='Calculate'])[1]")
	WebElement Calculate;

  
  public void cloanamount(String x) {
	  
	  cloanamount.click();
	  cloanamount.clear();
	  cloanamount.sendKeys(x);
  }
  public void cloanterm(String x) {
	  
	  cloanterm.click();
	  cloanterm.clear();
	  cloanterm.sendKeys(x);
  }
  public void cloantermmonth(String x) {
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(cloantermmonth).click().perform();
	  cloantermmonth.clear();
	  cloantermmonth.sendKeys(x);
  }
  public void cinterestrate(String x) {
	  
	  cinterestrate.click();
	  cinterestrate.clear();
	  cinterestrate.sendKeys(x);
  }
  public void ccompound(int x) {
	  
	  Select select = new Select(ccompound);
	  ccompound.click();
	  select.selectByIndex(x);
  }
  public void cpayback(int x) throws InterruptedException {
	  Select select = new Select(cpayback);
	  cpayback.click();
	  select.selectByIndex(x);
	  Thread.sleep(1000);
	  Calculate.click();
  }
  
   // Driver code
   public void test1() throws InterruptedException
   {
	   Actions action = new Actions(driver);
	   action.moveToElement(click).click().perform();
	   Thread.sleep(500);
	   action.moveToElement(click).click().perform();
	   System.out.println(text.getText()+ " ");
	   System.out.print(click.getText()+ " ");
	   System.out.println( " ");
   }
 public void test2() throws InterruptedException  {
	
	   Actions action = new Actions(driver);
	   Thread.sleep(5000);
	   action.moveToElement(click2).build().perform();
	   Thread.sleep(500);
	   System.out.println(text.getText()+ "  ");
	   action.moveToElement(click2).click().perform();
	   Thread.sleep(500);
	   action.moveToElement(click2).click().perform();
	   Thread.sleep(2000);
	   System.out.println( " ");
}
}
