package com.sampleframework.ui.appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sampleframework.ui.pageObject.*;
import com.sampleframework.ui.supportMethods.Storage;
import com.sampleframework.ui.supportMethods.Utils;
import com.sampleframework.ui.webDriver.Driver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;



public class FlightBookingActions {

    private static WebDriver driver = Driver.getCurrentDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, 10);
    private static Storage storage = Storage.getInstance();



    public static void selectFlightOptions(String source, String destination, String startDate, String endDate){

        FlightOptionsPage flightOptionsPage = PageFactory.initElements(driver, FlightOptionsPage.class);
        storage.clear();


        String[] departureMonthDay = startDate.split(" ");
        String[] arrivalMonthDay = endDate.split(" ");

        selectDropDownOptions(flightOptionsPage.fromSelectCityDropDown, source);
        selectDropDownOptions(flightOptionsPage.toSelectCityDropDown, destination);

        selectDropDownOptions(flightOptionsPage.toSelectMonthDropDown, arrivalMonthDay[0]);
        selectDropDownOptions(flightOptionsPage.toSelectDayDropDown, arrivalMonthDay[1]);

        selectDropDownOptions(flightOptionsPage.fromSelectMonthDropDown, departureMonthDay[0]);
        selectDropDownOptions(flightOptionsPage.fromSelectDayDropDown, departureMonthDay[1]);

        Utils.setDateFormatForVerification(departureMonthDay[0], departureMonthDay[1], "startDateVerification");
        Utils.setDateFormatForVerification(arrivalMonthDay[0], arrivalMonthDay[1], "endDateVerification");

        storage.setStorageValue("source", source);
        storage.setStorageValue("destination", destination);
        storage.setStorageValue("startDate", startDate);
        storage.setStorageValue("flightOptionPage" +startDate, flightOptionsPage );

    }



    private static void selectDropDownOptions(WebElement element, String visibleText){

        Select selectSourceCityOption = new Select(element);
        selectSourceCityOption.selectByVisibleText(visibleText);

    }

    public static void clickContinueButtonToViewFlights() {

        FlightOptionsPage flightOptionsPage = storage.getStorageValue("flightOptionPage" + storage.getStorageValue("startDate", String.class), FlightOptionsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(flightOptionsPage.continueButton));
        flightOptionsPage.continueButton.click();

        SelectFlightPage selectFlightPage = PageFactory.initElements(driver, SelectFlightPage.class);

        verifyCorrectFlightsAreDisplayed(selectFlightPage);
        storage.setStorageValue("selectFlightPage", selectFlightPage);

    }

    private static void verifyCorrectFlightsAreDisplayed(SelectFlightPage selectFlightPage) {

        WebElement row = selectFlightPage.srcTable.findElements(By.tagName("tr")).get(1);
        WebElement flightDepartureRoute = row.findElements(By.tagName("td")).get(0);
        WebElement flightDepartureDate= row.findElements(By.tagName("td")).get(1);

        assertThat(flightDepartureRoute.getText(), is(equalTo(Utils.getDepartureRoutesForVerification())));
        assertThat(flightDepartureDate.getText(), is(equalTo(Utils.getDepartureDatesForVerification())));

         row = selectFlightPage.destTable.findElements(By.tagName("tr")).get(1);
        WebElement flightArrivalRoute = row.findElements(By.tagName("td")).get(0);
        WebElement flightArrivalDate= row.findElements(By.tagName("td")).get(1);

        assertThat(flightArrivalRoute.getText(), is(equalTo(Utils.getArrivalRoutesForVerification())));
        assertThat(flightArrivalDate.getText(), is(equalTo(Utils.getArrivalDatesForVerification())));

    }


    public static void clickContinueToBookFlights() {

        SelectFlightPage selectFlightPage = storage.getStorageValue("selectFlightPage", SelectFlightPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(selectFlightPage.reserveFlightButton));
        selectFlightPage.reserveFlightButton.click();

        BookFlightPage bookFlightPage = PageFactory.initElements(driver, BookFlightPage.class);
        verifyBookFlightPageIsDisplayed(bookFlightPage);

        storage.setStorageValue("bookFlightPage", bookFlightPage);

    }

    private static void verifyBookFlightPageIsDisplayed(BookFlightPage bookFlightPage) {

        assertTrue(bookFlightPage.bookaFlightImage.isDisplayed());
        assertTrue(bookFlightPage.creditCardNumberInputBox.isEnabled());
        assertTrue(bookFlightPage.pass1FirstNameInputBox.isEnabled());
        assertTrue(bookFlightPage.pass1LastNameInputBox.isEnabled());

    }


    public static void enterDetailsToConfirmBooking(String firstName, String lastName, String creditCardNumber) {

        BookFlightPage bookFlightPage = storage.getStorageValue("bookFlightPage", BookFlightPage.class);

        wait.until(ExpectedConditions.elementToBeClickable(bookFlightPage.pass1FirstNameInputBox));
        bookFlightPage.pass1FirstNameInputBox.clear();
        bookFlightPage.pass1FirstNameInputBox.sendKeys(firstName);

        wait.until(ExpectedConditions.elementToBeClickable(bookFlightPage.pass1LastNameInputBox));
        bookFlightPage.pass1LastNameInputBox.clear();
        bookFlightPage.pass1LastNameInputBox.sendKeys(lastName);

        wait.until(ExpectedConditions.elementToBeClickable(bookFlightPage.creditCardNumberInputBox));
        bookFlightPage.creditCardNumberInputBox.clear();
        bookFlightPage.creditCardNumberInputBox.sendKeys(creditCardNumber);

    }

    public static void clickSecurePurchaseButton() {

        BookFlightPage bookFlightPage = storage.getStorageValue("bookFlightPage", BookFlightPage.class);

        wait.until(ExpectedConditions.elementToBeClickable(bookFlightPage.securePurchaseButton));
        bookFlightPage.securePurchaseButton.click();

        BookingConfirmationPage bookingConfirmationPage = PageFactory.initElements(driver, BookingConfirmationPage.class);

        storage.setStorageValue("bookingConfirmationPage", bookingConfirmationPage);
    }

    public static void verifyBookingConfirmationPage() {
        BookingConfirmationPage bookingConfirmationPage = storage.getStorageValue("bookingConfirmationPage", BookingConfirmationPage.class);
        assertThat(bookingConfirmationPage.bookingConfirmationText.getText(), is(equalTo("Your itinerary has been booked!")));


    }
}
