package com.day21;

/**
 * JUnit Parameterized Test to validating multiple entry for the Email Address.
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * JUnit 4 has introduced a new feature called parameterized tests.
 * Parameterized tests allow a developer to run the same test over and over
 * again using different values There are five steps that you need to follow to
 * create a parameterized test.
 * 
 * Annotate test class with @RunWith(Parameterized.class).
 * 
 * Create a public static method annotated with @Parameters that returns a
 * Collection of Objects (as Array) as test data set.
 * 
 * Create a public constructor that takes in what is equivalent to one "row" of
 * test data.
 * 
 * Create an instance variable for each "column" of test data.
 * 
 * Create your test case(s) using the instance variables as the source of the
 * test data.
 * 
 */
@RunWith(Parameterized.class)
public class TestSampleEmails {
	private String emails;
	private String expectedResult;

	/**
	 * creating parameterized constructor
	 * @param emails -passing emails
	 * @param expectedResult -result
	 */
	public TestSampleEmails(String emails, String expectedResult) {
		this.emails = emails;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", "Success" }, { "abc-100@yahoo.com", "Success" },
				{ "abc.100@yahoo.com", "Success" }, { "abc111@abc.com", "Success" }, { "abc-100@abc.net", "Success" },
				{ "abc.100@abc.com.au", "Success" }, { "abc@1.com", "Success" }, { "abc@gmail.com.com", "Success" },
				{ "abc+100@gmail.com", "Success" }, });
	}

	@Test
	/**
	 * creating testEmailsIds()
	 */
	public void testEmailIds() {
		UserRegistration userRegistration = new UserRegistration();
		String email = null;
		try {
			email = userRegistration.checkEmail(emails);
		} catch (InvalidDetailExceptions e) {
			Assert.assertEquals(expectedResult, email);
		}

	}
}
