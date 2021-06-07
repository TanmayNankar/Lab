package com.cg.demo.oop;

public class BlockDemo {
	
	
	static int num = 10;
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("non static block");//Execute only when you create object 
	}
	
	
	static void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		System.out.println("main");
		BlockDemo obj = new BlockDemo();
		m1();
	}
}

