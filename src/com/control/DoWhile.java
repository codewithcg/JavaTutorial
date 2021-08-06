package com.control;

public class DoWhile {

	public static void main(String[] args) {

		double x = 1.5, sum = 0;

		do {
			sum = sum + x;
			System.out.println("sum is : " + sum);

			x++;
		} while (x < 5);

		System.out.println("=========================");

		int[] newArray = new int[] { 2, 11, 46, 10 };

		int i = 0;

		do {
			System.out.println("Value is : " + newArray[i]);
			i++;

		} while (i < newArray.length);

	}

}
