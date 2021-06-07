package com.cg.demo.oop;


class Abc{
	int num5;
	static int num6;
}

public class VarDemo {
	//fields
	int num1; //instance variable /field
	static int num2; //static variable /field
	private static char[] num6;
	
	void m1() {
		//local variable
		int num3;
		}

	public static void main(String[] args) {
		
		int num4;
		num4 =10;
	
		
		System.out.println(VarDemo.num2);
		Abc abc = new Abc();
		
       System.out.println(VarDemo.num6);
		num2=20;
		
	}
}

