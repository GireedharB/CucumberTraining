Feature: OrangeHRM login
  Scenario:  Logo presence on orange HRM homepage.
    Given User launch chrome browser
    When User Hits OrangeHRM URL in browser
    Then Verify presence of logo.
    Then User validate title of the page
    And Close the browser

  Scenario: Contact Sales form
    Given User launch chrome browser
    When User Hits OrangeHRM URL in browser
    Then User clicks on contact sales button and verifies title of page
    And User fills talk to an expert form.
    And Close the browser


