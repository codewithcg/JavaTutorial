package com.finalkey;

public class Dog {

	public Dog() {

	}

	public void bark() {
		final int size = 100;
		System.out.println("Child: I am in Dog bark" + size);
	}

	public void wag() {
		System.out.println("Child: I am in Dog wag");
	}

	// @Override
	public void hunt() {
		System.out.println("Dog: I am in Dog Hunt");
	}

	public static void main(String[] args) {
		Dog dg = new Dog();
		// int final size = 100;

	}

}
