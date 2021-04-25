package com.test.interviewQuestions;

/*
 * swap 2 strings without any additional string
 */
public class Swap2Strings {

	public static void main(String args[]) {
		String a = "a";
		String b = "b";
		a = a + b;
		b = a;
		a = a.substring(1);
		b = b.substring(0,1);
		System.out.println("a = " + a + " & b = " + b);
	}
}
