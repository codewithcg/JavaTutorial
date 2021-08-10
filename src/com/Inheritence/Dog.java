package com.Inheritence;

//IS-A

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog: I an in parameterless constructor");
	}

	public Dog(String doggy) {
		super("Annie");
		System.out.println(doggy + "- Dog: I an in parameterized constructor");

	}

	public void bark() {
		System.out.println("Child: I am in Dog bark");
	}

	public void wag() {
		System.out.println("Child: I am in Dog wag");
	}

	@Override
	public void hunt() {
		System.out.println("Child: I am in Dog Hunt");
	}

	public static void main(String[] args) {

		Animal an = new Animal();
		an.hunt();

		Dog dg = new Dog();
		dg.hunt();

		System.out.println("======================");

		Animal ani = new Dog();
		// ani.wag();
		ani.eat();
		ani.sleep();
		ani.hunt();
		System.out.println("======================");

		Animal anim = new Animal();

		anim.eat();
		anim.sleep();
		anim.hunt();

		// Dog dg1 = new Animal(); // compile time error

	}

}
