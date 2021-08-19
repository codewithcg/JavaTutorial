package com.bindings;

public class Animal {

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

	protected void run() {
		System.out.println("Animal: I am running");
	}
}
