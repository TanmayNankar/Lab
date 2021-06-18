package com.cg.demo.stream;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Consumer;
	import java.util.stream.Stream;

	public class stream {
		public static void main(String[] args) {

			List<Employee> empList = new ArrayList<>();
			empList.add(new Employee(101, "Vaman", 10000));
			empList.add(new Employee(102, "Raman", 18000));
			empList.add(new Employee(103, "Soman", 12000));
			empList.add(new Employee(104, "Suman", 15000));
			empList.add(new Employee(105, "Lakshman", 20000));

//			System.out.println(empList);

//			iterate - for loop, for each, iterator  

//			empList.forEach(emp -> System.out.println(emp.toString()));

			Stream<Employee> empStream = empList.stream();

			Stream<Employee> empWithMoreSal = empStream.filter((e) -> e.salary > 15000);

			empWithMoreSal.forEach(em -> System.out.println(em.toString()));

			empList.stream().filter((e) -> e.salary > 15000).forEach(em -> System.out.println(em.toString()));

		}
	}