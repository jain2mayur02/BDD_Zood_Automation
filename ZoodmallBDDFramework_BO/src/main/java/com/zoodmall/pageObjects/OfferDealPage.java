package com.zoodmall.pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodmall.comman.BaseClass;

public class OfferDealPage {
	static WebDriver driver;

	Date now = new Date();
	String doddates = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(now);
	String bannerPath = System.getProperty("user.dir") + "\\configs\\TestImages\\OfferBanner.png";

	public OfferDealPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='child_menu_206']/span")
	private WebElement offerdealday;

	@FindBy(xpath = "//*[@class='btn btn-sm btn-success']")
	private WebElement offerdealbtn;

	@FindBy(xpath = "//*[@id='marketCode']/div")
	private WebElement offerdealmrkdropdwn;

	@FindBy(xpath = "//*[@id='marketCode']/ul/li[2]/a/span")
	private WebElement offerdealmrkLB;

	@FindBy(xpath = "//*[@id='name']")
	private WebElement offerdealname;

	@FindBy(xpath = "//*[@id='sort']")
	private WebElement offerdealsortorder;

	@FindBy(xpath = "//*[@id='short_description']")
	private WebElement offerdealpredescp;

	@FindBy(xpath = "//*[@id='description']")
	private WebElement offerdealdescp;

	@FindBy(xpath = "//*[@id='banner']")
	private WebElement offerdealbanner;

	@FindBy(xpath = "//input[@placeholder='HH']")
	private WebElement putofferdealhhfrom;

	@FindBy(xpath = "//*[@id='app']/div/div/div[4]/div/div/div[2]/form/section/div/div[1]/div/div/div[7]/div[2]/div/ul/li[2]/div/section/table/tbody/tr[2]/td[1]/input")
	private WebElement putofferdealhhto;

	@FindBy(xpath = "//*[@id='app']/div/div/div[4]/div/div/div[2]/form/section/div/div[1]/div/div/div[7]/div[1]/div/div/div/button")
	private WebElement clickofferfromdatebtn;

	@FindBy(xpath = "//*[@id='app']/div/div/div[4]/div/div/div[2]/form/section/div/div[1]/div/div/div[7]/div[2]/div/div/div/button")
	private WebElement clickoffertodatebtn;

	@FindBy(xpath = "//*[@class='btn btn-success']")
	private WebElement offersave;
	
	@FindBy(xpath = "//*[@id='valid_from']")
	private WebElement element;
	
	@FindBy(xpath = "//*[@id='valid_to']")
	private WebElement element1;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[1]/form/div/div/div[4]/div[2]/button[1]")
	private WebElement search;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[1]/span")
	private WebElement getofferid;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[4]/span")
	private WebElement getoffermrk;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[5]/span")
	private WebElement getofferdealvalidfrom;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[6]/span")
	private WebElement getofferdealvalidto;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[7]/span")
	private WebElement getsortorder;
	
	@FindBy(xpath = "//*[@id='market_code']")
	private WebElement maktdrpofferdeal;
	
	
	
	
	
	public void dodpage() {
		BaseClass.waitForVisibility(offerdealday, OfferDealPage.driver);
		offerdealday.click();
	}

	public void verifyofferdealpage() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("User Not able to Navigate Offer deal page",
				driver.getPageSource().contains("Offer Management "));
	}

	public void createofferdeal() throws InterruptedException {

		BaseClass.waitForVisibility(offerdealbtn, OfferDealPage.driver);
		offerdealbtn.click();
		BaseClass.waitForVisibility(offerdealmrkdropdwn, OfferDealPage.driver);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		offerdealmrkLB.click();
		offerdealmrkdropdwn.click();
		BaseClass.waitForVisibility(offerdealname, OfferDealPage.driver);
		offerdealname.sendKeys("TestOfferAutomation");
		BaseClass.waitForVisibility(offerdealsortorder, OfferDealPage.driver);
		offerdealsortorder.sendKeys("1");
		BaseClass.waitForVisibility(offerdealpredescp, OfferDealPage.driver);
		offerdealpredescp.sendKeys("Test Automation pre description");
		BaseClass.waitForVisibility(offerdealdescp, OfferDealPage.driver);
		Thread.sleep(2000);
		offerdealdescp.sendKeys("Test Automation description for creating offer deal");
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		Thread.sleep(2000);
		System.out.println("Path" + bannerPath);
		offerdealbanner.sendKeys(bannerPath);
		Thread.sleep(2000);
		clickofferfromdatebtn.click();
		Thread.sleep(2000);
		putofferdealhhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); 
		putofferdealhhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhfrom.sendKeys("00"); // enter new text
		clickoffertodatebtn.click();
		Thread.sleep(2000);
		putofferdealhhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all														
		putofferdealhhto.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickoffertodatebtn.click();
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		offersave.click();
	}
	
	
	
	public void verifyofferdealcreate() throws InterruptedException {
		
		
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(element,OfferDealPage.driver);
		Thread.sleep(2000);
		element.sendKeys("21-02-23");
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(element1,OfferDealPage.driver);
		Thread.sleep(2000);
		element1.sendKeys("21-02-24");
		Thread.sleep(2000);
		BaseClass.selectdropdown(OfferDealPage.driver, maktdrpofferdeal, "LB");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(2000);
		Assert.assertNotEquals(getofferid.getText(), null);
		Assert.assertEquals(getoffermrk.getText(), "LB");
		Assert.assertEquals(getofferdealvalidfrom.getText(), doddates + " 00:00:00");
		Assert.assertEquals(getofferdealvalidto.getText(), doddates + " 23:00:00");
		Assert.assertEquals(getsortorder.getText(), "1");
		System.out.println(getofferid.getText());
		System.out.println(getoffermrk.getText());
		System.out.println(getofferdealvalidfrom.getText());
		System.out.println(getofferdealvalidto.getText());
		System.out.println(getsortorder.getText());
		

	}

}
