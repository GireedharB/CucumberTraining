Feature: OrangeHRM login

  Background:
    Given User launch chrome browser
    When User Hits OrangeHRM URL in browser


  Scenario:  Logo presence on orange HRM homepage.
    Then Verify presence of logo.
    Then User validate title of the page
    And Close the browser

  Scenario: Contact Sales form
    Then User clicks on contact sales button and verifies title of page
    And User fills talk to an expert form.
    And Close the browser

  Scenario: Book a free demo form
    Then User clicks on book free demo button and verifies title
    And User fills book free demo form.
    And Close the browser


