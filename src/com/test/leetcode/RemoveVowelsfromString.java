package com.test.leetcode;

public class RemoveVowelsfromString {
    public static String removeVowels(String S) {
        
       return S.replaceAll("[a|e|i|o|u]", "");
        
    }
    
    public static void main(String args[]) {
    	System.out.println(RemoveVowelsfromString.removeVowels("ShaiwalSharma"));
    	System.out.println(RemoveVowelsfromString.removeVowels("uoiea"));
    }
}
