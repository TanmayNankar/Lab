package com.cg.demo.stream;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}