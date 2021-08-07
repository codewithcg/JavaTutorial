package com.accessmodifiers;

public class DummyStatic {

	public static void main(String[] args) {

		StaticCG sc = new StaticCG();

		StaticCG.var1 = 34;
		StaticCG.staticTest();

		sc.intMethod();

	}

}
