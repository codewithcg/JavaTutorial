package com.Inheritence;

public class Animal {

	public Animal() {
		System.out.println("Animal: I an in parameterless constructor");
	}

	public Animal(String ani) {
		System.out.println(ani + "- Animal: I an in parameterized constructor");
	}

	String colour, name;
	int size;

	public void eat() {
		System.out.println("Animal: I am eating");
	}

	public void hunt() {
		System.out.println("Animal: I am hunting");
	}

	public void sleep() {
		System.out.println("Animal: I am sleeping");
	}

	public void run() {
		System.out.println("Animal: I am running");
	}
}
