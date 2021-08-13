package com.superkey;

//IS-A
// anyone can/cannot access . who is anyone? Not Human but code (method, object, class).
// Human can do anything if he has access to the project.

public class Dog extends Animal {

	int size = 120;
	String name = "Bindu";

	public Dog() {
		System.out.println("Dog: I an in parameterless constructor");
	}

	public Dog(String doggy) {

		super("Annie"); // Animal("Annie");
		System.out.println(doggy + "- Dog: I an in parameterized constructor");
	}

	public Dog(String doggy, int ds) {
		super(doggy, ds);
		System.out.println(doggy + "- Dog: I an in parameterized constructor");
	}

	public void bark() {
		System.out.println("Child: I am in Dog bark");
	}

	public void wag() {
		System.out.println("Child: I am in Dog wag");
	}

	public void printSize() {
		System.out.println("Size is : " + super.size);
		System.out.println("Name: I am " + name);
		super.hunt();
		// super.sleep();
		sleep();
	}

	@Override
	public void hunt() {
		System.out.println("Dog: I am in Dog Hunt");
	}

	public static void main(String[] args) {

		Dog dg = new Dog();
		// Dog dg2 = new Dog("Hurray");
		// Dog dg3 = new Dog("Bindu", 45);

		dg.printSize();
		// super.hunt();
		// dg.hunt();

	}

}
