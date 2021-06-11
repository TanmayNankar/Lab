//Exercise 4
//Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

package com.lab.demo;

import java.util.Scanner;

public class LabEx4 {
	public static void main(String[] args) {

		int n;
		int p;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter a number:");
			n = s.nextInt();
		}
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0)
			System.out.println(i);
		}

	}

}
