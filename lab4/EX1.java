//Exercise 1:  Validate the age of a person and display proper message by using user defined exception. 
//Age of a person should be above 15.
package com.lab.demo.lab4;

import java.util.Scanner;

public class EX1 {

	static void AgeDefine() {
		int age = 0;
		if ( age <15) {
	System.out.println("Age is above 15");
}else {
	System.out.println("Age is below 15");
}
	}



	public static void main(String[] args) {
		
		int age1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age -");
		int age1 = sc.nextInt();
		System.out.println(age1);
		sc.close();
	}
		
	}
