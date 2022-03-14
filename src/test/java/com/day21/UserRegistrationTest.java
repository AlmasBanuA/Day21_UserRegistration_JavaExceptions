package com.day21;

import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating firstName
 *
 */
public class UserRegistrationTest {

	@Test
	/**
	 * created method testingFirstName() to check firstname is valid or not
	 */
	public void testingFirstName() {
		/**
		 * Creating Object for UserRegistration class
		 */
		UserRegistration userRegistration = new UserRegistration();
		/**
		 * calling checkFName method to see firstname is valid
		 */
		boolean isFNameValid = userRegistration.checkFName("Almas");
		Assert.assertTrue(isFNameValid);
	}

	@Test
	/**
	 * created method testFirstNameInvalidMustReturnFalse for false condition
	 */
	public void testFirstNameInvalidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFnameValid = userRegistration.checkFName("almas");
		Assert.assertFalse(isFnameValid);
	}
}
