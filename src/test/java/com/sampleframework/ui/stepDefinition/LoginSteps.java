package com.sampleframework.ui.stepDefinition;

import com.sampleframework.ui.appModules.LoginPageActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class LoginSteps {

    @Then("^user cannot login using incorrect credentials$")
    public void iCanLoginUsingCorrectCredentials(DataTable table) throws Throwable {
        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            String userName = map.get("UserName");
            String password = map.get("Password");
            LoginPageActions.invalidLogin(userName, password);

        }

    }

    @When("^user can login using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userCanLoginUsingAnd(String userName, String password) throws Throwable {
        LoginPageActions.validLogin(userName, password);
    }

    @Then("^user can logout$")
    public void userCanLogout() throws Throwable {
        LoginPageActions.logout();
    }

    @When("^user \"([^\"]*)\" with password \"([^\"]*)\" is logged out$")
    public void userWithPasswordIsLoggedOut(String userName, String password) throws Throwable {
        LoginPageActions.validLogin(userName, password);
        LoginPageActions.logout();
    }

    @Given("^user is logged into mercury travels website$")
    public void userIsLoggedIntoMercuryTravelsWebsite() throws Throwable {
        LoginPageActions.validLogin("tutorial", "tutorial");
    }
}
