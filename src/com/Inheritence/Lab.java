package com.Inheritence;

public class Lab extends Dog {

	public Lab() {
		System.out.println("Lab: I an in parameterless constructor");
	}

	public Lab(String labby) {
		super("Doogie");
		System.out.println(labby + "- Lab: I an in parameterized constructor");
	}

	public void bowWow() {
		System.out.println("Child: I bowwow");
	}

	public void guard() {
		System.out.println("Child: I guard");
	}

	@Override
	public void hunt() {
		System.out.println("Lab: I hunt-  Line 37");
	}

	public static void main(String[] args) {

		Lab lb = new Lab();
		lb.sleep();
		lb.wag();
		lb.guard();

		Lab lbc = new Lab("Cutie");

		Dog dg = new Lab();
		dg.hunt();
		Animal dg2 = new Lab();
		dg2.hunt();
		// Lab lb3 = new Dog();
		// Lab lb3 = new Animal();

		/*
		 * If we have an overriden method in a child class, and the object is that of
		 * the child class then even if the reference is that of the parent class, it
		 * will still point the overriden method on the child class
		 */
	}
}
