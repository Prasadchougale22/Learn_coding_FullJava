package com.encapsulation.demo;

import java.util.Scanner;

public class Bank 
{
	private double bal;
   	private int    pwd;
	private double money;

	public void addmoney() {

		System.out.println("Enter amount to add your money ");
		Scanner sc = new Scanner(System.in);
		money = sc.nextDouble();

		money = bal + money;
		bal = bal + money;
		System.out.println("total money" + money);
		System.out.println("total balance" + bal);

	}

	public void Diposite() {

		System.out.println("Enter Your Password");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if (pwd == 3520) {

			bal = bal + money;
			System.out.println("Diposite money" + money);
			System.out.println("Total Balance" + bal);

		} else {

			System.out.println("Invalid Password try again");
		}

	}

	public void withdraw() {

		System.out.println("Enter Your Password");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if (pwd == 3520) {

			bal = bal - money;

			System.out.println("Wothdran money" + money);
			System.out.println("Total Bal" + bal);

		} else {

			System.out.println("Invalid Password please try again");
		}

	}

	public void checkbal() {

		System.out.println("Enter Yor Password");

		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if (pwd == 3520) {
			System.out.println("Your Total balance =" + bal);

		} else {

			System.out.println("Invalid Password please try again");

		}

	}

	public static void main(String[] args) {

		Bank b = new Bank();

		int ch;
		System.out.println("1-> Add money");
		System.out.println("2-> Diposte :");
		System.out.println("3-> Withdraw :");
		System.out.println("4-> Check your Balance :");

		System.out.println("Enter your choice ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			b.addmoney();
			break;
		case 2:
			b.Diposite();
			break;

		case 3:
			b.withdraw();
			break;

		case 4:
			b.checkbal();
			break;

		default:
			System.out.println("option not available pls try again");

		}

	}

}
