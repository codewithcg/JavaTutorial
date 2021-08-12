package com.methodoverload;

//IS-A

public class Dog {

	public void bark() {
		System.out.println("Dog: I am in Dog bark");
	}

	public void bark(String str) {
		System.out.println(str + " - lakshmi: I am in second bark");
	}

	public void bark(String str, String xyz) {
		System.out.println(str + " - lakshmi: I am in second bark");
	}

	public void bark(String str, int x) {
		System.out.println(str + " - lakshmi: I am in second bark : " + x);
	}

	public void bark(int z, String xyz) {
		System.out.println(xyz + " - lakshmi: I am in second bark : " + z);
	}

	public void wag() {
		System.out.println("Child: I am in Dog wag");
	}

	public static void main(String[] args) {

		Dog dg = new Dog();
		dg.bark();
		dg.bark("Hurray!!");
		dg.bark("Hurray!!", 45);
		dg.bark(35, "Alone");
		dg.bark("yahoo", 67);
	}

}
