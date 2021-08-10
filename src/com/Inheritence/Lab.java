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

	public static void main(String[] args) {

//		Lab lb = new Lab();
//		lb.sleep();
//		lb.wag();
//		lb.guard();

		Lab lbc = new Lab("Cutie");

		// Dog dg = new Lab();
		// Animal dg2 = new Lab();
		// Lab lb3 = new Dog();
		// Lab lb3 = new Animal();

	}
}
