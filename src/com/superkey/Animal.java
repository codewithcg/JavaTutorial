package com.superkey;

public class Animal {

	public Animal() {
		System.out.println("Animal: I an in parameterless constructor");
	}

	public Animal(String ani) {
		System.out.println(ani + "- Animal: I an in parameterized constructor");
	}

	public Animal(String ani, int tb) {
		System.out.println(ani + "- Animal: I an in parameterized constructor Index " + tb);
	}

	String colour;
	int size = 100;

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
