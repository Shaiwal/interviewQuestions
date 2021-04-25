package com.test.interviewQuestions;

import java.util.Scanner;

public class RecursiveFactorial {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int factStr = Integer.parseInt(s.nextLine());
		s.close();
		System.out.println(factorial(factStr));
	}
	
	static int factorial(int n) {
		if(n==1)
			return n;
		else
			return n * factorial(n-1);
	}

}
