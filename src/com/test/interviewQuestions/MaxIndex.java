package com.test.interviewQuestions;

/*
 * Max index... so there is an integer array with infinite size
 * starting from 0, and task is to find the max index that can be reached in array
 * with following conditions:
 * 1. You are given max no of steps that can taken to reach the index
 * 2. There is a bad index, which should be skipped or not reached while 
 * taking the steps
 * 3. The steps start from index 0, so lets say we have 
 * 2 pointers i & j, i=0 and j=1, where j is next step move..
 * so scenario 1 could be i=0, j=1 then i=1, j=2, then i=3 and j=3 and so on...
 * scenario 2 could be stay at index 0, so i=0,j=1 then i=0,j=2 then i=2, j=3 so on...
 * create 2 maxindex(es) and then iterate over steps as given and then see which ever
 * can cover max index skipping bad index or stopping at bad index, then compare those
 * 2 maxindexes for result 
 */
public class MaxIndex {

}
