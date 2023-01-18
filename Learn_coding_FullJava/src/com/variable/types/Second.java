package com.variable.types;

public class Second {

	int a = 10;// instance

	static double b = 20.5;// static

	public static void main(String[] args) {

		boolean c = true;// Local

		Second s = new Second();
		System.out.println(s.a);
		System.out.println(b);
		System.out.println(c);

		System.out.println();

	}

}
