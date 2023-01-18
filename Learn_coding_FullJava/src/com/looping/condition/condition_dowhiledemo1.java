package com.looping.condition;

import java.util.Scanner;

public class condition_dowhiledemo1 {
	public static void main(String[] args) {
		int num = 0;
		System.out.println("Enetr any num");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		do {

			System.out.println("Hi prasad");
			++num;
		} 
		while (num <= 5);

	}

}
