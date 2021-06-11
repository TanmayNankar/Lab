//Exercise 7: Create a method to check if a number is an increasing number

package com.lab.demo;

import java.util.Scanner;

public class LabEx7 {
	public static void main(String[] args) {

		int number;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number::");
		number = sc.nextInt();

		int curr_num = number % 10;
		number = number / 10;

		while (number > 0) {
			if (curr_num <= number % 10) {
				flag = true;
				break;
			}
			curr_num = number % 10;
			number = number / 10;
		}

		if (flag) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
	}

}




