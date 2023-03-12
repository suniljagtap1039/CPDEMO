package com.inheritance;

public class Customer extends person {
	public String A = "ChildClass";

public void bookTickets (){

System.out.println("Tickets booked");
}
public void makepayment (){

System.out.println("Payment Done");
}
public void passwordchanged() {
	// TODO Auto-generated method stub
	System.out.println("Password changed Customer");
}
public void m1 (){

	System.out.println("passwordchanged child");
	System.out.println(A);
}
public void parentM1() {
super.m1();

}//SUPER KEYWORD
}

