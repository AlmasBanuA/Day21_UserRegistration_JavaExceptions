package com.day21;

/**
 * UC4- As a User need to follow pre-defined Mobile Format  
 * -E.g. 91 9919819801 - Country code follow by space and 10 digit number
 *
 */

/**
 * created class name as UserRegistration
 *
 */
public class UserRegistration {
	/**
	 * created method checkFName and passing parameter in this it will check
	 * FirstName is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param fName -FirstName of the String
	 * @return -return to method created
	 */
	public boolean checkFName(String fName) {
		/**
		 * regex pattern for FirstName
		 */
		return (fName.matches("[A-Z][a-z]{3,}"));

	}

	/**
	 * created method Lname and passing parameter in this it will check LastName is
	 * valid or not result will be in true or false because method is boolean type
	 * 
	 * @param Lname -LastName of the String
	 * @return - return to method created
	 */
	public boolean Lname(String Lname) {
		return (Lname.matches("[A-Z][a-z]{3,}"));
	}

	/**
	 * created method checkEmail and passing parameter in this it will check Email
	 * is valid or not result will be in true or false because method is boolean
	 * type
	 * 
	 * @param emailID -passing emailId
	 * @return -return to method created
	 */
	public boolean checkEmail(String emailID) {
		return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
	}

	/**
	 * created method checkPhoneNum and passing parameter in this it will check
	 * phoneNumber is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param phoneNum -passing phoneNumber
	 * @return -return to method created
	 */
	public boolean checkPhoneNum(String phoneNum) {
		return (phoneNum.matches("91\\s[0-9]{10}"));
	}
}
