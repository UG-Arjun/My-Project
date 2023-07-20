Feature: Validation of Book A Hotel Page in Adacting Hotel web application

  Scenario: TC01_Validation of Login page of a Adactin Hotel web application
    Given User launch Adactin Hotel web application
    Then User verify Adactin Hotel Login page is displayed
    When User enters valid & invalid Credentials
      | userName  | passWord   |
      | Arjun01UG | arjun@UG   |
      | ArjunUG   | arjun@01   |
      | Arjun UG  | 01arjunUG  |
      | UGarjun   | UGarjun@01 |
    And User clicks Login button
    Then User verifies the Invalid Login details page
