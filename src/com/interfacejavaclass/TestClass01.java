package com.interfacejavaclass;

public class TestClass01 implements TestInterface01, TestInterface02 {

	static int abc = 34;

	@Override
	public void method01() {
		System.out.println("I am in method 01");
	}

	@Override
	public void method02() {
		System.out.println("I am in method 02");
	}

	@Override
	public void method022() {

	}

	public static void main(String[] args) {
		abc = 89;
		System.out.println("Value of Colour  is : " + TestInterface01.colour);
		System.out.println("Value of Colour  is : " + TestInterface02.colour);
		System.out.println("Value of Colour  is : " + club);
	}

}
