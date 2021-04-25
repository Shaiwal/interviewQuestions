package com.test.interviewQuestions;

import java.util.Scanner;

/*
 * write a fn that receives string with number 
 * and prints sum of all possible substring nos eg. Sum("123")=1+2+3+12+23+123=164
 */

public class SumofPossibleSubstring {
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		String nStr = s.nextLine();
		s.close();
		String[] nArr = nStr.split("");
		int sum = 0;
		for(int i=0;i<nArr.length;i++) {
			for(int j=i;j<=nArr.length;++j) {
				System.out.println(">>"+nStr.substring(i,j));
				if(!nStr.substring(i,j).equals(""))
					sum = sum + Integer.parseInt(nStr.substring(i,j));
			}
			
		}
		System.out.println(sum);
		
	}

}
