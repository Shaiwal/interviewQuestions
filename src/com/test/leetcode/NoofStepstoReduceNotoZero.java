package com.test.leetcode;

public class NoofStepstoReduceNotoZero {
	/*
	 * public static int numberOfSteps (int num) { int noofsteps=0; while(num>0){
	 * if(num%2==0){ num = num/2; }else{ num--; } noofsteps++; } return noofsteps; }
	 */
	    //recursive
	    public static int numberOfSteps (int num) {
	        return num == 0 ? 0 : 1 + (num%2==0 ? numberOfSteps(num/2) : numberOfSteps(num-1));   
	    }
	    public static void main(String args[]) {
	    	String a = "1.1.1.1";
	    	a = a.replace(".", "[.]");
	    	System.out.println(a);
	    	System.out.println(NoofStepstoReduceNotoZero.numberOfSteps(14));
	    }
}
