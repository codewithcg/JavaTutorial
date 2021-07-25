package com.tsys;

public class FiratJavaProgram {

	public static void main() {
		
        System.out.println("Hello Bindu..");
        System.out.println("Hello Lakshmi..");

       // System.out.println(args[0]);
        
        Animal animal  = new Animal(); 
        
        animal.eat("Banana");
        animal.eat("Apple");
        animal.hunt();   
        animal.sleep();
        
        Animal mouse  = new Animal();
        
        mouse.sleep();
        mouse.hunt();
        
        new Animal().sleep();
        new Animal().hunt();
        
        System.out.println(new Animal());
        System.out.println(new Animal());
	}
	
	

}
