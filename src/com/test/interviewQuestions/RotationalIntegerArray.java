package com.test.interviewQuestions;

import java.util.Arrays;

/*
 * Given a sorted array find if it is rotational
 */
public class RotationalIntegerArray {

	public static void main(String args[]) {
		int[] arr = {2, 3, 5, 8, 9};
		int[] toCheck = {5, 8, 9, 2, 3};
		String arrStr = Arrays.toString(arr);
		String[] arrayStr = arrStr.substring(1, arrStr.length()-1).split(",");
		String toCheckStr = Arrays.toString(toCheck);
		String[] toCheckArrayStr = toCheckStr.substring(1, toCheckStr.length()-1).split(",");
		System.out.println(arrayStr + " ... " + toCheckArrayStr);
		arrStr = "";
		for(String s:arrayStr) {
			arrStr = arrStr + s;
		}
		toCheckStr = "";
		for(String s: toCheckArrayStr) {
			toCheckStr += s;
		}
		System.out.println(arrStr + " // " + toCheckStr);
		toCheckStr = toCheckStr + " " + toCheckStr;
		System.out.println(toCheckStr);
		boolean isRotational = false;
		if(toCheckStr.contains(arrStr)) {
			isRotational = true;
		}
		System.out.println(isRotational);
	}
}
