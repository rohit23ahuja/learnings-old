package problems.linked.list;

public class KReverseLinkedList {

	public static void main(String[] args) {
		KReverseLinkedList k = new KReverseLinkedList();
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		A.next = B;
		ListNode c = new ListNode(3);
		B.next = c;
		ListNode d = new ListNode(4);
		c.next = d;
		ListNode e = new ListNode(5);
		d.next = e;
		ListNode f = new ListNode(6);
		e.next = f;
		/*
		 * ListNode A = new ListNode(6); ListNode B = new ListNode(10);
		 * A.next=B; ListNode c = new ListNode(0); B.next=c; ListNode d = new
		 * ListNode(3); c.next=d; ListNode e = new ListNode(4); d.next=e;
		 * ListNode f = new ListNode(8); e.next=f;
		 */
		ListNode result = k.reverseList(A, 3);

		while (result != null) {
			System.out.print(result.val + "-> ");
			result = result.next;
		}
	}

	public ListNode reverseList(ListNode A, int B) {
        ListNode curr = A;
        ListNode next = null;
        ListNode prev = null;
        int count = B;
        while(count-->0&&curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if (curr!=null) {
            A.next = reverseList(next, B);
        }
        return prev;
	}

}
