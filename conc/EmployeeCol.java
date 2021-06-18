package com.cg.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//public class CallableDemo implements Callable<Integer> {
public class EmployeeCol implements Callable<Employee> {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		EmployeeCol obj = new EmployeeCol();

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Employee> future = service.submit(obj);
		Object num = future.get();
		System.out.println(num);
		service.shutdown();

	}

	@Override
	public Employee call() throws Exception {

		Employee obj = new Employee(0, null, null);
		obj.setId(24567);
		obj.setSalary(75.00);
		obj.setName("Tanmay");
		return obj;

	}

}
