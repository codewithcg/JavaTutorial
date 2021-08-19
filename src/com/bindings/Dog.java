package com.bindings;

//IS-A

public class Dog extends Animal {

	public void bark() {
		System.out.println("Child: I am in Dog bark");
	}

	public void wag() {
		System.out.println("Child: I am in Dog wag");
	}

	@Override
	public void hunt() {
		System.out.println("Dog: I am in Dog Hunt");
	}

	public static void main(String[] args) {

		Animal an = new Dog();
		an.run(); // static binding
		an.sleep(); // early binding
		an.hunt(); // late binding

		Dog dg = new Dog();
		dg.run();

		Animal an2 = new Animal();
		an2.run();

		// static, private, final

//		ProtectedClass pc = new ProtectedClass();
//		pc.addTwoNumbers(3, 5);
//		System.out.println(pc.abc);

	}

}
