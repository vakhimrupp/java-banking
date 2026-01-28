package com.banking.java_banking.utils;

import java.time.Year;

public class AccountUtils {

    Year currentYear = Year.now();
    int min = 100000;
    int max = 999999;
    // Generate random number between min and max
    int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
    //convert year to string and get last two digits
    String year = String.valueOf(currentYear);
    String randomNumber = String.valueOf(randNumber);
    StringBuffer accountNumber = new StringBuffer();

    public static String generateAccountNumber() {
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        // Generate random number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //convert year to string and get last two digits
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuffer accountNumber = new StringBuffer();
        accountNumber.append(year.substring(2));
        accountNumber.append(randomNumber);
        return accountNumber.toString();
    }

}
