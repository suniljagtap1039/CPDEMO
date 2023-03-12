 package com.abstarct;

public class square2 extends  square {

	public square2(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void Squaredemo() {
		// TODO Auto-generated method stub	
		System.out.println("Demosquare" +(3.14*10*10));	
	}

	@Override
	public void calculatearea() {
		// TODO Auto-generated method stub
		System.out.println("CalculatedAreaofsquare" +(3.14*10*10));	
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeterofsquare" +(3.14*10*10));	
	}
}
