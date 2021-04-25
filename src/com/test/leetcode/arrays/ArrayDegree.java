package com.test.leetcode.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Given a non-empty array of non-negative integers nums, 
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, 
 * that has the same degree as nums.
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation: 
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * Note:	
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 */
public class ArrayDegree {
	
	 public static int findShortestSubArray(int[] nums) {
	       
         Map<Integer, Integer> left = new HashMap<Integer, Integer>(),
           right = new HashMap<Integer, Integer>(), count = new HashMap<Integer, Integer>();
       /*
        * create a left map to log least index/ position of each element in array
        * create a right map to log max index/position of each element in array
        * count map will log count or no of times an element is present in array   
        */
       for (int i = 0; i < nums.length; i++) {
           int x = nums[i];
           if (left.get(x) == null) left.put(x, i);
           right.put(x, i);
           count.put(x, count.getOrDefault(x, 0) + 1);
       }
      // System.out.println(left);
       //System.out.println(right);
       //System.out.println(count);
       
       int ans = nums.length;
       //get the degree value
       int degree = Collections.max(count.values());
       //System.out.println(degree);
       // looping over count map, find difference in least and max position of elements which make degree in array
       for (int x: count.keySet()) {
           if (count.get(x) == degree) {
               ans = Math.min(ans, right.get(x) - left.get(x) + 1);
               //System.out.println(ans + " .. " + x);
           }
       }
       return ans;
   }

	 public static void main(String args[]) {
		 
		 int[] arr = {1,2,2,3,1,1};
		 System.out.println("Possible length of array is : " + ArrayDegree.findShortestSubArray(arr));
		 int[] arr2 = {1,2,2,3,1,4,2};
		 System.out.println("Possible length of array is : " + ArrayDegree.findShortestSubArray(arr2));
		 int[] arr3 = {1, 2, 2, 3, 1};
		 System.out.println("Possible length of array is : " + ArrayDegree.findShortestSubArray(arr3));
	 }

}
