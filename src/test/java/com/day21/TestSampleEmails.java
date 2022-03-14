package com.day21;

/**
 * JUnit Parameterized Test to validate multiple entry for the Email Address.
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSampleEmails {
	private String emails;
	private boolean expectedResult;

	/**
	 * create Parameterized Constructor
	 * 
	 * @param emails -passing EmailId's
	 * @param expectedResult -result is stored in boolean type
	 */
	public TestSampleEmails(String emails, boolean expectedResult) {
		this.emails = emails;
		this.expectedResult = expectedResult;
	}

	/**
	 * Creating static method that generates & returns data
	 * 
	 * @return- returns data
	 */
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false } });
	}

	@Test
	/**
	 * create method testEmailIds to check all the mail id's
	 */
	public void testEmailIds() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertEquals(expectedResult, userRegistration.checkEmail(emails));
	}
}
