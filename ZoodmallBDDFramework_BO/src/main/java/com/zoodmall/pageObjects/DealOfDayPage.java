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

public class DealOfDayPage {
	static WebDriver driver;

	Date now = new Date();
	String doddates = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(now);
	String filePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\dod-products-example.xlsx";
	String editFilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\dod-products-example-edit.xlsx";

	public DealOfDayPage(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@id='leftNavBar']/li[19]/a[@href='javascript:void(0);']/span[@class='text']")
	private WebElement productmanagmenttab;

	@FindBy(xpath = "//*[@id='child_menu_217']/span")
	private WebElement dealoftheday;

	@FindBy(xpath = "//button[text()='Create the DOD ']")
	private WebElement dealofthedaybtn;

	@FindBy(xpath = "//div[@id='marketCode']/div")
	private WebElement dealofthedaymrkdropdwn;

	@FindBy(xpath = "//*[@id='market_code']")
	private WebElement dealofthedaymrkdropdwnouter;

	@FindBy(xpath = "//div[@id='marketCode']/ul[@class='dropdown-menu']/li[1]/a[@role='button']")
	private WebElement dealofthedaymrkUZ;

	@FindBy(xpath = "//div[@id='marketCode']/ul[@class='dropdown-menu']/li[2]/a[@role='button']")
	private WebElement dealofthedaymrkLB;

	@FindBy(xpath = "//*[@id='marketCode']/ul/li[8]/a")
	private WebElement dealofthedaymrkKZ;

	@FindBy(xpath = "//*[@id='market_code']/option[3]")
	private WebElement dealofthedaymrkLBouter;

	@FindBy(xpath = "//*[@id='market_code']/option[9]")
	private WebElement dealofthedaymrkKZouter;

	@FindBy(xpath = "//form[@class='offer-form']/section/div/div[1]//input[@id='valid_from']")
	private WebElement dealdatefrom;

	@FindBy(xpath = "//form[@class='offer-form']/section/div/div[1]//input[@id='valid_to']")
	private WebElement dealdateto;

	@FindBy(xpath = "//div[@class='modal-footer']/button[2]/span[.='Save']")
	private WebElement dealdatesave;

	@FindBy(xpath = "//input[@id='valid_from']")
	private WebElement dealdatesearchfrom;

	@FindBy(xpath = "//input[@id='valid_to']")
	private WebElement dealdatesearchto;

	@FindBy(xpath = "//input[@id='show_actual']")
	private WebElement showactual;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement dodsearch;

	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[1]")
	private WebElement getdodoid;

	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[2]")
	private WebElement getdodmarket;

	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[3]")
	private WebElement getdodvalitfrom;

	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[4]")
	private WebElement getdodvalidto;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/div/b")
	private WebElement getdodvalidmessgae;

	@FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div[2]/div/table/tbody/tr/td[7]/button[1]")
	private WebElement syncdeal;

	@FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div[2]/div/table/tbody/tr/td[7]/button[3]")
	private WebElement deletedeal;

	@FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div[2]/div")
	private WebElement deletedealverify;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[3]/button[2]")
	private WebElement deletedealok;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/ul/li[2]/a")
	private WebElement productidimport;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[2]/div/div[1]/div[1]/div/div[1]/div[3]/a")
	private WebElement downloadlinkdod;

	@FindBy(xpath = "//*[@id='file']")
	private WebElement choosefiledod;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/button")
	private WebElement uploadfiledod;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[3]/button[2]")
	private WebElement clicksave;

	@FindBy(xpath = "//*[@id='productId']")
	private WebElement addproductiddod;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[2]/div/div[1]/div[2]/div[2]/button")
	private WebElement addproductiddodbtn;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[2]/div/div[2]/div/div/div[2]/button[1]")
	private WebElement exportdod;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[2]/div/div[2]/div/div/div[2]/button[2]")
	private WebElement deletealldod;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[2]/div/div[2]/div/span")
	private WebElement noprdfound;

	@FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/button[2]")
	private WebElement editdeal;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[1]/div/div/div[2]/div[1]/div/div/div/button")
	private WebElement clickdatebtmfrom;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[1]/div/div/div[2]/div[2]/div/div/div/button")
	private WebElement clickdatebtmto;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[1]/div/div/div[2]/div[1]/div/ul/li[2]/div/section/table/tbody/tr[2]/td[1]/input")
	private WebElement puthhfrom;

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div/div[2]/form/section/div/div[1]/div/div/div[2]/div[2]/div/ul/li[2]/div/section/table/tbody/tr[2]/td[1]/input")
	private WebElement puthhto;


	public void productmanagmenttab() throws InterruptedException {

		BaseClass.waitForVisibility(productmanagmenttab, DealOfDayPage.driver);
		productmanagmenttab.click();
		// Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		// Thread.sleep(3000);
	}

