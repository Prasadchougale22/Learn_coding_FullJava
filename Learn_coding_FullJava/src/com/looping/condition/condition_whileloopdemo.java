package com.looping.condition;

import java.util.Scanner;

public class condition_whileloopdemo {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		while (num >= 0) {

			if (num % 2 == 0) {

				System.out.println("the nume is Even ");
				break;
			}

			else {

				System.out.println("The num is odd");
				break;
			}
		}
		System.out.println("While loop ended");
	}

}
