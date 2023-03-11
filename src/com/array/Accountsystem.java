package com.array;

public class Accountsystem {
public static void main(String[] args) {
	
	
	double salaries [] = new double [10];	
	int EMP_ID [] = new int [10];
	char gender [] = new char [10]; 
	String nameofemployee [] = new String [10];

	salaries [0] = 1022.87 ;
	salaries [1] = 1082.87 ;
	salaries [2] = 1002.87 ;
	salaries [3] = 1022.87 ;  
	salaries [4] = 122.87 ;
	salaries [5] = 1022.87 ;
	salaries [6] = 1022.87 ;
	salaries [7] = 1022.87 ;
	salaries [8] = 1022.87 ;
	salaries [9] = 1022.87 ;
	
	for (int a = 0 ; a <= 9 ;  a++ )
		System.out.println("Salary of Emp   " + salaries [a]);
	
	EMP_ID [0] = 880 ;
	gender [0] = 'M' ;
	nameofemployee [0] = "Sunil Jagtap" ;
 System.out.println(salaries [0]);
 System.out.println(EMP_ID [0]);
 System.out.println(gender [0]);
 System.out.println(nameofemployee [0]);


}

}