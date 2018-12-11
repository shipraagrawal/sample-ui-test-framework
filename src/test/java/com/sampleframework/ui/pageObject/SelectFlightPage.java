package com.sampleframework.ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectFlightPage {

    @FindBy(how = How.NAME, using = "outFlight")
    public WebElement outwardFlightRadioButton;

    @FindBy(how = How.NAME, using = "inFlight")
    public WebElement inwardFlightRadioButton;

    @FindBy(how = How.NAME, using = "reserveFlights")
    public WebElement reserveFlightButton;

    @FindBy(how = How.XPATH, using = "//td[@valign='top']//td//td//td//table[1]//tbody[1]//tbody[1]")
    public WebElement srcTable;

    @FindBy(how = How.XPATH, using = "//td//td//td//table[2]//tbody[1]//tbody[1]")
    public WebElement destTable;

}
