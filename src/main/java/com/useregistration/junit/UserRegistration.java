package com.useregistration.junit;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String MOBILE_NUMBER = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    public boolean userFirstName(String firstName) {
        boolean result=Pattern.matches(FIRST_NAME,firstName);
        if (result==true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean userLastName(String lastName) {
        boolean result=Pattern.matches(LAST_NAME, lastName);
        if (result==true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean userEmail(String email) {
        boolean result=Pattern.matches(EMAIL, email);
        if (result==true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean userMobileNumber(String mobileNumber) {
        boolean result=Pattern.matches(MOBILE_NUMBER, mobileNumber);
        if (result==true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean userPassword(String password) {
        boolean result=Pattern.matches(PASSWORD, password);
        if (result==true) {
            return true;
        } else {
            return false;
        }
    }
}