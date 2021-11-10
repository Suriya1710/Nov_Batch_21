package com.exception;

public class Facebook {

	public static void credentials(String username, String password) throws Throwable {

		if (username.equals("Starc") && password.equals("Smith17")) {

			System.out.println("Welcome To FB.....");

		}

		else {
			
			throw new Customized_Exception("Credentials Was Incorrect"); // terminate

		}

		System.out.println("Login Button");

	}

	public static void ageFactor(int age) throws Throwable {

		if (age >= 18) {

			System.out.println("Eligible");

		}

		else {
			throw new Customized_Exception("Not Eligible");
		}

	}

	public static void main(String[] args) throws Throwable {

		// credentials("Starc", "Starc17");
		ageFactor(5);

	}

}
