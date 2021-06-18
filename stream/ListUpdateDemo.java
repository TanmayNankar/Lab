package com.cg.demo.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUpdateDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		System.out.println(empList);

		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			it.next().salary += 1000;
		}
		System.out.println(empList);

	}
}