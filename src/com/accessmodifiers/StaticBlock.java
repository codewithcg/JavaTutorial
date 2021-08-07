package com.accessmodifiers;

public class StaticBlock {

	static {
		System.out.println("I am in static block");
	}

	static {
		System.out.println("I am in 2ND static block");
	}

	public StaticBlock() {
		System.out.println("I am in constructor");
	}

	public StaticBlock(String name) {
		System.out.println("My name is : " + name);
	}

	public static void main(String[] args) {

		StaticBlock sb = new StaticBlock();
		StaticBlock sbc = new StaticBlock("constructor");
	}

}
