package com.demo;

public class Equals_Demo {

	public static void main(String[] args) {

		String sb = "Starc";

		String sb1 = "Starc";

		if (sb.equals(sb1)) {

			System.out.println("Content Equals");

		}

		else if (sb == sb1) {

			System.out.println("Equals");

		}

		else {

			System.out.println("not equals");

		}

	}

}
