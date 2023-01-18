package com.operator.arithmatic;

import java.util.Scanner;

public class switch_casedemo {

	public static void main(String[] args) {
		int a, b, c, ch;
		System.out.println("Enter any  two number for calculation");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enetr your choice ");
		System.out.println("1=Addition");
		System.out.println("2=substraction");
		System.out.println("3= multification");
		System.out.println("4= division");
		System.out.println("5= reminder");

		ch = sc.nextInt();

		switch (ch) {

		case 1:
			c = a + b;
			System.out.println("Addition is " + c);
			break;

		case 2:
			c = a - b;
			System.out.println("Substraction is " + c);
			break;

		case 3:
			c = a * b;
			System.out.println("Multification is" + c);

			break;

		case 4:
			c = a / b;
			System.out.println("Division is " + c);
			break;

		case 5:
			c = a % b;
			System.out.println("Reminder is " + c);
			break;

		default:
			System.out.println("Invalid choice ");

		}

	}

}
