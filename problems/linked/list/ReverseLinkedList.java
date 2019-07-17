package problems.linked.list;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		one.next = two;
		ListNode three = new ListNode(3);
		two.next = three;
		ListNode four = new ListNode(4);
		three.next = four;

		ReverseLinkedList r = new ReverseLinkedList();
		ListNode reversedNode = r.reverseLinkedList(one);
		while (reversedNode != null) {
			System.out.print(reversedNode.val+"-->");
			reversedNode = reversedNode.next;
		}
	}

	private ListNode reverseLinkedList(ListNode A) {
		ListNode current = A;
		ListNode prev =null;
		ListNode next=null;
		while(current!=null){
			next = current.next;
			current.next=prev;
			prev = current;
			current=next;
		}
		return prev;
	}
}
