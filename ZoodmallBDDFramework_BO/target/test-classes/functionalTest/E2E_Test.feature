Feature: Test Marketing Modules

  Background: User is Logged In
    Given user is on Home Page
    When user enter id and password

  @RegressionDOD
  Scenario: Create DOD on Market basis
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And create the deal of the dod
    Then verify deal should be create successfully
    And sync deal created

  @RegressionDOD
  Scenario: Check validation for existing DOD and Incorrect date range
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And create the deal of the dod
    Then verify validation message for existing deal

  @RegressionDOD
  Scenario: Check delete scenario for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And delete the deal

  @RegressionDOD
  Scenario: Check download sample file for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And check download sample file in productid tab

  @RegressionDOD
  Scenario: Check Upload product by excel File for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And upload product by excel
    Then verify deal should be create successfully
    And delete the deal

  @RegressionDOD
  Scenario: Check Upload product by Add Product option for DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And add product using productid option
    Then verify deal should be create successfully
    And delete the deal

  @RegressionDOD
  Scenario: Check Product Export and Delete all option on DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And check export option on dod
    #Then verify exportfile download successfully
    And click on delete all

  @RegressionDOD
  Scenario: Check Edit option on DOD
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And upload product by excel
    Then verify deal should be create successfully
    And edit the deal
    Then verify deal should be updated successfully
    And delete the deal

  @RegressionglobalDOD @RegressionDOD
  Scenario: Create DOD on Market basis
    Given user click on product management
    When user click on deal of the day
    Then deal of the page open successfully
    And perform download sample file and create dod with product upload
    Then verify deal should be create successfully
    And edit the deal
    Then verify deal should be updated successfully
    And delete the deal

  @RegressionOfferDeal1
  Scenario: Create OfferDeal on Market basis
    Given user click on product management
    When user click on offer deal
