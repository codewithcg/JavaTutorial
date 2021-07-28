package com.tsys;

public class Animal {
	
	String xyz ;
	String color;
	int size;
	
	 public Animal() {
		 
		this.xyz = "Text"; 
		System.out.println("Hey I am in a Animal Constructor, default is gone!!");
		
		}
		
		
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
	
	 public Animal(int abc) {
			System.out.println("Hey I am in a Animal Constructor, default is gone!!");
		}
	 
		

}
