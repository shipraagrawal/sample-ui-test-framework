package com.sampleframework.ui.supportMethods;

import java.time.Month;

public class Utils {
    private static Storage storage = Storage.getInstance();

    public static String getDepartureRoutesForVerification() {

        return(storage.getStorageValue("source", String.class) + " to " + storage.getStorageValue("destination", String.class));

    }

    public static String getArrivalRoutesForVerification() {

        return(storage.getStorageValue("destination", String.class) + " to " + storage.getStorageValue("source", String.class));

    }

    public static void setDateFormatForVerification(String month, String day, String storageKey){

        int numberMonth = Month.valueOf(month.toUpperCase()).getValue();
        String date = numberMonth  + "/" + day + "/2018";
        storage.setStorageValue(storageKey, date);

    }

    public static String getDepartureDatesForVerification() {

        return(storage.getStorageValue("startDateVerification", String.class) );

    }

    public static String getArrivalDatesForVerification() {

        return(storage.getStorageValue("endDateVerification", String.class) );

    }



}
