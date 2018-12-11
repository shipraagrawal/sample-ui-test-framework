# Java, Cucumber, and Selenium Automation Test Framework with some tests to test the website http://newtours.demoaut.com/


Salient Features
 - Tests are using the Page object Model
 - Tests can be run on the Chrome browser and the firefox browser
 - Cucumber is used to define the flow of the tests
 - Hamcrest is used to verify and assert different pages
 - Incase of a failure of scenario, a screenshot is taken and stored on the resources directory: src/test/resources/error
 - The drivers for chrome and firefox are included as part of the repository, so that tests can be run without any setup issues on linux

Running tests:

 - Test can be run on command line using mvn clean test, the default browser option is chrome
 - To run the tests using firefox use mvn clean test -Dtest.properties=firefox.properties



