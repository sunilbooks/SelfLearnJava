package com.sunilbooks.selflearnjava.exception;

/**
 * Custom LoginException class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

class LoginException extends Exception {
	LoginException() {
		super("Invalid login or password");
	}
}

/**
 * Tests custom LoginException class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestCustomLoginException {

	public static void main(String[] args) {

		try {
			authenticate("SUNRAYS", "SUNRAYS");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}

		// Ask user to input login and password
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter login: ");
		String login = scanner.next();
		System.out.println("Enter password: ");
		String pwd = scanner.next();

		try {
			authenticate(login, pwd);
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void authenticate(String login, String pwd) throws LoginException {
		if (!login.equals("SUNRAYS") || !pwd.equals("SUNRAYS")) {
			throw new LoginException();
		} else {
			System.out.println("Login successful");
		}
	}
}
