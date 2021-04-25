package com.test.interviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// input number
		int n = Integer.parseInt(s.nextLine());
		s.close();
		boolean isPrime = true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(n + " is boolean is " + isPrime);
	}

}