package com.thiskey;

public class Class04 {

	// def- "this" is a reference variable that refers to the current object

	public void method01() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Class04 c4 = new Class04();
		System.out.println(c4);
		c4.method01();

		Class04 c5 = new Class04();
		c5.method01();

	}

}
