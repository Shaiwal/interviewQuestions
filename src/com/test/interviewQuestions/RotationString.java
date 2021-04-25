package com.test.interviewQuestions;

public class RotationString {
	
	public static void main(String args[]) {
		
		String original = "hello";
		String toCheck = "llohe";
		toCheck = toCheck + toCheck;
		boolean isRotational = false;
		if(toCheck.contains(original)) {
			isRotational = true;
		}
		System.out.println(isRotational);
	}

}
