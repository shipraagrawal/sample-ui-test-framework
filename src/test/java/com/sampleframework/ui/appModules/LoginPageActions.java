package com.sampleframework.ui.appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sampleframework.ui.pageObject.LoginPage;
import com.sampleframework.ui.webDriver.Driver;

public class LoginPageActions {

    private static WebDriver driver = Driver.getCurrentDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, 10);


    public static void validLogin(String userName, String userPassword) {
        login(userName, userPassword, "Find a Flight: Mercury Tours:");
    }

    public static void invalidLogin(String userName, String userPassword) {
        login(userName, userPassword, "Sign-on: Mercury Tours");
    }

    public static void logout(){
        driver.get("http://newtours.demoaut.com/mercurysignoff.php");
        wait.until(ExpectedConditions.titleContains("Sign-on: Mercury Tours"));
    }


    private static void login(String userName, String password, String title){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginUserField));
        loginPage.loginUserField.clear();
        loginPage.loginUserField.sendKeys(userName);

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginPasswordField));
        loginPage.loginPasswordField.clear();
        loginPage.loginPasswordField.sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));
        loginPage.loginButton.click();

        wait.until(ExpectedConditions.titleContains(title));
    }

}
