package com.abstractclass;

public abstract class Animal {

	public Animal() {
		colour = "Red";
		System.out.println("Animal: I am non parameterized");
	}

	public Animal(String clr, int sz) {
		colour = clr;
		size = sz;
		System.out.println("Animal: I am in parametrized constructor");
	}

	String colour, name;
	int size;

	public void eat() {
		System.out.println("Animal: I am eating");
	}

	public void sleep() {
		System.out.println("Animal: I am sleeping");
	}

	public abstract void sound(); // If you have an abstract method in a class, the class needs to be made
									// abstract too

	public abstract void swim();
}
