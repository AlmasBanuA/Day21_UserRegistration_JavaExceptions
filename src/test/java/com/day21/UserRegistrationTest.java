package com.day21;

/**
 * TestCases for validating FirstName 
 * TestCases for validating LastName
 * TestCases for validating EmailID
 * TestCases for validating PhoneNumber
 * TestCases for validating Password for rule 1-Having minimum 8 characters
 * TestCases for validating Password for rule 2-Should have at least 1 Upper Case 
 * TestCases for validating Password for rule 3-Should have at least 1 numeric number in the password
 * TestCases for validating Password for rule 4-Should have Exactly 1 Special Character
 * TestCases for validating all email samples provided separately
 * Writing the JUnit Test for Happy as well as Sad test case.
   - Happy Test Case validates the Entry Successfully
   - Sad Test Cases fails the Entry
 *  JUnit Parameterized Test to validate multiple entry for the Email Address.
 *  Refactoring the Code to throw custom exceptions in case of Invalid User Details 
 * - Rewrite all Test Cases to take in Custom
 */

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	/**
	 * create method testUserFirstName_whenValid_ShouldReturnSuccess() here
	 * exceptions is handled by try and catch block if first name is valid should
	 * return as success
	 */
	public void testUserFirstName_whenValid_ShouldReturnSuccess() {
		UserRegistration userRegistration = new UserRegistration();
		String isFNameValid = null;
		try {
			isFNameValid = userRegistration.checkFName("Almas");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("Success", isFNameValid);
		}

	}

	@Test
	/**
	 * create method testFirstName_WhenValueIsInvalid_shouldReturnException() here
	 * exceptions is handled by try and catch block if first name is invalid it will
	 * return exception
	 */
	public void testFirstName_WhenValueIsInvalid_shouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		String isFNameValid = null;
		try {
			userRegistration.checkFName("almas");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	@Test
	/**
	 * create method testFirstName_WhenPassNullValue_shouldNullValueException() here
	 * exceptions is handled by try and catch block if first name is null it should
	 * be a null value exception
	 */
	public void testFirstName_WhenPassNullValue_shouldNullValueException() {
		UserRegistration userRegistration = new UserRegistration();
		String isFNameValid = null;
		try {
			userRegistration.checkFName(null);
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	/**
	 * create method testLastName_WhenValueIsValid_ShouldReturnSuccess() here
	 * exceptions is handled by try and catch block if last name is valid should
	 * return as success
	 */
	public void testLastName_WhenValueIsValid_ShouldReturnSuccess() {
		UserRegistration userRegistration = new UserRegistration();
		String islNameValid = null;
		try {
			islNameValid = userRegistration.checkLName("Advani");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("Success", islNameValid);
		}
	}

	@Test
	/**
	 * create method testLastName_WhenValueIsInvalid_ShouldThrowInvalidException()
	 * here exceptions is handled by try and catch block if last name is invalid it
	 * will return exception
	 */
	public void testLastName_WhenValueIsInvalid_ShouldThrowInvalidException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkLName("advani");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	@Test
	/**
	 * create method testLastName_WhenValueIsNull_ShouldThrowNullPointerException()
	 * here exceptions is handled by try and catch block if last name is null it
	 * should be a null value exception
	 */
	public void testLastName_WhenValueIsNull_ShouldThrowNullPointerException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkLName(null);
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	/**
	 * create method testEmailId_WhenValueIsValid_ShouldReturnSuccess() here
	 * exceptions is handled by try and catch block if email id is valid should
	 * return as success
	 */
	public void testEmailId_WhenValueIsValid_ShouldReturnSuccess() {
		UserRegistration userRegistration = new UserRegistration();
		String isEmailValid = null;
		try {
			isEmailValid = userRegistration.checkEmail("almas007@gmail.com");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("Success", isEmailValid);
		}
	}

	@Test
	/**
	 * create method testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException()
	 * here exceptions is handled by try and catch block if email id is invalid it will
	 * return exception
	 */
	public void testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkEmail("almas.@.com");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	@Test
	/**
	 * create method testEmailId_WhenValueIsNull_ShouldThrowNullPointerException()
	 * here exceptions is handled by try and catch block if last name is null it
	 * should be a null value exception
	 */
	public void testEmailId_WhenValueIsNull_ShouldThrowNullPointerException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkEmail(null);
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	/**
	 * create method testMobileNum_WhenValueIsValid_ShouldReturnSuccess() here
	 * exceptions is handled by try and catch block if email id is valid should
	 * return as success
	 */
	public void testMobileNum_WhenValueIsValid_ShouldReturnSuccess() {
		UserRegistration userRegistration = new UserRegistration();
		String isPhoneValid = null;
		try {
			isPhoneValid = userRegistration.checkPhoneNumber("91 7903990740");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("Success", isPhoneValid);
		}
	}

	@Test
	/**
	 * create method testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException()
	 * here exceptions is handled by try and catch block if email id is invalid it
	 * will return exception
	 */
	public void testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkPhoneNumber("7903990740");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	@Test
	/**
	 * create method testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException()
	 * here exceptions is handled by try and catch block if MobileNum is null it should
	 * be a null value exception
	 */
	public void testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkPhoneNumber(null);
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	/**
	 * create method testPassword_WhenSatisfyRule2_ShouldReturnSuccess() here
	 * exceptions is handled by try and catch block if password is valid should
	 * return as success
	 */
	public void testPassword_WhenSatisfyRule2_ShouldReturnSuccess() {
		UserRegistration userRegistration = new UserRegistration();
		String isValidPassword = null;
		try {
			isValidPassword = userRegistration.checkPassword("Qwer@0321");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("Success", isValidPassword);
		}
	}

	@Test
	/**
	 * create method testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException()
	 * here exceptions is handled by try and catch block if password is invalid it will
	 * return exception
	 */
	public void testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkPassword("qwer");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	@Test
	/**
	 * create method testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() 
	 * here exceptions is handled by try and catch block if password is null it should 
	 * be a null value exception
	 */
	public void testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkPassword(null);
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	/**
	 * create method mood_Analyser_Test_Happy() for Happy Mood
	 */
	public void mood_Analyser_Test_Happy() {
		UserRegistration userRegistration = new UserRegistration();
		String isMoodHappy = null;
		try {
			isMoodHappy = userRegistration.moodAnalyse("Almas", "Advani", "91 7903990740", "almas007@gmail.com",
					"Qwer@0321");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("HAPPY", isMoodHappy);
		}
	}

	@Test
	/**
	 * create method mood_Analyser_Test_Sad() for Sad Mood
	 */
	public void mood_Analyser_Test_Sad() {
		UserRegistration userRegistration = new UserRegistration();
		String isMoodSad = null;
		try {
			isMoodSad = userRegistration.moodAnalyse("almas", "advani", "7903990740", "007almas.@.com", "almas*123");
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals("SAD", isMoodSad);
		}
	}
}
