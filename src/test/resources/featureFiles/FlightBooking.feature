Feature: To test the flight booking functionality for the mercury travels website

  Background:
    Given user is on homepage of Mercury Travels
    When user goes to login page
    And user is logged into mercury travels website

  Scenario Outline: To test a flight booking can be made successfully

    When user selects the  "<Source>" , "<Destination>" ,  "<StartDate>" and "<EndDate>"
    Then user clicks continue to view flight options and verifies the options

    When user selects the default flights and clicks continue
    Then user inputs "<FirstName>", "<LastName>" and "<CreditCardNumber>" on the booking confirmation page

    When user clicks Secure Purchase Button to book the flight
    Then user verifies the booking Details

    And user can logout

    Examples:
      | Source    | Destination | StartDate   | EndDate     | FirstName | LastName | CreditCardNumber |
      | Frankfurt | New York    | October 11  | October 18  | Tester    | A        | 11223344         |
      | London    | Paris       | November 25 | November 30 | Tester    | B        | 11223344         |


