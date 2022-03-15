package com.day21;

/**
 * Refactoring the Code to throw custom exceptions in case of Invalid User Details
 * -Rewrite all Test Cases to take in Custom Exception for Invalid First Name,
 * Last Name, Email, Mobile, and Password
 * 
 * @author user -Almas
 *
 */
public class InvalidDetailExceptions extends Exception {

	/**
	 * enum is a special data type that enable for a variable to be a set of pre
	 * defined constant
	 *
	 */
	enum ExceptionType {
		ENTERED_INVALID, ENTERED_NULL
	}

	ExceptionType type;

	/**
	 * creating Parameterized constructor InvalidDetailExceptions by passing values
	 * 
	 * @param type    -type of exception
	 * @param message -passing message
	 */
	public InvalidDetailExceptions(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
