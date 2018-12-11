package com.sampleframework.ui.appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sampleframework.ui.pageObject.HomePage;
import com.sampleframework.ui.supportMethods.Storage;
import com.sampleframework.ui.webDriver.Driver;

import static org.junit.Assert.assertTrue;

public class HomePageActions {

    private static WebDriver driver = Driver.getCurrentDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, 10);
    private static Storage storage = Storage.getInstance();
    private static String baseUrl =  "http://newtours.demoaut.com/";

    public static void getHomePage(){
        driver.get(baseUrl);
        wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));

        HomePage homePageObject = PageFactory.initElements(driver, HomePage.class);
        storage.setStorageValue("homePageObject", homePageObject);
    }

    public static void verifyHomePage(){
        HomePage homePageObject = storage.getStorageValue("homePageObject", HomePage.class);

        assertTrue(homePageObject.featuredDestinationImage.isDisplayed());
        assertTrue(homePageObject.loginButton.isEnabled());
        assertTrue(homePageObject.loginPasswordField.isEnabled());
        assertTrue(homePageObject.loginUserField.isEnabled());
    }


    public static void getLoginPage(){
        driver.get("http://newtours.demoaut.com/mercurysignoff.php");
        wait.until(ExpectedConditions.titleContains("Sign-on: Mercury Tours"));
    }
}
