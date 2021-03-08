package com.zoodmall.stepDefinitions;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	
	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws InterruptedException{
		homePage.navigateTo_HomePage();

	}
	
	@When("^user enter id and password$")
	public void user_enter_id_and_password() throws Throwable {
		homePage.userlogin();
	}
	
/*	@When("^user enter id and password$")
	public void user_enter_id_and_password() throws Throwable {
		homePage.userlogin();
	}*/
	

	
/*	@When("^user enter id \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void he_search_for(String product)  {
		homePage.perform_Search(product);
	}*/

}