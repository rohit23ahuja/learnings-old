package com.learn.dsa.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ElementSumNonZero {

    private static Node head;

    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private void removeNonZeroElements(Node root) {
    	Node start = root;
    	boolean flag = false;
    	List<Node> list = new ArrayList<>();
    	Stack<Node> stack = new Stack<Node>();
    	while(start!=null){
    		if (start.data>0) {
				stack.push(start);
			} else {
				int sum = start.data;
				flag=false;
				while(!stack.isEmpty()){
					Node temp = stack.pop();	
					sum+=temp.data;
					if(sum==0){
						flag=true;
						list.clear();
						break;
					}
					list.add(temp);
				}
				if (!flag) {
					list.forEach(i->stack.add(i));	
					stack.add(start);
				}
			}
    		start=start.next;
    	}
    	stack.forEach(i -> System.out.print(i.data +" -> "));
    	System.out.println("NULL");
   }

    // Driver program to test above functions
    public static void main(String[] args) {
        ElementSumNonZero list = new ElementSumNonZero();
        ElementSumNonZero.head = new Node(6);
        ElementSumNonZero.head.next = new Node(-6);
        ElementSumNonZero.head.next.next = new Node(8);
        ElementSumNonZero.head.next.next.next = new Node(4);
        ElementSumNonZero.head.next.next.next.next = new Node(-12);
        ElementSumNonZero.head.next.next.next.next.next = new Node(9);
        ElementSumNonZero.head.next.next.next.next.next.next = new Node(8);
        ElementSumNonZero.head.next.next.next.next.next.next.next = new Node(-8);

        list.removeNonZeroElements(head);
    }
}