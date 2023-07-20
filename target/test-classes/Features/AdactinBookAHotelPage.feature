Feature: Validation of Book A Hotel Page in Adacting Hotel web application

  Scenario: TC01_Validation of Book A Hotel Page with valid FirstName, LastName, BillingAddress, CreditCardNo., CreditCardType, ExpiryDate(Month&Year) and CVVNo.
    Given User launch Adactin Hotel web application
    Then User verify Adactin Hotel Login page is displayed
    When User enters valid username and valid password
    And User clicks Login button
    Then User verify Search Hotel page is displayed
    When User select valid Location and No.of rooms, enters valid Check In & Check Out Date and select valid no. of Adults per Room
    And User clicks Search button
    Then User verify Select Hotel page is displayed
    And User select one of the valid hotels radio button and clicks continue button
    Then User verify Book A Hotel page is displayed
    When User enters valid First Name, Last Name, Billing Address & Credit Card No., select the valid Credit Card Type, Expiry Date from Month and Year Dropdown and enters valid CVV Number
    And User clicks Book now button
    Then User verify Order No. is displayed

  Scenario Outline: 
    Given User launch Adactin Hotel web application
    Then User verify Adactin Hotel Login page is displayed
    When User enters valid username and valid password
    And User clicks Login button
    Then User verify Search Hotel page is displayed
    When User select valid "<Location>" and "<No.of rooms>", enters valid "<Check In>" & "<Check Out>" Date and select valid no. of "<Adults per Room>"
    And User clicks Search button
    Then User verify Select Hotel page is displayed
    And User select one of the valid hotels radio button and clicks continue button
    Then User verify Book A Hotel page is displayed
    When User enters valid "<First Name>", "<Last Name>", "<Billing Address>" & "<Credit Card No.>", select the valid "<Credit Card Type>", Expiry Date from "<Month>" and "<Year>" Dropdown and enters valid "<CVV>" Number
    And User clicks Book now button
    Then User verify Order No. is displayed

    Examples: 
      | Location    | No.of rooms | Check In   | Check Out  | Adults per Room | First Name    | Last Name | Billing Address                | Credit Card No.  | Credit Card Type | Month     | Year | CVV  |
      | London      | 2 - Two     | 01/12/2022 | 10/12/2022 | 1 - One         | Govindarajan  | V         | 77,Kingsly Avenue,London.      | 1234567890123456 | American Express | December  | 2022 | 1234 |
      | New York    | 3 - Three   | 02/12/2022 | 11/12/2022 | 2 - Two         | Uma Rani      | MG        | 55,St.Peters street, New York. | 1234567890098765 | VISA             | November  | 2021 | 1243 |
      | Los Angeles | 4 - Four    | 03/12/2022 | 12/12/2022 | 3 - Three       | Rathish Kumar | UG        | 12/23, Nocture Colony,America. | 0987654321123456 | Master Card      | October   | 2020 | 2134 |
      | Paris       | 5 - Five    | 04/12/2022 | 13/12/2022 | 4 - Four        | Rahul         | UG        | 34,Francis pope road,Paris.    | 0987654321098765 | Other            | September | 2019 | 2143 |
