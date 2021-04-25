package com.test.interviewQuestions;

/*
 * just to check which will run
 */
public class OverloadMain {
	
	public static void main(String args[]) {
		System.out.println("inside public static void main(String args[])");
	}
	
	public static void main(String arg) {
		System.out.println("inside public static void main(String args)");
	}
	
	public static void main(int args[]) {
		System.out.println("inside public static void main(String args)");
	}
	//will give error
//	public static void main(String args[]) {
//		System.out.println("inside public static void main(String args[])");
//	}
	
}
