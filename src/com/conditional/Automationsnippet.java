package com.conditional;

import java.util.Scanner;



public class Automationsnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner s = new Scanner(System.in);
			System.out.println("Enter choice ");
			String browserName 	= s.nextLine();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//if uppercase and lowercase matters
			System.out.println("Launching Chrome");
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("Launching Firefox");
			
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			
			System.out.println("Launching edge");
			
		}else if(browserName.equalsIgnoreCase("safari")) {
			
			System.out.println("Launching safari");
			
		}
	
	}

}
