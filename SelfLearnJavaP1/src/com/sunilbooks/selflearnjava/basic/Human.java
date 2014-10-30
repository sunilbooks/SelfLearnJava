package com.sunilbooks.selflearnjava.basic;

public enum Human {

	KID(10), MAN(50), OLDMAN(70);

	private final int weight;

	Human(int w) {
		this.weight = w;
	}

	public void display() {
		System.out.println(weight);
	}

	public static void main(String[] args) {

		Human h = Human.KID;
		h.display();

		Human[] hs = Human.values();

		for (int i = 0; i < hs.length; i++) {
			System.out.println(hs[i]);
		}

	}
}
