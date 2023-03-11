package com.Interview;

public class reversestring {

	public static void main(String[] args, Object result) {
		// TODO Auto-generated method stub

		String str = "Java";
		char chararray[] = str.toCharArray();
		String result1 = "";
		for (int reverse = str.length() -1; reverse>=0; reverse--);
		{
			int reverse = 0;
			result1 = result1 + chararray[reverse] + "";
					}
		System.out.println(result1);
	}

}
