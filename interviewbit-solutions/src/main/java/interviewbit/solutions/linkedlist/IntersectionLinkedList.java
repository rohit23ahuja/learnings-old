package interviewbit.solutions.linkedlist;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class IntersectionLinkedList {
	public static void main(String[] args) {
		IntersectionLinkedList i = new IntersectionLinkedList();
/*		ListNode a = new ListNode(1);
		ListNode a2 = new ListNode(2);
		a.next = a2;
		ListNode a3 = new ListNode(8);
		a2.next = a3;
		ListNode a4 = new ListNode(9);
		a3.next = a4;
		ListNode a5 = new ListNode(7);
		a4.next = a5;

		ListNode b = new ListNode(3);
		ListNode b2 = new ListNode(8);
		b.next = b2;
		ListNode b3 = new ListNode(5);
		b2.next = b3;
		ListNode b4 = new ListNode(8);
		b3.next = b4;
		ListNode b5 = new ListNode(9);
		b4.next = b5;
		ListNode b6 = new ListNode(7);
		b5.next = b6;*/
		
		ListNode a = new ListNode(76);
		ListNode a2 = new ListNode(21);
		a.next = a2;
		ListNode a3 = new ListNode(20);
		a2.next = a3;
		ListNode a4 = new ListNode(50);
		a3.next = a4;
		ListNode a5 = new ListNode(46);
		a4.next = a5;
		ListNode a6 = new ListNode(91);
		a5.next = a6;
		ListNode a7 = new ListNode(76);
		a6.next = a7;
		ListNode a8 = new ListNode(74);
		a7.next = a8;
		ListNode a9 = new ListNode(23);
		a8.next = a9;
		ListNode a10 = new ListNode(18);
		a9.next = a10;
		ListNode a11 = new ListNode(73);
		a10.next = a11;
		ListNode a12 = new ListNode(14);
		a11.next = a12;
		
		ListNode b = new ListNode(43);
		ListNode b2 = new ListNode(63);
		b.next = b2;
		ListNode b3 = new ListNode(17);
		b2.next = b3;
		ListNode b4 = new ListNode(84);
		b3.next = b4;
		ListNode b5 = new ListNode(15);
		b4.next = b5;
		ListNode b6 = new ListNode(71);
		b5.next = b6;
		ListNode b7 = new ListNode(60);
		b6.next = b7;
		ListNode b8 = new ListNode(73);
		b7.next = b8;
		ListNode b9 = new ListNode(76);
		b8.next = b9;
		ListNode b10 = new ListNode(74);
		b9.next = b10;
		ListNode b11 = new ListNode(23);
		b10.next = b11;
		ListNode b12 = new ListNode(18);
		b11.next = b12;
		ListNode b13 = new ListNode(73);
		b12.next = b13;
		ListNode b14 = new ListNode(14);
		b13.next = b14;

		ListNode l = i.getIntersectionNode(a, b);
		//ListNode l = i.getIntersectionNodeTry(a, b);
		while (l!=null) {
			System.out.print(l.val+"-->");
			l=l.next;
		}
	}
	
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		int countA=0;
		ListNode currentA = a;
		while(currentA!=null){
			countA++;
			currentA=currentA.next;
		}
		
		int countB=0;
		ListNode currentB = b;
		while(currentB!=null){
			countB++;
			currentB=currentB.next;
		}
		currentA=a; currentB=b;
		while(countA>0&&countB>0){
			if (countA>countB) {
				countA--;
				currentA=currentA.next;
			} else if (countB>countA){
				countB--;
				currentB=currentB.next;
			} else {
				if (currentA.val==currentB.val) {
					return currentA;
				} else {
					countA--;
					countB--;
					currentA=currentA.next;
					currentB=currentB.next;
				}
			}
		}
		return null;
	}

	public ListNode getIntersectionNodeOld(ListNode a, ListNode b) {
		ListNode l1 = a;
		ListNode l2 = null;
		while (l1 != null) {
			l2 = b;
			while (l2 != null) {
				if (l1.val == l2.val) {
					return l2;
				} else {
					l2 = l2.next;
				}
			}
			l1 = l1.next;
		}
		return null;
	}
	
	public ListNode getIntersectionNodeTry(ListNode a, ListNode b) {
		ListNode l1 = a;
		HashMap<Integer, Boolean> map = createMap(l1);
		ListNode head = null;
		ListNode endPointer = null;
		ListNode l2 =b;
		while (l2!=null) {
			if (map.containsKey(l2.val)&& !map.get(l2.val)) {
				map.put(l2.val, true);
				if (endPointer==null) {
					head = new ListNode(l2.val);
					endPointer = head;
				} else {
					ListNode l = new ListNode(l2.val);
					endPointer.next=l;
					endPointer=endPointer.next;
				}
			}
			l2=l2.next;
		}
		return head;
	}

	private HashMap<Integer, Boolean> createMap(ListNode l1) {
		LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();
		while (l1!=null) {
			map.put(l1.val, false);
			l1=l1.next;
		}
		return map;
	}
	
	

}

/**
 * Definition for singly-linked list.
 **/
class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	@Override
	public String toString() {
		return ""+val;
	}
	
}
