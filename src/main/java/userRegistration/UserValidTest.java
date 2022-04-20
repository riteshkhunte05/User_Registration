package userRegistrationTest;


import org.junit.Test;

import junit.framework.Assert;
import userRegistration.UserValidation;

public class UserValidTest {

	 @Test
	    public void firstName_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = validation.firstName("Ritesh");
	        Assert.assertTrue(actualResult);
	    }

	    @Test
	    public void lastName_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = validation.lastName("Khunte");
	        Assert.assertTrue(actualResult);
	    }

	    @Test
	    public void email_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = validation.email("riteshkhunte05@gmail.com");
	        Assert.assertTrue(actualResult);
	    }

	    @Test
	    public void phoneNumber_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = validation.phoneNumber("+919168112901");
	        Assert.assertTrue(actualResult);
	    }

	    @Test
	    public void password_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = validation.password("qw1rt@Ms");
	        Assert.assertTrue(actualResult);
	    }
		    }