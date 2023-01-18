package com.opps.classanobj;

public class Dconst {

	int a;
	String b;
	boolean c;

	Dconst() {

		a = 100;
		b = "Prasad";
		c = true;

	}

	void disp() {

		System.out.println(a + " " + b + " " + c);

	}

	public static void main(String[] args) {

		Dconst obj = new Dconst();
		obj.disp();
	}

}
