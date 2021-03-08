package com.zoodmall.managers;



import org.openqa.selenium.WebDriver;

import com.zoodmall.comman.BaseClass;
import com.zoodmall.pageObjects.DealOfDayPage;
import com.zoodmall.pageObjects.HomePage;
import com.zoodmall.pageObjects.OfferDealPage;




public class PageObjectManager {

	private WebDriver driver;

	
	private BaseClass baseclass;
	private HomePage homePage;
	private DealOfDayPage dealofdaypage;
	private OfferDealPage offerdealpage;
	


	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	
	public BaseClass getBaseClass(){
		
		return (baseclass == null) ? baseclass = new BaseClass(driver) : baseclass;
	}
	public HomePage getHomePage(){

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
	
	public DealOfDayPage getDealOfDayPage() throws InterruptedException{
		
		return (dealofdaypage == null) ? dealofdaypage = new DealOfDayPage(driver) : dealofdaypage;
	}
	
	public OfferDealPage getofferdeal(){
		
		return (offerdealpage == null) ? offerdealpage = new OfferDealPage(driver) : offerdealpage;
	}
	
	

	
}