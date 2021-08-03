package com.xyz.in;

public class Complex {
	private double re, im;

	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}

	Complex(double c) {
		re = c;
		im = c + 0.98;
	}

	Complex(Complex c) {
		// re = c;
		// im = c + 0.98;
	}

}
