package com.sampleframework.ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FlightOptionsPage {

    @FindBy(how = How.NAME, using = "tripType")
    public List<WebElement> tripTypeRadioButton;

    @FindBy(how = How.NAME, using = "passCount")
    public  WebElement passengerCountDropDown;

    @FindBy(how = How.NAME, using = "fromPort")
    public  WebElement fromSelectCityDropDown;

    @FindBy(how = How.NAME, using = "fromMonth")
    public  WebElement fromSelectMonthDropDown;

    @FindBy(how = How.NAME, using = "fromDay")
    public  WebElement fromSelectDayDropDown;

    @FindBy(how = How.NAME, using = "toPort")
    public  WebElement toSelectCityDropDown;

    @FindBy(how = How.NAME, using = "toMonth")
    public  WebElement toSelectMonthDropDown;

    @FindBy(how = How.NAME, using = "toDay")
    public  WebElement toSelectDayDropDown;

    @FindBy(how = How.NAME, using = "servClass")
    public WebElement serviceClassRadioButton;

    @FindBy(how = How.NAME, using = "airline")
    public  WebElement airlineDropDown;

    @FindBy(how = How.NAME, using = "findFlights")
    public  WebElement continueButton;

}
