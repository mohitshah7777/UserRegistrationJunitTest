package com.useregistration.junit;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    private static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String MOBILE_NUMBER = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    //UC13 Refractored the code to use the lambda function to validate userEntry
    @FunctionalInterface
    public interface IUserRegistration{
        boolean validate(String pattern, String userInput);
    }

    IUserRegistration checkInputString = (((pattern, userInput) -> Pattern.compile(pattern).matcher(userInput).matches()));

    public boolean userFirstName(String firstName) throws UserRegistrationException {
        if (checkInputString.validate(FIRST_NAME,firstName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Firstname");
        }
    }

    public boolean userLastName(String lastName) throws UserRegistrationException {
        if (checkInputString.validate(LAST_NAME,lastName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Lastname");
        }
    }

    public boolean userEmail(String email) throws UserRegistrationException{
        if (checkInputString.validate(EMAIL,email)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Email");
        }
    }

    public boolean userMobileNumber(String mobileNumber) throws UserRegistrationException{
        if (checkInputString.validate(MOBILE_NUMBER,mobileNumber)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
    }

    public boolean userPassword(String password) throws UserRegistrationException{
        if (checkInputString.validate(PASSWORD,password)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Password");
        }
    }
}