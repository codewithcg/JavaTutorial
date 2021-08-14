package com.thiskey;

public class Class01 {

	// def- "this" is a reference variable that refers to the current object

	int index, price;
	String colour, size;

	public Class01(String colour, String size, int index, int pr) {

		this.size = size;
		this.index = index;
		this.colour = colour;
		price = pr;
	}

	public Class01() {

	}

	public void method01() {
		System.out.println("I am in Class 1 method01");
	}

	public static void main(String[] args) {

		Class01 cl = new Class01("Red", "Medium", 12, 30);

		System.out.println(cl.size);
		System.out.println(cl.colour);
		System.out.println(cl.index);
		System.out.println(cl.price);

		Class01 c1 = new Class01("Red", "Medium", 12, 30);
	}

}
