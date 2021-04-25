package com.test.interviewQuestions;

import java.util.Stack;

/*
 * lets say we have sequence of 3 chars/brackets [{( and we want to validate
 * that each opening bracket should have corresponding closing bracket 
 * then write a method to validate it
 * e.g. [{{({})}}], {[({()})]} are valid and [{(})] is invalid
 */
public class ValidateCharSequence {
	
	public static void main(String args[]) {
		System.out.println("[{{({})}}] is valid: " + validateCharSequence("[{{({})}}]"));
		System.out.println("{[({()})]} is valid: " + validateCharSequence("{[({()})]}"));
		System.out.println("[{(})] is valid: " + validateCharSequence("[{(})]"));
	}
	
	static boolean validateCharSequence(String chars) {
		Stack<Character> stk = new Stack<Character>();
		char[] charArr = chars.toCharArray();
		String  validate = "";
		for(char c: charArr) {
			if(c == '[' || c == '{' || c == '(') {
				stk.push(c);
			}else if(c == ']' || c == '}' || c == ')'){
				char chr = stk.pop();
				if(chr == '[') {
					validate = chr + validate + ']';
				}else if(chr == '{') {
					validate = chr + validate + '}';
				}else if(chr == '(') {
					validate = chr + validate + ')';
				}
			}
		}
		System.out.println("validate> " + validate);
		if(stk.empty() && validate.equals(chars))
			return true;		
		
		return false;
	}

}
