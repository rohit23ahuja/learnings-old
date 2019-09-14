package com.learn.dsa.stack;

public class App {

	public static void main(String[] args) throws Exception {
		// String str = "a%b";
		String str = "a+b*(c+d*e+(g%h))"; // output abcde*+gh%+*+
		System.out.println(inFixToPostFix(str));
	}

	private static String inFixToPostFix(String str) {
		char[] chars = new char[str.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = str.charAt(i);
		}
		StackOfChars stack = new StackOfChars(str.length());
		String temp = "";
		for (int i = 0; i < chars.length; i++) {
			if (Character.isAlphabetic(chars[i])) {
				temp = temp + chars[i];
			} else if (chars[i]=='(') {
				stack.push(chars[i]);
			} else if (chars[i]==')'){
				while(stack.peak()!='('){
					temp = temp + stack.pop();
				}
				stack.pop(); // to remove '(' from stack
			} else {
				while(!(stack.isEmpty()) && !(stack.peak()=='(') && prec(chars[i])<=prec(stack.peak())) {
					temp = temp + stack.pop();
				}
				stack.push(chars[i]);
			}
		}
		while(!stack.isEmpty()) {
			temp = temp + stack.pop();
		}
		return temp;
	}

	private static int prec(char c) {
		if(c=='+'||c=='-') {
			return 1;
		}
		if (c=='%'||c=='/'||c=='*'){
			return 2;
		}
		return 0;
	}

	private static String reverseString(String str) {
		int stackSize = str.length();
		StackOfChars chars = new StackOfChars(stackSize);
		for (int i = 0; i < stackSize; i++) {
			chars.push(str.charAt(i));
		}
		String result = "";
		while (!chars.isEmpty()) {
			result = result + chars.pop();
		}
		return result;
	}

	private static boolean balancedParenthesis(String str) {
		int length = str.length();
		StackOfParenthesis parenthesis = new StackOfParenthesis(length);
		for (int i = 0; i < length; i++) {
			parenthesis.push(str.charAt(i));
		}
		return false;
	}

}
