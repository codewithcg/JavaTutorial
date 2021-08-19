package com.access.package02;

import com.access.package01.ProtectedTest01;

public class ProtectedTest03 extends ProtectedTest01 {

	public static void main(String[] args) {

		ProtectedTest03 p3 = new ProtectedTest03();
		p3.method01();
		System.out.println(p3.x);

		// ProtectedTest01 p1 = new ProtectedTest01();
		// p1.method01();
	}
}
