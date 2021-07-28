package com.tsys;

public class LearnVariables {
	
	String name; // Instance Variable
	int age; // Instance Variable
	
	static String buildingName; //Class Variable

	String address2; // Instance Variable
	
	public static void main(String[] args) {
		
		int pincode; //local variable
		String address;
		
		LearnVariables lv = new LearnVariables();
		lv.age = 28;
		lv.name = "Bindhu";
		lv.address2 = "slgkjsdrk";
				
		LearnVariables.buildingName = "F3-103";
		address = "sldhflk";
	}
	
	public void method1() {
		
		String address; //local variable
		int age2 ; //local variable
		
		LearnVariables ln2 = new LearnVariables();
		ln2.name = "Lakshmi";		
		LearnVariables.buildingName = "C3-109";
		
		address = "Ivy Apartments, Pune";
		
		
	}

}
