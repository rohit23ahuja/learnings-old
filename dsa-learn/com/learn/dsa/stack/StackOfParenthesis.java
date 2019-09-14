package com.learn.dsa.stack;

/**
 * Check for balanced parentheses in an expression Given an expression string
 * exp , write a program to examine whether the pairs and the orders of
 * “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the program should
 * print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”
 * 
 * @author deepikaahuja
 *
 */
public class StackOfParenthesis {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackOfParenthesis(int size) {
		this.maxSize = size;
		stackArray = new char[maxSize];
		top=-1;
	}
	
	public void push(char item) {
		top++;
		stackArray[top]=item;
	}
	
	public char pop(){
		int old_top=top;
		top--;
		return stackArray[old_top];
	}
	
}
