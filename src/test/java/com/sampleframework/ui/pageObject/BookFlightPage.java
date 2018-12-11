package com.sampleframework.ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookFlightPage {

    @FindBy(how = How.NAME, using = "passFirst0")
    public WebElement pass1FirstNameInputBox;

    @FindBy(how = How.NAME, using = "passLast0")
    public  WebElement pass1LastNameInputBox;

    @FindBy(how = How.NAME, using = "creditnumber")
    public  WebElement creditCardNumberInputBox;

    @FindBy(how = How.NAME, using = "buyFlights")
    public  WebElement securePurchaseButton;

    @FindBy(how= How.XPATH, using ="//img[@src='/images/masts/mast_book.gif']")
    public  WebElement bookaFlightImage;

}
