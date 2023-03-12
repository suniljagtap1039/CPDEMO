package com.abstarct;

public abstract class shape {
protected int radius ;
	public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
	public abstract void calculatearea();
	public abstract void perimeter();

	public shape(int radius) {
		
		this.radius = radius;
	}
	public void test() {
		
		System.out.print("test");
	}
	
	
}
