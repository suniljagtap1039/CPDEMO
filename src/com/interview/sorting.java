package com.interview;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = new int []{ -90, 0 , 5 , 8 ,19, 88,15,2,3,4,};
	// invoking sort () method of array class

Arrays.sort(array);
	
for  ( int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}

}
}