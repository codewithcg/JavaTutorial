package com.abstractclass;

public abstract class AbstractClass {

	int a;
	String b;
	int g;

	public abstract void method01(); // non-concrete or abstract method

	// concrete method or which has implementation
	public void method02() {
		System.out.println("I am in method02");
	}

	/*
	 * public static void main(String[] args) { // AbstractClass abs = new
	 * AbstractClass(); // cannot create an object of an abstract class
	 *
	 * }
	 */
}
