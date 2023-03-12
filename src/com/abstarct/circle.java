package com.abstarct;

public class circle extends shape {

	public circle(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatearea() {
		// TODO Auto-generated method stub
		System.out.println("CalculatedAreaofcircle" +(3.14*10*10));	
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeetreAreaofcircle" +(2*3.14*10 ));	
	}
public void circledemo() {System.out.println("perimeetreAreaofcircle" +(2*3.14*10 ));}
}
