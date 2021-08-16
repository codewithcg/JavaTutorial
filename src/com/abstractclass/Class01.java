package com.abstractclass;

public class Class01 extends AbstractClass {

	@Override
	public void method01() {
		System.out.println("I am in method01 - Implemented");
	}

	public void method03() {
		System.out.println("I am in method03 - Child");
	}

	public static void main(String[] args) {

		Class01 cg = new Class01();
		cg.method02();
		cg.method01();

		AbstractClass abs = new Class01();
		abs.method01();
		abs.method02();
		// abs.method03();

	}

}
