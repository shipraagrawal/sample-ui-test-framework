package com.sampleframework.ui.stepDefinition;

import com.sampleframework.ui.appModules.HomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {


    @Given("^user is on homepage of Mercury Travels$")
    public void iAmOnHomepageOfMercuryTravels() throws Exception {
        HomePageActions.getHomePage();
        HomePageActions.verifyHomePage();
    }


    @When("^user goes to login page$")
    public void iGoToLoginPage() throws Throwable {
        HomePageActions.getLoginPage();
    }
}
