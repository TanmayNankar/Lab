//Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

package com.lab.demo;

import java.util.Scanner;



public class LabEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter how many natural num");
        int n =sc.nextInt();
        int i = Integer.MAX_VALUE;
        int j,k,sum=0;
        
        for(k=0;k<=n;k++) {
        for(j=1;j<=i;j++) {
            if(j%3==0 || j%5==0) {
                sum=sum+j;
                k++;
                if(k==n) {
                    break;
                }
            }    
        }
        
    }
        System.out.println("sum of first  "+n+"  natural number is  "+sum);

 

}
}
