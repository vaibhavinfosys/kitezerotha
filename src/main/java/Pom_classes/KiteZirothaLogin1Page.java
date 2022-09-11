package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZirothaLogin1Page {
	//Declaration
			@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
			@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
			@FindBy(xpath = "//button[text()='Login ']")private WebElement clkLoginBtn;
			
			//initialization
			public KiteZirothaLogin1Page(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//implementation
		      public void enterUserName(String username) {
		    	  UN.sendKeys(username);
		      }
		      
		      public void enterPassword(String password) {
		    	  PWD.sendKeys(password);
		      }
		      
		      public void clickOnLoginButton() {
		    	  clkLoginBtn.click();
		      }

}
