package com.useregistration.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateEmail {
    private final String emailTest;
    private final boolean expectedResult;

    public ValidateEmail(String email, boolean expectedResult) {
        this.emailTest = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        Object[][] data = new Object[][]{
                {"abc@yahoo.com", true}
                , {"abc-100@yahoo.com", true}
                , {"abc.100@yahoo.com", true}
                , {"abc111@abc.com", true}
                , {"abc-100@abc.net", true}
                , {"abc.100@abc.com.au", true}
                , {"abc@1.com", true}
                , {"abc@gmail.com.com", true}
                , {"abc+100@gmail.com", true}
                , {"abc", false}
                , {"abc@.com.my", false}
                , {"abc123@gmail.a", false}
                , {"abc123@.com", false}
                , {"abc@.com.com", false}
                , {".abc@abc.com", false}
                , {"abc()*@gmail.com", false}
                , {"abc@%*.com", false}
                , {"abc..2002@gmail.com", false}
                , {"abc@abc@gmail.com", false}
                , {"abc@gmail.com.1a", false}};
        return Arrays.asList(data);
    }
    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedResult() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.userEmail(this.emailTest);
        Assert.assertEquals(this.expectedResult, result);
    }
}