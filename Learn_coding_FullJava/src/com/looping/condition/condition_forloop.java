package com.looping.condition;

import java.util.Scanner;

public class condition_forloop {

	public static void main(String[] args) {

		int num;

		System.out.println("Enter any num");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num * i);

		}

	}

}
