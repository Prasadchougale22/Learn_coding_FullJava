package com.variable.types;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		int a, b, c;

		System.out.println("Enter any two numbers");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();

		c = a + b;
		System.out.println("The result is = " + c);

	}

}
