package com.inheritance;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer Saila = new Customer()	;
	Saila.name= "Saila";
	Saila.Address = "Pune";
	Saila.contactnumber = "668868" ;
	Saila.bookTickets();
	Saila.makepayment();
	
	Saila.passwordchanged();
	Admin AD = new Admin();
AD.passwordchanged();
	person geetha = new Customer(); //runtime
	geetha.passwordchanged();
	person geetha1 = new person(); 
	geetha1.passwordchanged();

	
	
	}

}
