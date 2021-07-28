package com.tsys;

public class LearnConstructor {
	
	String xyz;
	String name ;
	
	public LearnConstructor(String input) {
		   
	    this.xyz = input;
		this.name = "Chandan";
		System.out.println("Hey I have parameterized constructor, Default is gone..Yay!!!" + input);	
		
		}

   
   

	public static void main(String[] args) {	
		
		LearnConstructor secondConstructor = new LearnConstructor("Bindhu");
		
		System.out.println(secondConstructor.xyz);
		System.out.println(secondConstructor.xyz);
		
		Animal an = new Animal();
		System.out.println(an.color);
		System.out.println(an.size);
		
		//float ab = 56.768454465f;
		//System.out.println(ab); 
		
		int a = 23;
		
		//String abc  = "Goat";
		
		char c = 'g';
		char c2 = '2';
		
		
		boolean b2 = false ;
		
		System.out.println(b2);
		
		// I am a single line comment
		
		/*skjthdjkg
		 * sdghdfh
		 */
	}
	
	

}
