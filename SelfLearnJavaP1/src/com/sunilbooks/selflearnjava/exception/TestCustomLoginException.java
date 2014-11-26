package com.sunilbooks.selflearnjava.exception;


public class TestCustomLoginException {

	public static void main(String[] args) {

		try {
			authenticate("SUNRAYS", "SUNRAYS");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void authenticate(String login, String pwd)
			throws LoginException {
		boolean flag = true;
		if (flag) {
			throw new LoginException();
		}
	}

}
