package com.tsys;

public class LearnConstructor {
	
	String xyz ;
	
	public LearnConstructor(String input) {
		   
	    this.xyz = input;
		
		System.out.println("Hey I have parameterized constructor, Default is gone..Yay!!!" + input);	
		
		}

   
   

	public static void main(String[] args) {	
		
		LearnConstructor secondConstructor = new LearnConstructor("Bindhu");
		
		System.out.println(secondConstructor.xyz);
		System.out.println(secondConstructor.xyz);
		
	}
	
	

}
