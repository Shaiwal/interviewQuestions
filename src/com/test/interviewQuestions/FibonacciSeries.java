package com.test.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int maxNo = Integer.parseInt(s.nextLine());
		s.close();
		int sum = 0;
		int minus1 = 1;
		int minus2 = 0;
		List<Integer> l = new ArrayList<Integer>();
		l.add(minus2);
		l.add(minus1);
		while(sum < maxNo) {
			sum = minus1 + minus2;
			minus2 = minus1;
			minus1 = sum;
			l.add(sum);
			
		}
		System.out.println(l);
	}

}
