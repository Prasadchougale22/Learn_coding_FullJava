package com.opps.classanobj;

public class Person {

	int age = 51;
	int weight = 65;
	String color = "White";

	void eat() {
		System.out.println("Person is eating ");
	}

	void sleep() {
		System.out.println("Person is sleeping ");
	}

	public static void main(String[] args) {

		Person p = new Person();

		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.color);

		p.eat();
		p.sleep();

	}

}
