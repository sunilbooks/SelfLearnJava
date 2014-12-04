package com.sunilbooks.selflearnjava.other;

import com.sunilbooks.selflearnjava.oop.MyClass;
/**
 * 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class OtherPkgClass {

	public static void main(String[] args) {
		MyClass c = new MyClass();
		// System.out.println(c.defaultAttribute);//Compilation error
		// System.out.println(c.protectedAttribute);//Compilation error
		System.out.println(c.publicAttribute);
	}

}

class OtherPkgChild extends MyClass {
	public int getProtectedValue() {
		return protectedAttribute;
	}

	public int getDefaultValue() {
		//return defaultAttribute; //Compilation error
		return 0;
	}
}
