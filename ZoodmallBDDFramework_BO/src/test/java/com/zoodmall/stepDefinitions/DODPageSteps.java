package com.zoodmall.stepDefinitions;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.DealOfDayPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DODPageSteps {

	TestContext testContext;
	DealOfDayPage dealofdaypage;

	public DODPageSteps(TestContext context) throws InterruptedException {
		testContext = context;
		dealofdaypage = testContext.getPageObjectManager().getDealOfDayPage();
	}

	@Given("^user click on product management$")
	public void user_click_on_product_management() throws InterruptedException {
		dealofdaypage.productmanagmenttab();

	}

	@When("^user click on deal of the day$")
	public void user_click_on_deal_of_the_day() {
		dealofdaypage.dodpage();

	}

	@Then("^deal of the page open successfully$")
	public void deal_of_the_page_open_successfuly() throws InterruptedException {
		dealofdaypage.verifydodpage();

	}

	@And("^create the deal of the dod$")
	public void create_the_deal_of_the_dod() throws InterruptedException {
		dealofdaypage.createdod();

	}

	@Then("^verify deal should be create successfully$")
	public void verify_deal_should_be_create_successfully() throws InterruptedException {
		dealofdaypage.verifycreate();

	}

	@And("^sync deal created$")
	public void sync_deal_created() throws InterruptedException {
		dealofdaypage.syncdeal();

	}

	@Then("^verify validation message for existing deal$")
	public void verify_validation_message_for_existing_deal() throws InterruptedException {
		dealofdaypage.verifyexistingdeal();

	}

	@And("^delete the deal$")
	public void delete_the_deal() throws InterruptedException {
		dealofdaypage.verifydeletedeal();

	}

	@And("^delete the edit deal$")
	public void delete_the_edit_deal() throws InterruptedException {
		dealofdaypage.verifyeditdeletedeal();

	}

	@And("^check download sample file in productid tab$")
	public void check_download_sample_file_in_productid_tab() throws InterruptedException {
		dealofdaypage.verifyfiledownloadod();

	}

	@And("^upload product by excel$")
	public void upload_product_by_excel() throws InterruptedException {
		dealofdaypage.verifyuploadproductexcel();

	}

	@And("^add product using productid option$")
	public void add_product_using_productid_option() throws InterruptedException {
		dealofdaypage.verifyuploadproductbyid();

	}

	@And("^check export option on dod$")
	public void check_export_option_on_dod() throws InterruptedException {
		dealofdaypage.verifyexportondod();

	}

	@And("^click on delete all$")
	public void click_on_delete_all() throws InterruptedException {
		dealofdaypage.verifydeleteall();

	}

	@And("^edit the deal$")
	public void edit_the_deal() throws InterruptedException {
		dealofdaypage.editdeal();

	}

	@Then("^verify deal should be updated successfully$")
	public void verify_deal_should_be_updated_successfully() throws InterruptedException {
		dealofdaypage.verifyeditdeal();

	}

	@Then("^perform download sample file and create dod with product upload$")
	public void vperform_download_sample_file_and_create_dod_with_product_upload() throws InterruptedException {
		dealofdaypage.verifydownloadandproductupload();

	}

}