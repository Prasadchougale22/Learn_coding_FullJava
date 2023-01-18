package com.array.pgm;
import java.util.Arrays;
import java.util.Scanner;
public class arrayaccess {
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		System.out.print("Enter an element");
		System.out.println(" ");
		Scanner s = new Scanner(System.in);
		{
			for (int i = 0; i < 5; i++) {

				a[i] = s.nextInt();

			}
		
			Arrays.sort(a);

			System.out.println("Array element");

			for (int b : a) {

				System.out.print(b + " ");

			}
		}
	}
}
