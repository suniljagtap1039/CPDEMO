package com.inheritance;

public class person {
	protected String name ; //shared with child class
	 protected String Address ;
	protected String contactnumber ;
	protected String Email ;
	private  int PID ; //inside class only
	public String A = "ParentClass";
	
	public void passwordchanged() {
		// TODO Auto-generated method stub
		System.out.println("Password changed Person");
	}
	public void m1 (){

		System.out.println("passwordchanged parent");
		System.out.println(A);
	}
	
}
