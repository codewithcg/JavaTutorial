package com.access.package02;

import com.access.package01.ProtectedTest01;

public class ProtectedTest03 extends ProtectedTest01 {

	public static void main(String[] args) {

//		ProtectedTest01 p3 = new ProtectedTest03();
		// p3.method01(); //Error

		// System.out.println(p3.x);

//		 ProtectedTest01 p1 = new ProtectedTest03();
//		 p1.method01();

		ProtectedTest03 p31 = new ProtectedTest03();
		p31.method01();
	}

	public void test() {
		method01();
	}
}
