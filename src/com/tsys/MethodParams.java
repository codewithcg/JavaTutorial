package com.tsys;

public class MethodParams {
	
	 int xyz = 23;

	public static void main(String[] args) {
		
		System.out.println("Hello Bindu..");
        System.out.println("Hello Lakshmi..");
        
        method2("text", 34);         
        
        MethodParams mp = new MethodParams();
        mp.method1(45);                                        
	}
	

	public void method1(int c)
	{
		System.out.println("Hello I am in method 1");
	}
			
	public static void method2(String methodName, int data)
	{
		System.out.println("Hello I am in method 2 and methodName is " + methodName+ " " + data);
		System.out.println("Hello I am in method 2 and data is " +data);
	}
	

}
