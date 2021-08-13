package com.finalkey;

public class Final01 {

	// final keyword means won't change (no change)

	public final int rollNumber = 40;

	public void method01() {
		// rollNumber = 43;
		System.out.println("rollNumber : " + rollNumber);
	}

	public void method02() {
		// rollNumber = 45;
		System.out.println("rollNumber : " + rollNumber);
	}

	public static void main(String[] args) {
		Final01 f01 = new Final01();
		f01.method01();
		f01.method02();

		Final01 f02 = new Final01();
		// f02.method01();
		f02.method02();

	}

}
