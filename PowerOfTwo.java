//Exercise 8: Create a method to check if a number is a power of two or not

package com.lab.demo;

import java.util.Scanner;

public class PowerOfTwo {

	public static boolean CheckNumber(int n) {
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the Integer");
		int num = sc.nextInt();

		if (CheckNumber(num))
			System.out.println("True");
		else
			System.out.println("false");
		
	}

}
