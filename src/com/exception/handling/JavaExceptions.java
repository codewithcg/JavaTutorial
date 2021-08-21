package com.exception.handling;

public class JavaExceptions {

	public static void main(String[] args) {

		JavaExceptions je = new JavaExceptions();
		je.method01();

	}

	public void method01() {

		try {
			String name = null;
			System.out.println("I name is One : " + name.charAt(2));
			System.out.println("I name is : " + name.charAt(2));
			System.out.println("I name is Last : " + name.charAt(2));
		}

		catch (ArithmeticException n) {
			System.out.println("Catch Exception : " + n);
		}

		catch (NullPointerException n) {
			System.out.println("Catch Exception : " + n);
		}

		catch (Exception n) {
			System.out.println("Catch Exception : " + n);
		}

		finally {
			System.out.println("Finally : ");
		}

		System.out.println("I am out of try catch block or exception");

	}

}
