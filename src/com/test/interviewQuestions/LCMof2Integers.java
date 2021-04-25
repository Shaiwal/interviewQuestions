package com.test.interviewQuestions;

public class LCMof2Integers {

	public static void main(String args[]) {

		int a = 20;
		int b = 15;

		System.out.println(lcm(a, b));
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
