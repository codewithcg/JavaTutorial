package com.xyz.in;

public class CG {

	public static void main(String args[]) {

//		String s1 = new String("codewithcg");
//		String s2 = new String("codewithcg");
//		if (s1 == s2)
//			System.out.println("Equal");
//		else
//			System.out.println("Not equal");
//

		String s1 = "HELLO";
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true

	}

}

//	public static void main(String[] args)
//	{
//		String s1 = "HELLO";
//		String s2 = "HELLO";
//		String s3 = new String("HELLO");
//		System.out.println(s1 == s2); // true
//		System.out.println(s1 == s3); // false
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s1.equals(s3)); // true
//	}
