package userRegistrationTest;

import org.junit.Assert;
import org.junit.Test;

import userRegistration.UserValidation;

public class UserValidTest {

	@Test
	public void test() {
		class UserValidationTest {

			 @Test
			    public void firstName_Validation() {
			        UserValidation validation = new UserValidation();
			        boolean actualResult = validation.firstName("Manish");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void lastName_Validation() {
			        UserValidation validation = new UserValidation();
			        boolean actualResult = validation.lastName("Kumar");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void email_Validation() {
			        UserValidation validation = new UserValidation();
			        boolean actualResult = validation.email("mkaubr007@gmail.com");
			        Assert.assertTrue(actualResult);
			    }

	}

	}
}
