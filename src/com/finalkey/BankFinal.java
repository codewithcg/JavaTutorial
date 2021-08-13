package com.finalkey;

public class BankFinal {

	public final int rollNumber;

	public BankFinal() {
		rollNumber = 23;
	}

	public void method01() {
		// rollNumber = 34;
		System.out.println(rollNumber);
	}

	public static void main(String[] args) {

		BankFinal bf = new BankFinal();
		bf.method01();

	}

}
