package com.sampleframework.ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//img[@src='/images/featured_destination.gif']")
    public WebElement featuredDestinationImage;

    @FindBy(how = How.NAME, using = "userName")
    public  WebElement loginUserField;

    @FindBy(how = How.NAME, using = "password")
    public  WebElement loginPasswordField;

    @FindBy(how = How.NAME, using = "login")
    public  WebElement loginButton;
}
