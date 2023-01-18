package com.thiskw.practice;

public class P {

	P() {

		System.out.println("Learn Java");
	}

	P(int a) {
    
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {

		P obj =new P(100);
		
	}

}
