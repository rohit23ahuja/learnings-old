package interviewbit.solutions.linkedlist;

public class CycleStartLinkedList {

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		ListNode c = new ListNode(3);
		b.next = c;
		ListNode d = new ListNode(4);
		c.next = d;
		d.next = null;
		CycleStartLinkedList c1 = new CycleStartLinkedList();
		System.out.println(c1.detectCycle(a));
	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		if (slow==null) {
			return null;
		}
		boolean cycle=false;
		ListNode fast = slow.next;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast) {
				cycle=true;
				break;
			}
		}
		if (cycle) {
			fast=fast.next;
			int size=1;
			while(slow!=fast){
				fast=fast.next;
				size++;
			}
			if(size==1){
				return fast;
			}
			int count=1;
			slow=head;
			fast=head;
			while(count<=size){
				fast=fast.next;
				count++;
			}
			while(slow!=fast){
				slow=slow.next;
				fast=fast.next;
			}
			return fast;	
		} else {
			return null;
		}
	}

}
