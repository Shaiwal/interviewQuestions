package com.test.interviewQuestions;

public class Swap2Integers {
	
	public static void main(String args[]) {
		int a = 23;
		int b = 65;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + " & b = " + b);
	}

}
