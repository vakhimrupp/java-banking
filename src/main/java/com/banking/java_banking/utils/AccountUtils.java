package com.banking.java_banking.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account Created";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been created successfully";

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

        return accountNumber.append(year).append(randomNumber).toString();
    }

}
