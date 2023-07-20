$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AdactinBookAHotelPage.feature");
formatter.feature({
  "name": "Validation of Book A Hotel Page in Adacting Hotel web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01_Validation of Book A Hotel Page with valid FirstName, LastName, BillingAddress, CreditCardNo., CreditCardType, ExpiryDate(Month\u0026Year) and CVVNo.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Hotel web application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Adactin_Hotel_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Adactin Hotel Login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_Adactin_Hotel_Login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Search Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select valid Location and No.of rooms, enters valid Check In \u0026 Check Out Date and select valid no. of Adults per Room",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select one of the valid hotels radio button and clicks continue button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Book A Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters valid First Name, Last Name, Billing Address \u0026 Credit Card No., select the valid Credit Card Type, Expiry Date from Month and Year Dropdown and enters valid CVV Number",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Book now button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Order No. is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch Adactin Hotel web application",
  "keyword": "Given "
});
formatter.step({
  "name": "User verify Adactin Hotel Login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Search Hotel page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User select valid \"\u003cLocation\u003e\" and \"\u003cNo.of rooms\u003e\", enters valid \"\u003cCheck In\u003e\" \u0026 \"\u003cCheck Out\u003e\" Date and select valid no. of \"\u003cAdults per Room\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User select one of the valid hotels radio button and clicks continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Book A Hotel page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters valid \"\u003cFirst Name\u003e\", \"\u003cLast Name\u003e\", \"\u003cBilling Address\u003e\" \u0026 \"\u003cCredit Card No.\u003e\", select the valid \"\u003cCredit Card Type\u003e\", Expiry Date from \"\u003cMonth\u003e\" and \"\u003cYear\u003e\" Dropdown and enters valid \"\u003cCVV\u003e\" Number",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks Book now button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Order No. is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "No.of rooms",
        "Check In",
        "Check Out",
        "Adults per Room",
        "First Name",
        "Last Name",
        "Billing Address",
        "Credit Card No.",
        "Credit Card Type",
        "Month",
        "Year",
        "CVV"
      ]
    },
    {
      "cells": [
        "London",
        "2 - Two",
        "01/12/2022",
        "10/12/2022",
        "1 - One",
        "Govindarajan",
        "V",
        "77,Kingsly Avenue,London.",
        "1234567890123456",
        "American Express",
        "December",
        "2022",
        "1234"
      ]
    },
    {
      "cells": [
        "New York",
        "3 - Three",
        "02/12/2022",
        "11/12/2022",
        "2 - Two",
        "Uma Rani",
        "MG",
        "55,St.Peters street, New York.",
        "1234567890098765",
        "VISA",
        "November",
        "2021",
        "1243"
      ]
    },
    {
      "cells": [
        "Los Angeles",
        "4 - Four",
        "03/12/2022",
        "12/12/2022",
        "3 - Three",
        "Rathish Kumar",
        "UG",
        "12/23, Nocture Colony,America.",
        "0987654321123456",
        "Master Card",
        "October",
        "2020",
        "2134"
      ]
    },
    {
      "cells": [
        "Paris",
        "5 - Five",
        "04/12/2022",
        "13/12/2022",
        "4 - Four",
        "Rahul",
        "UG",
        "34,Francis pope road,Paris.",
        "0987654321098765",
        "Other",
        "September",
        "2019",
        "2143"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Hotel web application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Adactin_Hotel_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Adactin Hotel Login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_Adactin_Hotel_Login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Search Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select valid \"London\" and \"2 - Two\", enters valid \"01/12/2022\" \u0026 \"10/12/2022\" Date and select valid no. of \"1 - One\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select one of the valid hotels radio button and clicks continue button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Book A Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters valid \"Govindarajan\", \"V\", \"77,Kingsly Avenue,London.\" \u0026 \"1234567890123456\", select the valid \"American Express\", Expiry Date from \"December\" and \"2022\" Dropdown and enters valid \"1234\" Number",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Book now button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Order No. is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Hotel web application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Adactin_Hotel_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Adactin Hotel Login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_Adactin_Hotel_Login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Search Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select valid \"New York\" and \"3 - Three\", enters valid \"02/12/2022\" \u0026 \"11/12/2022\" Date and select valid no. of \"2 - Two\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select one of the valid hotels radio button and clicks continue button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Book A Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters valid \"Uma Rani\", \"MG\", \"55,St.Peters street, New York.\" \u0026 \"1234567890098765\", select the valid \"VISA\", Expiry Date from \"November\" and \"2021\" Dropdown and enters valid \"1243\" Number",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks Book now button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify Order No. is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
