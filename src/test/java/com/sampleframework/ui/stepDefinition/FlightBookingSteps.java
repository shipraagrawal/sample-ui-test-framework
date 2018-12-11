package com.sampleframework.ui.stepDefinition;

import com.sampleframework.ui.appModules.FlightBookingActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBookingSteps {



    @When("^user selects the  \"([^\"]*)\" , \"([^\"]*)\" ,  \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userSelectsTheAnd(String source, String destination, String startDate, String endDate) throws Throwable {
        FlightBookingActions.selectFlightOptions(source, destination, startDate, endDate);
    }


    @And("^user clicks continue to view flight options and verifies the options$")
    public void userClicksContinueToViewFlightOptions() throws Throwable {
       FlightBookingActions.clickContinueButtonToViewFlights();
    }


    @Then("^user selects the default flights and clicks continue$")
    public void userSelectsTheDefaultFlightsAndClickContine() throws Throwable {
        FlightBookingActions.clickContinueToBookFlights();
    }


    @And("^user inputs \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" on the booking confirmation page$")
    public void userInputsAndOnTheBookingConfirmationPage(String firstName, String lastName, String creditCardNumber) throws Throwable {
        FlightBookingActions.enterDetailsToConfirmBooking(firstName, lastName, creditCardNumber);
    }

    @Then("^user clicks Secure Purchase Button to book the flight$")
    public void userClicksSecurePurchaseButtonToBookTheFlight() throws Throwable {
        FlightBookingActions.clickSecurePurchaseButton();
    }


    @Then("^user verifies the booking Details$")
    public void userVerifiesTheBookingDetails() throws Throwable {
        FlightBookingActions.verifyBookingConfirmationPage();
    }
}
