package com.conditional.statement;

public class condition_statement {

	public static void main(String[] args) {

		int num1 = 20, num2 = 10, num3 = 45;

		if (num1 > num2)// 10>20
		{

			if (num1 > num3)// 20>45

			{
				System.out.println("Maximum num" + num1);
			} else {
				System.out.println("Maximum num" + num3);
			}
		} else {
			if (num2 > num3)//10>45
			{
				System.out.println("maximum number" + num2);
			} else {
				System.out.println("maximun num " + num3);

			}

		}

	}

}
   