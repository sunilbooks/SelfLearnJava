package com.sunilbooks.selflearnjava.basic;

public class TestArrayCopy {

	public static void main(String[] args) {
		char[] copyFrom = { 'S', 'U', 'N', 'R', 'A','Y', 'S' };
		char[] copyTo = new char[4];
		System.arraycopy(copyFrom, 3, copyTo, 0, 4);

		System.out.println(new String(copyTo));
	}

}
