package com.opps.classanobj;

public class Paraconst {

	int x;
	int y;

	/*
	 * int a; int b;
	 */
	Paraconst(int a, int b) {

		x = a;
		y = b;

	}

	Paraconst(int a, String b) {
		System.out.println(a + " " + b);
	}

	void show() {

		System.out.println(x + " " + y);

	}

	public static void main(String[] args) {
		Paraconst ob = new Paraconst(100, 20);
		ob.show();
		Paraconst ob1 = new Paraconst(100, "Prasad");

	}

}
