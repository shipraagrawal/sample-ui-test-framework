package com.sampleframework.ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookingConfirmationPage {

    @FindBy(how = How.XPATH, using = "//td[@valign='top']//td//td//td//tbody//tr[3]//td[1]")
    public WebElement departTripDetailsTable;

    @FindBy(how = How.XPATH, using = "//td[@valign='top']//td//td//td//tbody//tr[5]//td[1]//font[1]")
    public  WebElement returningTripDetailsTable;

    @FindBy(how = How.XPATH, using = "//font[@size='+1']")
    public  WebElement bookingConfirmationText;

    @FindBy(how = How.XPATH, using = "//img[@src='/images/masts/mast_confirmation.gif']")
    public  WebElement flightConfirmationImage;

}
