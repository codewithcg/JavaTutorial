package com.learn;

public class ArithmeticOperator {
	
	int a;
	int b;
	
	//Operators in Java
	//Arithemetic Operators
	//Logical Operators
	
	//add + 

	public static void main(String[] args) {
		
			
		ArithmeticOperator op = new ArithmeticOperator();
		
		op.a = 5;
		op.b = 2;
		
		int c = op.a + op.b; 
		System.out.println(c);
		
		c = op.a - op.b; 
		System.out.println(c);
		
		c = op.a * op.b; 
		System.out.println(c);
		
		c = op.a / op.b; 
		System.out.println(c); 
		
		c = op.a % op.b; 
		System.out.println(c); 
		
		
		//c= ++op.a; // a = a - 1;
		//op.a++;
		//++op.a;
		System.out.println(++op.a); 
		

	}

}
