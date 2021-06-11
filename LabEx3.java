package com.lab.demo;
//Exercise 3
//The Fibonacci sequence is defined by the following rule
//The first 2 values in the sequence are 1, 1.  Every subsequent value is the sum of the 2 values preceding it.
//Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?

import java.util.Scanner;

public class LabEx3 {
public static void main(String[] args) {
	
		//Accept user Input in variable num
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please Enter the range of fibonscci:-");
	 int num = sc.nextInt();
	 int n1=0,n2=1,n3;

	 System.out.println(n1);
	 System.out.println(n2);
	 for (int i =2; i<num; i++);
	 {
		 n3=n1 + n2;
		 
		 System.out.println(n3);
		 n1=n2;
		 n2=n3;
	 }
	 
}
}
