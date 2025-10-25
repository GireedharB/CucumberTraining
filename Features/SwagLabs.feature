Feature: SwagLabs Website

  @Sanity @Smoke
  Scenario: SwagLabs Login
    Given User launch browser
    When User opens URL "https://www.saucedemo.com/"
    And  User enters Username as "standard_user" and Password as "secret_sauce"
    And User clicks on Login button
    Then User validates current url should be "https://www.saucedemo.com/inventory.html"
    When User clicks on logout button from menu
    And User closes the browser

  @Regression
  Scenario Outline: SwagLabs Login data driven
    Given User launch browser
    When User opens URL "https://www.saucedemo.com/"
    And  User enters Username as "<username>" and Password as "<password>"
    And User clicks on Login button
    Then User validates current url should be "https://www.saucedemo.com/inventory.html"
    When User clicks on logout button from menu
    And User closes the browser

    Examples:
    |username |password|
    |standard_user|secret_sauce|
    |locked_out_user|secret_sauce|
    |problem_user|secret_sauce|
    |performance_glitch_user|secret_sauce|
    |error_user|secret_sauce|
    |visual_user|secret_sauce|



