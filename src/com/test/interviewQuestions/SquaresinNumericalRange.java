package com.test.interviewQuestions;

/*
 *  find no of integer squares in given numerical range
 */
public class SquaresinNumericalRange {
	
	public static void main(String args[]) {
		
		int lowerRange = 1;
		int upperRange = 200;
		
		int squareCount = 0;
		
		for(int i=lowerRange; i<=upperRange; i++) {
			
			for(int j=1;j*j<=i;j++) {
				if(j*j == i) {
					squareCount++;
					System.out.println(i);
				}
			}
		}
		
		System.out.println("Count is: "+ squareCount);
		
	}

}
