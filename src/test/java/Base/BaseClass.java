package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public void  initilizeBrowser() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	     driver=new FirefoxDriver();
	    driver.get("https://kite.zerodha.com/");
        //give global wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
		System.out.println("This is base class");
		
	}

}
