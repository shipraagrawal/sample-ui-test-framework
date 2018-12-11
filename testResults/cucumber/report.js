$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlightBooking.feature");
formatter.feature({
  "line": 1,
  "name": "To test the flight booking functionality for the mercury travels website",
  "description": "",
  "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "To test a flight booking can be made successfully",
  "description": "",
  "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user selects the  \"\u003cSource\u003e\" , \"\u003cDestination\u003e\" ,  \"\u003cStartDate\u003e\" and \"\u003cEndDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks continue to view flight options and verifies the options",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user selects the default flights and clicks continue",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user inputs \"\u003cFirstName\u003e\", \"\u003cLastName\u003e\" and \"\u003cCreditCardNumber\u003e\" on the booking confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks Secure Purchase Button to book the flight",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user verifies the booking Details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user can logout",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully;",
  "rows": [
    {
      "cells": [
        "Source",
        "Destination",
        "StartDate",
        "EndDate",
        "FirstName",
        "LastName",
        "CreditCardNumber"
      ],
      "line": 22,
      "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully;;1"
    },
    {
      "cells": [
        "Frankfurt",
        "New York",
        "October 11",
        "October 18",
        "Tester",
        "A",
        "11223344"
      ],
      "line": 23,
      "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully;;2"
    },
    {
      "cells": [
        "London",
        "Paris",
        "November 25",
        "November 30",
        "Tester",
        "B",
        "11223344"
      ],
      "line": 24,
      "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8012639,
  "status": "passed"
});
formatter.before({
  "duration": 621821,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage of Mercury Travels",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user goes to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is logged into mercury travels website",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepageOfMercuryTravels()"
});
formatter.result({
  "duration": 2933452542,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iGoToLoginPage()"
});
formatter.result({
  "duration": 812705553,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userIsLoggedIntoMercuryTravelsWebsite()"
});
formatter.result({
  "duration": 7255727182,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "To test a flight booking can be made successfully",
  "description": "",
  "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user selects the  \"Frankfurt\" , \"New York\" ,  \"October 11\" and \"October 18\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks continue to view flight options and verifies the options",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user selects the default flights and clicks continue",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user inputs \"Tester\", \"A\" and \"11223344\" on the booking confirmation page",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks Secure Purchase Button to book the flight",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user verifies the booking Details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user can logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Frankfurt",
      "offset": 19
    },
    {
      "val": "New York",
      "offset": 33
    },
    {
      "val": "October 11",
      "offset": 47
    },
    {
      "val": "October 18",
      "offset": 64
    }
  ],
  "location": "FlightBookingSteps.userSelectsTheAnd(String,String,String,String)"
});
formatter.result({
  "duration": 857599420,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userClicksContinueToViewFlightOptions()"
});
formatter.result({
  "duration": 848376778,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userSelectsTheDefaultFlightsAndClickContine()"
});
formatter.result({
  "duration": 1104455665,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 13
    },
    {
      "val": "A",
      "offset": 23
    },
    {
      "val": "11223344",
      "offset": 31
    }
  ],
  "location": "FlightBookingSteps.userInputsAndOnTheBookingConfirmationPage(String,String,String)"
});
formatter.result({
  "duration": 668511397,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userClicksSecurePurchaseButtonToBookTheFlight()"
});
formatter.result({
  "duration": 812619233,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userVerifiesTheBookingDetails()"
});
formatter.result({
  "duration": 61446905,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userCanLogout()"
});
formatter.result({
  "duration": 752377701,
  "status": "passed"
});
formatter.after({
  "duration": 88608,
  "status": "passed"
});
formatter.before({
  "duration": 32258,
  "status": "passed"
});
formatter.before({
  "duration": 89488,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage of Mercury Travels",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user goes to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is logged into mercury travels website",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepageOfMercuryTravels()"
});
formatter.result({
  "duration": 669976705,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iGoToLoginPage()"
});
formatter.result({
  "duration": 759733047,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userIsLoggedIntoMercuryTravelsWebsite()"
});
formatter.result({
  "duration": 6133331486,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "To test a flight booking can be made successfully",
  "description": "",
  "id": "to-test-the-flight-booking-functionality-for-the-mercury-travels-website;to-test-a-flight-booking-can-be-made-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user selects the  \"London\" , \"Paris\" ,  \"November 25\" and \"November 30\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks continue to view flight options and verifies the options",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user selects the default flights and clicks continue",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user inputs \"Tester\", \"B\" and \"11223344\" on the booking confirmation page",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks Secure Purchase Button to book the flight",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user verifies the booking Details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user can logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 19
    },
    {
      "val": "Paris",
      "offset": 30
    },
    {
      "val": "November 25",
      "offset": 41
    },
    {
      "val": "November 30",
      "offset": 59
    }
  ],
  "location": "FlightBookingSteps.userSelectsTheAnd(String,String,String,String)"
});
formatter.result({
  "duration": 853864204,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userClicksContinueToViewFlightOptions()"
});
formatter.result({
  "duration": 848754501,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userSelectsTheDefaultFlightsAndClickContine()"
});
formatter.result({
  "duration": 1115442098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 13
    },
    {
      "val": "B",
      "offset": 23
    },
    {
      "val": "11223344",
      "offset": 31
    }
  ],
  "location": "FlightBookingSteps.userInputsAndOnTheBookingConfirmationPage(String,String,String)"
});
formatter.result({
  "duration": 771840259,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userClicksSecurePurchaseButtonToBookTheFlight()"
});
formatter.result({
  "duration": 622208257,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingSteps.userVerifiesTheBookingDetails()"
});
formatter.result({
  "duration": 56645955,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userCanLogout()"
});
formatter.result({
  "duration": 755937094,
  "status": "passed"
});
formatter.after({
  "duration": 57393,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "To test the login functionality for the mercury travels website",
  "description": "",
  "id": "to-test-the-login-functionality-for-the-mercury-travels-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "To check that user is able to login with correct credentials and logout",
  "description": "",
  "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user can login using \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user can logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 13,
      "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout;;1"
    },
    {
      "cells": [
        "tutorial",
        "tutorial"
      ],
      "line": 14,
      "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout;;2"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 15,
      "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 23623,
  "status": "passed"
});
formatter.before({
  "duration": 111219,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage of Mercury Travels",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to login page",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepageOfMercuryTravels()"
});
formatter.result({
  "duration": 660091980,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iGoToLoginPage()"
});
formatter.result({
  "duration": 758934418,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To check that user is able to login with correct credentials and logout",
  "description": "",
  "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user can login using \"tutorial\" and \"tutorial\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user can logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "tutorial",
      "offset": 22
    },
    {
      "val": "tutorial",
      "offset": 37
    }
  ],
  "location": "LoginSteps.userCanLoginUsingAnd(String,String)"
});
formatter.result({
  "duration": 6515105363,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userCanLogout()"
});
formatter.result({
  "duration": 773713301,
  "status": "passed"
});
formatter.after({
  "duration": 55409,
  "status": "passed"
});
formatter.before({
  "duration": 27675,
  "status": "passed"
});
formatter.before({
  "duration": 107239,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage of Mercury Travels",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to login page",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepageOfMercuryTravels()"
});
formatter.result({
  "duration": 786314492,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iGoToLoginPage()"
});
formatter.result({
  "duration": 766806906,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "To check that user is able to login with correct credentials and logout",
  "description": "",
  "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-able-to-login-with-correct-credentials-and-logout;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user can login using \"mercury\" and \"mercury\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user can logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 22
    },
    {
      "val": "mercury",
      "offset": 36
    }
  ],
  "location": "LoginSteps.userCanLoginUsingAnd(String,String)"
});
formatter.result({
  "duration": 7141154106,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userCanLogout()"
});
formatter.result({
  "duration": 775266869,
  "status": "passed"
});
formatter.after({
  "duration": 31729,
  "status": "passed"
});
formatter.before({
  "duration": 25250,
  "status": "passed"
});
formatter.before({
  "duration": 312826,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage of Mercury Travels",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to login page",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepageOfMercuryTravels()"
});
formatter.result({
  "duration": 780559094,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iGoToLoginPage()"
});
formatter.result({
  "duration": 783829200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To check that user is not able to login with incorrect credentials",
  "description": "",
  "id": "to-test-the-login-functionality-for-the-mercury-travels-website;to-check-that-user-is-not-able-to-login-with-incorrect-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user cannot login using incorrect credentials",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 19
    },
    {
      "cells": [
        "tutorial",
        "123"
      ],
      "line": 20
    },
    {
      "cells": [
        "mercury",
        "abc"
      ],
      "line": 21
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iCanLoginUsingCorrectCredentials(DataTable)"
});
formatter.result({
  "duration": 3707392553,
  "status": "passed"
});
formatter.after({
  "duration": 25516,
  "status": "passed"
});
});