package com.exception.handling;

// Exception- Unwanted stopping of execution. 

public class TryCatch {

	public static void main(String[] args) {

		TryCatch tc = new TryCatch();
		tc.one();
		System.out.println("I am in two");
	}

	public void one() {

		System.out.println("I am in one");
		int x = 45;
		int y;

		// System.exit(0);

		try {
			System.out.println("I am in try block");
			// System.exit(0);
			y = x / 0;
		}

		catch (Exception e) {
			System.out.println("I am in finally block");
		}

		finally {
			System.out.println("I am in finally block");
		}

		System.out.println("I am outr of tyru");
	}

}

// Types of Exception

// Checked Exception - IO Exception, SQL Connection (caught Compile Time)
// Unchecked Exception - Arithemetic exception, Array Out of bound exception. (Caught at Runtime exception)
