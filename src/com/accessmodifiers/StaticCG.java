package com.accessmodifiers;

public class StaticCG {

	static int var1;
	String var2;

	public static void main(String[] args) {

		var1 = 20;
		System.out.println("va1 :" + var1);

		StaticCG ob1 = new StaticCG();
		StaticCG ob2 = new StaticCG();

		ob1.var1 = 88;
		System.out.println("va1 with obj1:" + var1);

		ob1.var2 = "I'm Object1";

		ob2.var1 = 99;
		System.out.println("va1 with obj2:" + var1);

		ob2.var2 = "I'm Object2";

		System.out.println("ob1 integer:" + ob1.var1);
		System.out.println("ob1 String:" + ob1.var2);
		System.out.println("ob2 integer:" + ob2.var1);
		System.out.println("ob2 STring:" + ob2.var2);

		staticTest();

		ob1.intMethod();
		ob2.intMethod();

	}

	public static void staticTest() {

		System.out.println("I am in static method");
		StaticCG ob3 = new StaticCG();
		ob3.intMethod();
	}

	public void instanceMethod() {
		System.out.println("I am in static method");
		staticTest();
		int text = var1;
		System.out.println("Static var: " + var1);

		intMethod();
	}

	public int intMethod() {
		System.out.println("I am in static method");
		return 23;
	}
}
