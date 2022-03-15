package com.day21;

/**

 * UC1 :-   As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 
 * UC2 :-   As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 characters
 
 * UC3 :-   As a User need to enter  a valid email
 *        - E.g. abc.xyz@bl.co.in
 *        - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 
 * UC4 :-   As a User need to follow pre-defined Mobile Format
 *        - E.g. 91 9919819801
 *        - Country code follow by space and 10 digit number
 * 
 * UC5 :-   As a User need to follow pre-defined Password rules.
 *          Rule1- minimum 8 Characters 
 * 
 * UC6 :-  Rule2- Should have at least 1 Upper Case
 * 
 * UC7 :-  Rule3- Should have at least 1 numeric number in the password
 * 
 * UC8:-   Rule4- Should have at Exactly 1 Special Character in the password
 * NOTE –  All rules must be passed
 
 * UC9:-   Should clear all email samples provided separately
 
 * UC10:-  Write Junit Test for Happy as well as Sad test case.
 *      -  Happy Test Case validates the Entry Successfully
 *      -  Sad Test Cases fails the Entry
 *      
 * UC11:-  JUnit Parameterized Test to validate multiple entry for the Email Address   
 * 
 * UC12:- Refactor the Code to throw custom exceptions in case of Invalid User Details 
 *      - Rewrite all Test Cases to take in Custom
 */

/**
 * created class name as UserRegistration
 *
 */
public class UserRegistration {

	private static String nameFormat = "[A-Z][a-z]{2,}";
	private static String emailFormat = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
	private static String mobileFormat = "^[0-9]{1,2}[ ][0-9]{10}$";
	private static String passwordFormat = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$";

	/** created method name checkFName it will check first name is valid or not if it is valid 
	 *  in try block it matches and return as success or if it is invalid then it will throw exception 
	 *  or if it is null then null pointer exception will occurs **/
	public String checkFName(String fName) throws InvalidDetailExceptions {
		try {
			if (fName.matches(nameFormat)) {
				return "Success";
			} else {
				throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID,
						"Please provide Specific format");
			}
		} catch (NullPointerException e) {
			throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL,
					"Please don't pass null value");
		}
	}

	/** created method name checkLName it will check last name is valid or not if it is valid 
	 *  in try block it matches and return as success or if it is invalid then it will throw exception 
	 *  or if it is null then null pointer exception will occurs **/
	public String checkLName(String lName) throws InvalidDetailExceptions {
		try {
			if (lName.matches(nameFormat)) {
				return "Success";
			} else {
				throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID,
						"Please provide specific formate");
			}
		} catch (NullPointerException e) {
			throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL,
					"Please don't pass null value");
		}

	}

	/** created method name checkEmail it will check Email is valid or not if it is valid 
	 *  in try block it matches and return as success or if it is invalid then it will throw exception 
	 *  or if it is null then null pointer exception will occurs **/
	public String checkEmail(String emailId) throws InvalidDetailExceptions {
		try {
			if (emailId.matches(emailFormat)) {
				return "Success";
			} else {
				throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID,
						"Please provide specific email");
			}
		} catch (NullPointerException e) {
			throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL,
					"Don't provide null value");
		}
	}

	/** created method name checkPhoneNumber it will check PhoneNumber is valid or not if it is valid 
	 *  in try block it matches and return as success or if it is invalid then it will throw exception 
	 *  or if it is null then null pointer exception will occurs **/
	public String checkPhoneNumber(String phoneNo) throws InvalidDetailExceptions {
		try {
			if (phoneNo.matches(mobileFormat)) {
				return "Success";
			} else {
				throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID,
						"Please provide specific phone number");
			}
		} catch (NullPointerException e) {
			throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL,
					"Please don't pass null value");
		}
	}

	/** created method name checkPassword it will check password is valid or not if it is valid 
	 *  in try block it matches and return as success or if it is invalid then it will throw exception 
	 *  or if it is null then null pointer exception will occurs **/
	public String checkPassword(String passcode) throws InvalidDetailExceptions {
		try {
			if (passcode.matches(passwordFormat)) {
				return "Success";
			} else {
				throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID,
						"Please Provide specific password");
			}
		} catch (NullPointerException e) {
			throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL,
					"Please don't provide null Value");
		}
	}

	/** created method name moodAnalyse it will check first name, last name, phone number, email and password is 
	 *  valid or not if it is valid in try block it matches it will enter to try block and return Happy Mood or
	 *  else return  Sad Mood or if it is invalid then it will throw exception 
	 *  or if it is null then null pointer exception will occurs **/
	
	public String moodAnalyse(String fName, String lName, String phoneNumber, String email, String password)
			throws InvalidDetailExceptions {
		try {
			if (checkFName(fName) == "Success" && checkLName(lName) == "Success" && checkEmail(email) == "Success"
					&& checkPhoneNumber(phoneNumber) == "Success" && checkPassword(password) == "Success") {
				return "HAPPY";
			} else {
				return "SAD";
			}
		} catch (NullPointerException e) {
			throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL,
					"Please don't pass null value");
		}

	}

}
