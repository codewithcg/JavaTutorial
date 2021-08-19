package com.access.package01;

public class PrivateClass01 {

	private PrivateClass01() {
		System.out.println("empty constructor");
	}

	private int x = 34;

	private void privateMethod01() {
		System.out.println("privateMethod01");
	}

	public static void main(String[] args) {

		PrivateClass01 pr01 = new PrivateClass01();
		pr01.privateMethod01();
		System.out.println(pr01.x);
	}

}
