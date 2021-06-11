package com.lab.lab2;

import java.util.Scanner;

public class getSecoundsnallest {

	public static int getSecoundsmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];

				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");

		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Please enter element");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
 }
System.out.println("secound smallest" +getSecoundsmallest(a,size));
	}
}