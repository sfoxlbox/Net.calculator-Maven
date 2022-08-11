package net.calculator.po;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

   public class freeimages_po {
   
	   WebDriver driver;
		
		public freeimages_po(WebDriver driver) {  // creating constractor
			this.driver = driver;            
			PageFactory.initElements(driver, this); 
		}
		
	

   public void links() throws InterruptedException
   {
	   List<WebElement> elements = driver.findElements(By.tagName("a"));
	   HashSet<String> h_set = new HashSet<String>();
	   HashMap<String, String> map = new HashMap<String, String>();
	   String [] array = new String[elements.size()];
	  
	   
	   for (WebElement e: elements){
		   if(e.getText() != "") {
			   h_set.add(e.getText());
			   map.put(e.getAccessibleName(), e.getText());
			   System.out.println(e.getText()); 
		   }
	   }
	   
	   h_set.toArray(array);
	   for(int x = 0; x< h_set.size(); x++)
	   {
		   //System.out.println(array[x]);
	   }
	   System.out.println(h_set.size()); 
	   for (String i : map.keySet()) { // get they values
			
 			System.out.println(i+ " "); 
	
   }
	   System.out.println(map.values()); }}
    