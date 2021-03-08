package com.zoodmall.pageObjects;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoodmall.dataProviders.ConfigFileReader;
import com.zoodmall.managers.FileReaderManager;;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@FindBy(name = "username")
	private WebElement userid;

	@FindBy(name = "password")
	private WebElement passwd;

	@FindBy(xpath = "//*[@id='main']/section/div/form/div/div[3]/button")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id='main']/div/div/h3")
	private WebElement welcomelabel;

	public void navigateTo_HomePage() throws InterruptedException {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

	}
	
	private void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver, 20)
             .until(ExpectedConditions.visibilityOf(element));
 }

	public void userlogin() throws InterruptedException {

		userid.sendKeys(ConfigFileReader.properties.getProperty("userid"));
		passwd.sendKeys(ConfigFileReader.properties.getProperty("password"));
		submit.click();
		Thread.sleep(3000);
		waitForVisibility(welcomelabel);
		Assert.assertTrue("User Not able to loginin", driver.getPageSource().contains("Welcome to use ZoodMall Back Office System."));
		
		

	}


}