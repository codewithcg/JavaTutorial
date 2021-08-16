package com.abstractclass;

public class Dog extends Animal {

	public Dog(String ab, int df) {
		super(ab, df);
		colour = "Red";
		System.out.println("Dog: I am parameterized");
	}

	@Override
	public void sound() {
		System.out.println("Dog: wowo");
	}

	@Override
	public void swim() {
		System.out.println("Dog: I swim my way");
	}

	public static void main(String[] args) {

		// Animal an = new Animal();
		// an.sound();

		// Animal an = new Dog();

		Dog dg = new Dog("Lakshmi", 67);

	}

}
