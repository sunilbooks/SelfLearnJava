package com.sunilbooks.selflearnjava.oop;

public class Employee extends Person {

	private float salary = 0;

	public Employee() {
	}

	public Employee(String name, String add, float sal) {
		super(name, add);
		salary = sal;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
