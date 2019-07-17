package problems.linked.list;

public class PartitionLinkedList {

	public static void main(String[] args) {
		PartitionLinkedList p = new PartitionLinkedList();
		//1->4->3->2->5->2
		//x=3
		ListNode a = new ListNode(6);
		ListNode b = new ListNode(4);
		a.next=b;
		ListNode c = new ListNode(3);
		b.next=c;
		ListNode d = new ListNode(2);
		c.next=d;
		ListNode e = new ListNode(5);
		d.next=e;
		ListNode f = new ListNode(2);
		e.next=f;
		System.out.println(p.partition(a, 1));
	}

	public ListNode partition(ListNode A, int B) {
		ListNode curr = A;
		ListNode head = curr;
		ListNode nodeTwo = null;
		ListNode prev = null;
		ListNode nodeTwoHead=null;
		while(curr!=null){
			if (curr.val>=B) {
				if (prev!=null) {
					prev.next=curr.next;	
				} else {
					head = curr.next;
				}
				if (nodeTwo==null) {
					nodeTwo = new ListNode(curr.val);
					nodeTwoHead=nodeTwo;
				}else {
					nodeTwo.next = new ListNode(curr.val);
					nodeTwo = nodeTwo.next;
				}
			} else {
				prev=curr;	
			}
			
			curr=curr.next;
		}
		if (nodeTwoHead!=null) {
			if (prev==null) {
				return nodeTwoHead;
			}
			prev.next=nodeTwoHead;
		}
		return head;
	}


}
