package problems.linked.list;

public class ReorderLinkedList {
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		ListNode c = new ListNode(3);
		b.next = c;
		ListNode d = new ListNode(4);
		c.next = d;
		ListNode e = new ListNode(5);
		d.next = e;
		ReorderLinkedList r = new ReorderLinkedList();
		a = r.reorderList(a);
		System.out.println(a);
	}

	public ListNode reorderList(ListNode a) {
		// 1. find mid point of list
		ListNode mid = midPoint(a);
		// 2. divide list into two havles
		ListNode first = a;
		ListNode second =mid.next;
		mid.next=null;
		
		// 3. reverse 2nd Half
		second = reverseList(second);
		
		// 4. Merge first half and second half
		mergeList(first, second);
		return a;
	}
	
	private static void mergeList(ListNode first, ListNode second){
		while(second!=null){
			ListNode temp1 = first.next;
			ListNode temp2 = second.next;
			first.next=second;
			second.next=temp1;
			second=temp2;
			first=temp1;
		}
	}
	private static ListNode reverseList(ListNode second) {
		ListNode curr = second;
		ListNode next = null;
		ListNode prev = null;
		while(curr!=null){
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}

	private static ListNode midPoint(ListNode a) {
		ListNode slow = a;
		ListNode fast = slow.next;
		while (fast != null && fast.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
}
