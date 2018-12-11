Feature: To test the login functionality for the mercury travels website


  Background:
    Given user is on homepage of Mercury Travels
    When user goes to login page

  Scenario Outline: To check that user is able to login with correct credentials and logout
    When user can login using "<UserName>" and "<Password>"
    Then user can logout

    Examples:
      | UserName | Password |
      | tutorial | tutorial |
      | mercury  | mercury  |

  Scenario: To check that user is not able to login with incorrect credentials
    Then  user cannot login using incorrect credentials
      | UserName | Password |
      | tutorial | 123      |
      | mercury  | abc      |




