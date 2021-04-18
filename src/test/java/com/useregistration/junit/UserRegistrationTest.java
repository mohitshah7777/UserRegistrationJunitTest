package com.useregistration.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration user;

    @Before
    public void setup() {
        user = new UserRegistration();
    }

    @Test
    public void firstName_WhenTrue() throws UserRegistrationException {
        boolean result = user.userFirstName("Mohit");
        Assert.assertTrue(result);
    }

    @Test
    public void firstName_WhenFalse() {
        try {
            boolean result = user.userFirstName("mo");
            Assert.assertFalse(result);
        } catch(UserRegistrationException e){
            Assert.assertEquals("Invalid Firstname",e.getMessage());
        }
    }

    @Test
    public void lastName_WhenTrue() throws UserRegistrationException {
        boolean result = user.userLastName("Shah");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_WhenFalse() {
        try {
            boolean result = user.userLastName("shah");
            Assert.assertFalse(result);
        }catch(UserRegistrationException e){
            Assert.assertEquals("Invalid Lastname",e.getMessage());
        }
    }

    @Test
    public void email_WhenTrue() throws UserRegistrationException {
        boolean result = user.userEmail("mohitshah@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void email_WhenFalse() {
        try {
            boolean result = user.userEmail("mohit@abc@gmail.com");
            Assert.assertFalse(result);
        }catch(UserRegistrationException e){
            Assert.assertEquals("Invalid Email",e.getMessage());
        }
        }

    @Test
    public void mobileNumber_WhenTrue() throws UserRegistrationException {
        boolean result = user.userMobileNumber("91 9988776655");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumber_WhenFalse() {
        try {
            boolean result = user.userMobileNumber("919988776655");
            Assert.assertFalse(result);
        }catch(UserRegistrationException e){
            Assert.assertEquals("Invalid Mobile Number",e.getMessage());
        }
        }


    @Test
    public void password_WhenTrue() throws UserRegistrationException {
        boolean result = user.userPassword("Mohitshah@123");
        Assert.assertTrue(result);
    }

    @Test
    public void password_WhenFalse() {
        try {
            boolean result = user.userPassword("mohitshah@123@");
            Assert.assertFalse(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Invalid Password",e.getMessage());
        }
        }
}