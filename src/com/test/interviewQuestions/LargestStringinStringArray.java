package com.test.interviewQuestions;

/*
 * program to find largest string in given string array
 */

public class LargestStringinStringArray {
	
	public static void main(String args[]) {
		String[] arr = {"My", "name", "is", "Shaiwal", "Sharma"};
		int maxLength = 0;
		String largestStr = "";
		for(String s:arr) {
			if(maxLength==0) {
				maxLength=s.length();
				largestStr = s;
			}else if(maxLength<s.length()) {
				maxLength=s.length();
				largestStr = s;
			}
		}
		System.out.println(largestStr);
	}

}
