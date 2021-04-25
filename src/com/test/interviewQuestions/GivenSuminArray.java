package com.test.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*
 * occurrence of given sum in an array.. 
 * eg. Input[10 5 3 2] and sun as 15 so answer is 2 as 10+5 & 10+3+2
 */
public class GivenSuminArray {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//input array elements separated by space
		String arrStr = s.nextLine();
		// input sum to be evaluated
		int sum = Integer.parseInt(s.nextLine()); 
		s.close();
		String[] arrayStr = arrStr.split(" ");
		Integer[] arrInt = new Integer[arrayStr.length];
		for(int i=0; i<arrayStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrayStr[i]);
		}
		Arrays.sort(arrInt, Collections.reverseOrder());
		//System.out.println(arrInt.toString());
		for(int i=0; i<arrInt.length; i++) {
			int val = arrInt[i];
			String sumStr = String.valueOf(arrInt[i]);
			if(val == sum) {
				System.out.println(val + "  " + sumStr);
				val = arrInt[i];
				sumStr = String.valueOf(arrInt[i]);
			}else {
				for(int j=i+1;j<arrInt.length;j++) {
					val = val + arrInt[j];
					sumStr = sumStr + "+" + arrInt[j];
				//	System.out.println(val + sumStr);
					if(val == sum) {
						System.out.println(val + "  " + sumStr);
						val = arrInt[i];
						sumStr = String.valueOf(arrInt[i]);
					}
				}
			}
			
		}
		
	}
}
