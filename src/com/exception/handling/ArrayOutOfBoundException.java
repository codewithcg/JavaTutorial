package com.exception.handling;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {

		ArrayOutOfBoundException je = new ArrayOutOfBoundException();
		je.method01();

	}

	public void method01() {

		try {
			int[] x = new int[3]; // 0=10, 1 = 11, 2=22
			x[0] = 11;
			x[1] = 22;
			x[2] = 23;

			System.out.println("Value at 0 index : " + x[3]);
		}

		catch (ArithmeticException n) {
			System.out.println("Catch Exception : " + n);
		}

		catch (NullPointerException n) {
			System.out.println("Catch Exception : " + n);
		}

		catch (ArrayIndexOutOfBoundsException n) {
			System.out.println("Catch Exception Real : " + n);
		}

		catch (Exception n) {
			System.out.println("Catch Exception Parent: " + n);
		}

		finally {
			System.out.println("Finally : ");
		}

		System.out.println("I am out of try catch block or exception");

	}

}
