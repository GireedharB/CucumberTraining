Feature: OrangeHRM login
  Scenario:  Logo presence on orange HRM homepage.
    Given User launch chrome browser
    When User Hits OrangeHRM URL in browser
    Then Verify presence of logo.
    Then User validate title of the page
    And Close the browser

