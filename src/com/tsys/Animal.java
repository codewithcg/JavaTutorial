package com.tsys;

public class Animal {
	
	String color;
	int size;
		
	public void sleep() {
		System.out.println("Lets sleep");
	}
	
	public int eat(String item) {
		
		System.out.println("Lets eat");
		System.out.println("Lets eat : " + item);
		hunt();
		return 58;
	}
	
	public String hunt() {
		System.out.println("Lets hunt");
		
		return "Hunted";
	}

}
