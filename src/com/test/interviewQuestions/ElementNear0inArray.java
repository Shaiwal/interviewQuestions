package com.test.interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Find positive number closest to 0 in an Array
 */
public class ElementNear0inArray {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// input array
		String arrStr = s.nextLine();
		s.close();
		String[] arrayStr = arrStr.split(" ");
		Integer[] arrInt = new Integer[arrayStr.length + 1];
		arrInt[0] = 0;
		for(int i=0; i<arrayStr.length; i++) {
			arrInt[i+1] = Integer.parseInt(arrayStr[i]);
		}
		//sort the array
		Arrays.sort(arrInt);
		System.out.println("Element nearest to 0 is: " + arrInt[1]);
	}

}
