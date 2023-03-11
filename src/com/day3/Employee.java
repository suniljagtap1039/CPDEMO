package com.day3;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "Sunil";
		int rollno = 880 ;
		String Email = "suniljagtap9`97@gmail.com";
		double marks = 300.55;
		double percentage = 70.7;
		int totaldays = 20;
		double hourwages = 4.5 ;
		
		
		
		System.out.println("Student Name is :" + Name);
		System.out.println("Student Roll NO  is :" + rollno);
		System.out.println("Student Email is :" + Email );
		System.out.println("Student marks is :" + marks);
		System.out.println("Student percentage is :" + percentage);
		double totalmonthlysalary = calculatesalary( totaldays ,  hourwages);
		//calculatesalary(20 , 4.5);
		System.out.println("Student percentage is :" + totalmonthlysalary);
	}
	/*public static void calculatesalary(int totaldays , double hourwages) {
		double totalsalary = (totaldays*9)*hourwages ;
		System.out.println("Student salary is :" + totalsalary); */

	public static double calculatesalary(int totaldays , double hourwages) {
		double totalsalary = (totaldays*9)*hourwages ;
		//System.out.println("Student salary is :" + totalsalary);
	return totalsalary ;
	}

}
