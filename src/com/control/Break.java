package com.control;

public class Break {

	public static void main(String[] args) {

		int x;

		for (x = 100; x > 10; x--) {

			System.out.println("The value of x is : " + x);

			if (x == 93) {
				System.out.println("I am gonna stop this loop !! Hurray I AM A HEMAN");
				break;
			}

		}

		System.out.println("End of For loop : " + x);

	}

}
