package com.zoodmall.comman;


import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	static WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	public static void selectdropdown(WebDriver driverclass,WebElement dealofthedaymrkdropdwn,String dropdowntxt){
		Select dropdownobj = new Select(dealofthedaymrkdropdwn);
		dropdownobj.selectByVisibleText(dropdowntxt);
		//dropdownobj.selectByValue(byvalue);
		//dropdownobj.selectByIndex(byindex);

	}
	
	public static String deleteexistingfile(String filename)
	{
		String home = System.getProperty("user.home");
        String file_name = "dod-products-example.xlsx";
        String file_with_location = home + "\\Downloads\\" + file_name;
        System.out.println("Navigate to File Location ===========================" + home + "\\Downloads\\" + file_name);
        File file = new File(file_with_location);
        if (file.exists()) {
            System.out.println(file_with_location + " is present");
            if (file.delete()) {
                System.out.println("file deleted");
            }
	}
		return file_with_location;

	}
	
	public static String verifyfileexist(String filename)
	{
		String home = System.getProperty("user.home");
        String file_name = "dod-products-example.xlsx";
        String file_with_location = home + "\\Downloads\\" + file_name;
        System.out.println("Navigate to File Location ===========================" + home + "\\Downloads\\" + file_name);
        File file = new File(file_with_location);
        if (file.exists()) {
            System.out.println(file_with_location + " is present");
        }
            else {
                System.out.println(file_with_location + " is not present");
            }return file_with_location;

	}
	
	public static void waitForVisibility(WebElement element, WebDriver driverclass) throws Error{
       new WebDriverWait(driverclass, 10).until(ExpectedConditions.visibilityOf(element));
      
 }
	
	public static void waitForelementclicable(WebElement element, WebDriver driverclass) throws Error{
        new WebDriverWait(driverclass, 10)
             .until(ExpectedConditions.elementToBeClickable(element));
 
 }
	
	public static void removereadonlyattr(WebElement element, WebDriver driverclass){
		JavascriptExecutor js1 = (JavascriptExecutor) driverclass;  
		js1.executeScript("arguments[0].removeAttribute('readonly','readonly')",element);
   
 
 }

	
	

	


	
	
	
}
