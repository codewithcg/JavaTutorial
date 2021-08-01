package com.learn;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 25;
		
		//Logical Operators - &&, ||, !
		
		boolean bb = a<10 && b>15;
		System.out.println(bb);
		
		bb = a<40 && b>15;
		System.out.println(bb);
		
		bb = a<10 || b>15;
		System.out.println(bb);
		
		bb = a<40 || b>15;
		System.out.println(bb);
		
		bb = a>25 || b<15;
		System.out.println(bb);
		
		bb = !(a<40 && b>15);
		System.out.println(bb);
		
		bb = !(a>40 && b>15);
		System.out.println(bb);

	}

}
