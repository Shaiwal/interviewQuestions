package com.test.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

/*
 * Given let's say a string abcdba, find the first character to get repeated,
 * though here we see 'b' to repeat first, the answer would be 'a' as a appears 
 * before b in string, so idea is to find the char which appears earlier in string
 */
public class StringRepeatitionIndex {
	
	public static void main(String args[]) {
		
		System.out.println(findCharIndex("sdaas"));
		System.out.println(findCharIndex("abcdba"));
		System.out.println(findCharIndex("shaiwalsha"));
		
		
	}
	
	public static String findCharIndex(String str) {
		
		String[] strArr = str.split("");
		Map<String, Integer> m = new HashMap<String, Integer>();
		int index = -1;
		for(int i=0;i<strArr.length;i++) {
			if(m.get(strArr[i])!=null && (index > (int)m.get(strArr[i]) || index ==-1)) {
				index = (int)m.get(strArr[i]);
			}else {
				m.put(strArr[i], i);
			}
		}
		
		return (strArr[index]);
	}

}
