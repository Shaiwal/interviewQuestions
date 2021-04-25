package com.test.leetcode;

public class SingleRowKeyboard {
	
	public static int calculateTime(String keyboard, String word) {
        int time = 0;
        String[] wordArr = word.split("");
        for(int i=0;i<wordArr.length-1;i++){
            if(i==0){
                time = Math.abs( keyboard.indexOf(wordArr[i]) - time);
            }
            time = time + Math.abs( keyboard.indexOf(wordArr[i]) - keyboard.indexOf(wordArr[i+1]));
        }
        return time;
    }
	
	public static void main(String args[]) {
		System.out.println(calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
		System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
	}
	

}
