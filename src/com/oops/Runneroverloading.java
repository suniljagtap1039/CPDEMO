	package com.oops;
	
	public class Runneroverloading {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Addition A = new Addition();
	float result = 	A.add(100, 100);
		System.out.println(result);
		
		 result =A.add(200, 800, 98); //if int decleared error occurs
				System.out.println(result);
		
			float	result1 =A.add(100, 10.5f); 
				System.out.println(result1);
		result = A.add(9.5f, 100);
				System.out.println(result);
		}
	
	}
