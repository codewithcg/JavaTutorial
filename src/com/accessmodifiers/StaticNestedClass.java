package com.accessmodifiers;

public class StaticNestedClass {

	String var1 = "text";

	static class Dog {

		public void eat() {
			// System.out.println("Parent variable : " + var1);
		}
	}

	static class Cat {

		public void mew() {
			// System.out.println("Parent variable : " + var1);
		}

	}

	public void ig() {

	}

	public static void main(String[] args) {

		StaticNestedClass.Dog dg = new StaticNestedClass.Dog();
		dg.eat();

	}

}
