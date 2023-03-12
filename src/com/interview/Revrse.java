package com.interview;

public class Revrse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "Java";
		char chararray[] = data.toCharArray();
		String result = "";
		for (int index = chararray.length -1; index >= 0; index--)
		{
			
			result = result + chararray[index] + "";
					}
		System.out.println(result);
	}

}
	