	public void dodpage() {
		BaseClass.waitForVisibility(dealoftheday, DealOfDayPage.driver);
		dealoftheday.click();
	}

	public void verifydodpage() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("User Not able to Navigate DOD", driver.getPageSource().contains("Deal Of the Day"));
	}

	public void createdod() throws InterruptedException {

		dealofthedaybtn.click();
		BaseClass.waitForVisibility(dealofthedaymrkdropdwn, DealOfDayPage.driver);
		dealofthedaymrkdropdwn.click();
		// dealofthedaymrkUZ.click();
		Thread.sleep(2000);
		dealofthedaymrkLB.click();
		dealofthedaymrkdropdwn.click();
		BaseClass.waitForVisibility(dealdatefrom, DealOfDayPage.driver);
		clickdatebtmfrom.click();
		Thread.sleep(2000);
		puthhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		puthhfrom.sendKeys("00"); // enter new text
		clickdatebtmto.click();
		Thread.sleep(2000);
		puthhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhto.sendKeys(Keys.BACK_SPACE); // delete it
		puthhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickdatebtmto.click();
		Thread.sleep(2000);
		/*
		 * dealdatefrom.clear(); dealdatefrom.sendKeys(doddates + " 15:00:00");
		 * System.out.println("Datess ==> " + doddates + " 15:00:00");
		 * dealdateto.clear(); BaseClass.waitForVisibility(dealdateto,
		 * DealOfDayPage.driver); dealdateto.sendKeys(doddates + " 15:00:00");
		 */
		BaseClass.waitForVisibility(dealdatesave, DealOfDayPage.driver);
		dealdatesave.click();

	}

	public void verifycreate() throws InterruptedException {

		BaseClass.selectdropdown(DealOfDayPage.driver, dealofthedaymrkdropdwnouter, "LB");

		/*
		 * dealofthedaymrkdropdwnouter.click(); // dealofthedaymrkUZ.click();
		 * Thread.sleep(2000); dealofthedaymrkLBouter.click();
		 */
		Thread.sleep(2000);
		dealdatesearchfrom.sendKeys(doddates + " 00:00:00");
		Thread.sleep(2000);
		BaseClass.waitForVisibility(dealdatesearchto, DealOfDayPage.driver);
		dealdatesearchto.sendKeys(doddates + " 23:00:00");
		showactual.click();
		BaseClass.waitForVisibility(dodsearch, DealOfDayPage.driver);
		dodsearch.click();
		BaseClass.waitForVisibility(getdodoid, DealOfDayPage.driver);
		Assert.assertNotEquals(getdodoid.getText(), null);
		Thread.sleep(3000);
		Assert.assertEquals(getdodmarket.getText(), "LB");
		Assert.assertEquals(getdodvalitfrom.getText(), doddates + " 00:00:00");
		Assert.assertEquals(getdodvalidto.getText(), doddates + " 22:59:59");
		System.out.println(getdodoid.getText());
		System.out.println(getdodmarket.getText());
		System.out.println(getdodvalitfrom.getText());
		System.out.println(getdodvalidto.getText());

	}

	public void syncdeal() throws InterruptedException {
		syncdeal.click();
	}

	public void verifyexistingdeal() throws InterruptedException {
		Assert.assertEquals(getdodvalidmessgae.getText(), "Validation Error");

	}

	public void verifydeletedeal() throws InterruptedException {

		driver.navigate().refresh();
		BaseClass.selectdropdown(DealOfDayPage.driver, dealofthedaymrkdropdwnouter, "LB");
		/*
		 * dealofthedaymrkdropdwnouter.click(); Thread.sleep(2000);
		 * dealofthedaymrkLBouter.click();
		 */
		Thread.sleep(3000);
		BaseClass.waitForVisibility(dealdatesearchfrom, DealOfDayPage.driver);
		dealdatesearchfrom.sendKeys(doddates + " 00:00:00");
		Thread.sleep(2000);
		BaseClass.waitForVisibility(dealdatesearchto, DealOfDayPage.driver);
		dealdatesearchto.sendKeys(doddates + " 23:00:00");
		showactual.click();
		BaseClass.waitForVisibility(dodsearch, DealOfDayPage.driver);
		dodsearch.click();
		BaseClass.waitForVisibility(deletedeal, DealOfDayPage.driver);
		Thread.sleep(3000);
		deletedeal.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(deletedealok, DealOfDayPage.driver);
		deletedealok.click();
		Thread.sleep(3000);
		Assert.assertEquals(deletedealverify.getText(), "No Deal Of The Day Found!");

	}

	public void verifyeditdeletedeal() throws InterruptedException {

		driver.navigate().refresh();
		BaseClass.selectdropdown(DealOfDayPage.driver, dealofthedaymrkdropdwnouter, "KZ");
		/*
		 * dealofthedaymrkdropdwnouter.click(); Thread.sleep(2000);
		 * dealofthedaymrkKZouter.click();
		 */
		Thread.sleep(3000);
		BaseClass.waitForVisibility(dealdatesearchfrom, DealOfDayPage.driver);
		dealdatesearchfrom.sendKeys(doddates + " 00:00:00");
		Thread.sleep(2000);
		BaseClass.waitForVisibility(dealdatesearchto, DealOfDayPage.driver);
		dealdatesearchto.sendKeys(doddates + " 23:00:00");
		showactual.click();
		BaseClass.waitForVisibility(dodsearch, DealOfDayPage.driver);
		dodsearch.click();
		BaseClass.waitForVisibility(deletedeal, DealOfDayPage.driver);
		Thread.sleep(3000);
		deletedeal.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(deletedealok, DealOfDayPage.driver);
		deletedealok.click();
		Thread.sleep(3000);
		Assert.assertEquals(deletedealverify.getText(), "No Deal Of The Day Found!");

	}

	public void verifyfiledownloadod() throws InterruptedException {

		dealofthedaybtn.click();
		productidimport.click();
		BaseClass.deleteexistingfile("dod-products-example.xlsx");
		downloadlinkdod.click();
		Thread.sleep(3000);
		BaseClass.verifyfileexist("dod-products-example.xlsx");

	}

	public void verifyuploadproductexcel() throws InterruptedException {
		dealofthedaybtn.click();
		BaseClass.waitForVisibility(dealofthedaymrkdropdwn, DealOfDayPage.driver);
		dealofthedaymrkdropdwn.click();
		// dealofthedaymrkUZ.click();
		dealofthedaymrkLB.click();
		dealofthedaymrkdropdwn.click();
		clickdatebtmfrom.click();
		Thread.sleep(2000);
		puthhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		puthhfrom.sendKeys("00"); // enter new text
		Thread.sleep(2000);
		clickdatebtmto.click();
		Thread.sleep(2000);
		puthhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhto.sendKeys(Keys.BACK_SPACE); // delete it
		puthhto.sendKeys("23"); // enter new text
		BaseClass.waitForVisibility(productidimport, DealOfDayPage.driver);
		productidimport.click();
		System.out.println("Path" + filePath);
		choosefiledod.sendKeys(filePath);
		BaseClass.waitForVisibility(uploadfiledod, DealOfDayPage.driver);
		uploadfiledod.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(clicksave, DealOfDayPage.driver);
		clicksave.click();
		Thread.sleep(3000);

	}

	public void verifyuploadproductbyid() throws InterruptedException {
		dealofthedaybtn.click();
		BaseClass.waitForVisibility(dealofthedaymrkdropdwn, DealOfDayPage.driver);
		dealofthedaymrkdropdwn.click();
		// dealofthedaymrkUZ.click();
		dealofthedaymrkLB.click();
		dealofthedaymrkdropdwn.click();
		BaseClass.waitForVisibility(dealdatefrom, DealOfDayPage.driver);
		clickdatebtmfrom.click();
		Thread.sleep(2000);
		puthhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		puthhfrom.sendKeys("00"); // enter new text
		clickdatebtmto.click();
		Thread.sleep(2000);
		puthhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhto.sendKeys(Keys.BACK_SPACE); // delete it
		puthhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickdatebtmto.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(productidimport, DealOfDayPage.driver);
		productidimport.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(addproductiddod, DealOfDayPage.driver);
		addproductiddod.sendKeys("124326");
		BaseClass.waitForVisibility(addproductiddodbtn, DealOfDayPage.driver);
		addproductiddodbtn.click();
		Thread.sleep(3000);
		BaseClass.waitForelementclicable(clicksave, DealOfDayPage.driver);
		clicksave.click();

	}

	public void verifyexportondod() throws InterruptedException {

		dealofthedaybtn.click();
		BaseClass.waitForVisibility(dealofthedaymrkdropdwn, DealOfDayPage.driver);
		dealofthedaymrkdropdwn.click();
		// dealofthedaymrkUZ.click();
		dealofthedaymrkLB.click();
		dealofthedaymrkdropdwn.click();
		BaseClass.waitForVisibility(dealdatefrom, DealOfDayPage.driver);
		clickdatebtmfrom.click();
		Thread.sleep(2000);
		puthhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		puthhfrom.sendKeys("00"); // enter new text
		clickdatebtmto.click();
		Thread.sleep(2000);
		puthhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhto.sendKeys(Keys.BACK_SPACE); // delete it
		puthhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickdatebtmto.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(productidimport, DealOfDayPage.driver);
		productidimport.click();
		System.out.println("Paht" + filePath);
		choosefiledod.sendKeys(filePath);
		Thread.sleep(2000);
		BaseClass.waitForVisibility(uploadfiledod, DealOfDayPage.driver);
		uploadfiledod.click();
		BaseClass.waitForVisibility(exportdod, DealOfDayPage.driver);
		exportdod.click();

	}

	public void verifydeleteall() throws InterruptedException

	{
		BaseClass.waitForVisibility(deletealldod, DealOfDayPage.driver);
		deletealldod.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(noprdfound, DealOfDayPage.driver);
		Assert.assertEquals(noprdfound.getText(), "No products found");

	}

	public void editdeal() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.waitForVisibility(editdeal, DealOfDayPage.driver);
		editdeal.click();
		dealofthedaymrkdropdwn.click();
		BaseClass.waitForVisibility(dealofthedaymrkLB, DealOfDayPage.driver);
		Thread.sleep(3000);
		dealofthedaymrkLB.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(dealofthedaymrkKZ, DealOfDayPage.driver);
		dealofthedaymrkKZ.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(productidimport, DealOfDayPage.driver);
		productidimport.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(deletealldod, DealOfDayPage.driver);
		deletealldod.click();
		System.out.println("Paht" + editFilePath);
		choosefiledod.sendKeys(editFilePath);
		BaseClass.waitForVisibility(uploadfiledod, DealOfDayPage.driver);
		uploadfiledod.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(clicksave, DealOfDayPage.driver);
		clicksave.click();
		Thread.sleep(3000);

	}

	public void verifyeditdeal() throws InterruptedException {

		driver.navigate().refresh();

		BaseClass.selectdropdown(DealOfDayPage.driver, dealofthedaymrkdropdwnouter, "KZ");

		/*
		 * dealofthedaymrkdropdwnouter.click(); // dealofthedaymrkUZ.click();
		 * Thread.sleep(2000); dealofthedaymrkKZouter.click();
		 */
		Thread.sleep(3000);
		BaseClass.waitForVisibility(dealdatesearchfrom, DealOfDayPage.driver);
		dealdatesearchfrom.sendKeys(doddates + " 00:00:00");
		Thread.sleep(2000);
		BaseClass.waitForVisibility(dealdatesearchto, DealOfDayPage.driver);
		dealdatesearchto.sendKeys(doddates + " 23:00:00");
		showactual.click();
		BaseClass.waitForVisibility(dodsearch, DealOfDayPage.driver);
		dodsearch.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(getdodoid, DealOfDayPage.driver);
		Assert.assertNotEquals(getdodoid.getText(), null);
		Assert.assertEquals(getdodmarket.getText(), "KZ");
		Assert.assertEquals(getdodvalitfrom.getText(), doddates + " 00:00:00");
		Assert.assertEquals(getdodvalidto.getText(), doddates + " 22:59:59");
		System.out.println(getdodoid.getText());
		System.out.println(getdodmarket.getText());
		System.out.println(getdodvalitfrom.getText());
		System.out.println(getdodvalidto.getText());

	}

	public void verifydownloadandproductupload() throws InterruptedException {

		dealofthedaybtn.click();
		dealofthedaymrkdropdwn.click();
		// dealofthedaymrkUZ.click();
		dealofthedaymrkLB.click();
		dealofthedaymrkdropdwn.click();
		BaseClass.waitForVisibility(dealdatefrom, DealOfDayPage.driver);

		clickdatebtmfrom.click();
		Thread.sleep(2000);
		puthhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		puthhfrom.sendKeys("00"); // enter new text
		clickdatebtmto.click();
		Thread.sleep(2000);
		puthhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all text in
															// textbox
		puthhto.sendKeys(Keys.BACK_SPACE); // delete it
		puthhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickdatebtmto.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(productidimport, DealOfDayPage.driver);
		productidimport.click();
		BaseClass.waitForVisibility(productidimport, DealOfDayPage.driver);
		productidimport.click();
		BaseClass.deleteexistingfile("dod-products-example.xlsx");
		downloadlinkdod.click();
		Thread.sleep(3000);
		BaseClass.verifyfileexist("dod-products-example.xlsx");
		System.out.println("Path" + filePath);
		choosefiledod.sendKeys(filePath);
		BaseClass.waitForVisibility(uploadfiledod, DealOfDayPage.driver);
		uploadfiledod.click();
		Thread.sleep(3000);
		BaseClass.waitForVisibility(clicksave, DealOfDayPage.driver);
		Thread.sleep(2000);
		clicksave.click();
		Thread.sleep(3000);

	}

}
