package com.test.interviewQuestions;

import java.util.Arrays;

/*
 * find nth smallest element in an array
 */
public class NthSmallestElementinArray {
	
	public static void main(String args[]) {
		int[] arr = {9,3,8,4,6,1,7};
		int nSmallestNo = 5;
		Arrays.sort(arr);
		System.out.println(arr[nSmallestNo-1]);
	}

}
