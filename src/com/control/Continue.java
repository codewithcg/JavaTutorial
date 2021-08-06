package com.control;

public class Continue {

	public static void main(String[] args) {

		for (int x = 1; x < 10; x++) {

			if (x == 3) {
				System.out.println("I am 3 but I still want to continue");
				continue;
			}

			System.out.println("Number is : " + x);

		}

		System.out.println("===================");

		// while

		int counter = 0;

		while (counter <= 10) {

			if (counter == 5) {
				System.out.println("Counter 5 is : " + counter);
				counter++;

				break;
			}

			System.out.println("Counter is : " + counter);
			counter++;
		}

	}

}
