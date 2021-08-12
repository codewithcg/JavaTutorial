package com.xyz.hr;

public class Tables {

	static int m = 2;

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(m + " X " + i + " = " + (m * i));

		} // String manipulation

		Tables tb = new Tables();
		tb.calc("Add");
		tb.calc("minus");
	}

	public void calc(String operation) {

		switch (operation) {

		case "Add":
		case "minus":

		}
	}

}
