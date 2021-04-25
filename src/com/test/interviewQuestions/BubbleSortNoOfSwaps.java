package com.test.interviewQuestions;

/*
 * Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:
*  Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
*  First Element: firstElement, where  is the first element in the sorted array.
*  Last Element: lastElement, where  is the last element in the sorted array.
*/
public class BubbleSortNoOfSwaps {

	// Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int numSwaps = 0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
    
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                   // swap(a[j], a[j + 1]);
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                   numSwaps++;
                }
            }
            
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
        
    }
    
    public static void main(String args[]) {
    	int[] a1 = {1, 2, 3},
    		  a2 = 	{3, 2, 1},
    		  a3 = {4, 2, 3, 1};
    	
    	countSwaps(a1);
    	countSwaps(a2);
    	countSwaps(a3);
    }
	
}
