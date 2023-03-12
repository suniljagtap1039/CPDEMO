package com.abstarct;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape c  = new circle(100000); //runtime polymorphism

	c.calculatearea();
	c.perimeter();

	c.test();

	c.calculatearea();
	
	shape s = new square2(10000);
	s.calculatearea();
s.perimeter(); 
	s.setRadius(100);
	}
}