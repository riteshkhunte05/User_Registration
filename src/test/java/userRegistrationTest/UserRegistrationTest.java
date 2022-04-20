package userRegistrationTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import userRegistration.InvalidUserInputException;
import userRegistration.UserRegistration;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.firstNameValidate.userEntries("Ritesh");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.firstNameValidate.userEntries("Rites");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.lastNameValidate.userEntries("Khunte");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.lastNameValidate.userEntries("Khun");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.phoneNumberValidate.userEntries("91 9168112901");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.phoneNumberValidate.userEntries("916811");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordValidate.userEntries("Hello@1234");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordValidate.userEntries("hello@!12");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
}