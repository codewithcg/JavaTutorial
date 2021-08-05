package com.control;

public class Ifelse {

	int x = 10;

	public static void main(String[] args) {

		Ifelse obj = new Ifelse();
		int g = obj.x;

		if (g == 20) {
			System.out.println("They are equal");
		}

		else if (g == 40) {
			System.out.println("I am 20 ");
		}

		else if (g < 10) {
			System.out.println("I am less than 20");
		}

		else {
			System.out.println("They are not equal");
		}
	}

}
