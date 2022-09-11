package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {
	public static String getTD(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\mahaguru.xlsx");
		  Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
		           String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		           return data;
       }
	
	public static void captureScreenshot(WebDriver driver,String vaibhav1) {
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			            File src = ts.getScreenshotAs(OutputType.FILE);
			            
			            File dest= new File("C:\\Users\\DELL PC\\Desktop\\www\\vaibhav1.png");
			            
			            FileHandler.copy(src, dest);
			            System.out.println("ScreenShot has taken");
		     }
		catch(Exception e) {
			
			System.out.println("Exception while taking screenshot" + e.getMessage());
			
			}
		
		
		
		
		
	}
	
	}
