package com.thiskey;

public class Class02 {

	// this is used to invoke method of the current class

	public void method01() {
		System.out.println("I am in method01");
	}

	public void method01(String abc) {
		System.out.println("I am in method01");
	}

	public void method02() {
		method01();
		System.out.println("I am in method02");
	}

	public static void main(String[] args) {

		Class02 cl = new Class02();
		cl.method02();
	}

}
