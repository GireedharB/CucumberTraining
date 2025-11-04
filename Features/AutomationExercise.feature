Feature: Automation Exercise Website

  Background:
    Given Verify whether user is on automation exercise page
    When User enters username and password in respective field
    Then User clicks on Login button on login page



   @Sc1
  Scenario: Automation Exercise Login
    Then User verify title of page
   @Sc2
  Scenario: Automation Exercise Product page
   Then User verify title of product page
    And User clicks on men category
    And Select Tshirts sub category

  @Sc3
  Scenario: All broken links on Automation Exercise page.
    Then User verifies the links on page

  @Sc4
  Scenario: Contact us page of Automation Exercise.
    Then User clicks on contact us link








