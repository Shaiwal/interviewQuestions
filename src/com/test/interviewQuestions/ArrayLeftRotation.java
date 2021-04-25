package com.test.interviewQuestions;

/*
* A left rotation operation on an array shifts each of the array's elements 
* unit to the left. For example, if  left rotations are performed on array , then the array would become .
* Given an array  of  integers and a number, , perform  left rotations on the array. 
* Return the updated array to be printed as a single line of space-separated integers.
* Input Format
* The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform.
* The second line contains  space-separated integers .
*/
public class ArrayLeftRotation {
	
	public static void main(String args[]) {
		int[] a = {1,2,3,4,5};
		System.out.println(leftRotateArray(a, 4));
		System.out.println(leftRotateArray(a, 2));
		
	}
	
	private static String leftRotateArray(int[] arr, int leftShifts) {
		int newArr[] = new int[arr.length];
		if(arr.length>=leftShifts) {
			for(int i=0;i<arr.length;i++) {
				if((i)>=leftShifts) {
					newArr[(i)-leftShifts] = arr[i];
				}else {
					newArr[(i)-leftShifts + arr.length] = arr[i];
				}
			}
		}
		String s = "";
		for(int i:newArr) {
			s += i + " ";
		}
		return s;
	}

}
