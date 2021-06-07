package com.cg.demo.oop;

public class NextMethodDemo {
	
	static void someMethod() {
		System.out.println("this is  void method");
	}

	static int addTwoNumber(int i,int j) 
	{
		int k=i+j;
	  return k;
		
	}
	public static void main(String[] args) {
		System.out.println("main");
		int result= addTwoNumber(10,20);
		System.out.println(result);
	}
}
