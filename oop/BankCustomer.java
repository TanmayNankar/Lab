package com.cg.demo.oop;

//member-method or filed

// access static member in static context - direct access - class reference
//access static member in non static context - free access - class reference
//access non static member in static context - restricted access - object reference
//access non static member in non static context - restricted access - this reference
//ex- in employee and app file (com.cg.method)
public class BankCustomer
{
	//static field
	static int ifsc;
    // non static field
	int AcNo;
	String name;
	double balance;
	
	//non static field
   void checkBalance() //method1 (method signature+method body)
   {
	  System.out.println("balance");
   }
   //static 
   static void openAccount() //method2
   {
	   System.out.println("open an account");
   }

public static void main(String[] args) //method3
{
BankCustomer c1 = new BankCustomer();
    ifsc = 1001202;
    c1.AcNo = 101;
    c1.name = "Sonu";
    c1.balance = 10000;
    System.out.println(c1.AcNo + " " + c1.name + " " + c1.balance);
    c1.checkBalance(); //method call or invocation
    
    
   //if we want free access or static we have to give name like c1. its like check balace of c1
    System.out.println(c1.balance);
    openAccount();
    System.out.println(ifsc);
}
}

 

