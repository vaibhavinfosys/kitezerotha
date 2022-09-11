package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZirothaHomePage {
	//Declaration
			@FindBy(xpath = "//span[text()='DPG458']")private WebElement ID;
			
			
			
			//initialization
			public KiteZirothaHomePage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//implementation
		      public String verifyID() {
		    	  
		    	  String actID=ID.getText();
		    	  return actID;
		    	  
		    	
		    	  
		    	 
		      }

}
