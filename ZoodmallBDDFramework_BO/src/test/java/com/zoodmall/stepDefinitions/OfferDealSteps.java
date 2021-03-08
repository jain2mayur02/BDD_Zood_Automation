package com.zoodmall.stepDefinitions;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.OfferDealPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OfferDealSteps {

	TestContext testContext;
	OfferDealPage offerdealpage;

	public OfferDealSteps(TestContext context) {
		testContext = context;
		offerdealpage = testContext.getPageObjectManager().getofferdeal();
	}
	
	@When("^user click on offer deal$")
	public void user_click_on_offer_dealy() {
		offerdealpage.dodpage();

	}
	
	@Then("^offer deal of the page open successfully$")
	public void offer_deal_of_the_page_open_successfuly() throws InterruptedException {
		offerdealpage.verifyofferdealpage();

	}
	
	@And("^create the offer deal$")
	public void create_the_offer() throws InterruptedException {
		offerdealpage.createofferdeal();

	}
	
	@Then("^verify offerdeal should be create successfully$")
	public void verify_offerdeal_should_be_create_successfully() throws InterruptedException {
		offerdealpage.verifyofferdealcreate();

	}
}