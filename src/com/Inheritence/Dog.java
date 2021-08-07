package com.Inheritence;

//IS-A

public class Dog extends Animal {

	public void bark() {

	}

	public void wag() {

	}

	@Override
	public void hunt() {
		System.out.println("Child: I am in Child Hunt");
	}

	public static void main(String[] args) {

		Animal an = new Animal();
		an.hunt();

		Dog dg = new Dog();
		dg.hunt();
	}

}
