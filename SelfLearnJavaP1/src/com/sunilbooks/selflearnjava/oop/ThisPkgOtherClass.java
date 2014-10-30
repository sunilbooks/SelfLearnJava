package com.sunilbooks.selflearnjava.oop;

public class ThisPkgOtherClass {

	public static void main(String[] args) {

		MyClass c = new MyClass();
		System.out.println(c.defaultAttribute);
		System.out.println(c.protectedAttribute);
		System.out.println(c.publicAttribute);
	}

}
