package com.xyz.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * The Main class implements an application that reads lines from the standard
 * input and prints them to the standard output.
 */
public class Main1 {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			int x = Integer.parseInt(line);
			// int square = x * x;
			System.out.println(x * x);
		}

//		int x = Integer.parseInt(line);
//		int square = x * x;
//		System.out.println("Square of number is : " + square);
	}
}
