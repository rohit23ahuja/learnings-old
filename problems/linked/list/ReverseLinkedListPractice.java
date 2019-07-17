package problems.linked.list;

public class ReverseLinkedListPractice {
	public static void main(String[] args) {
		Node on = new Node(1);
		Node tw = new Node(2);
		on.next = tw;
		Node th = new Node(3);
		tw.next = th;
		Node fo = new Node(4);
		th.next = fo;
		Node fi = new Node(5);
		fo.next = fi;
		Node current = on;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("++++++++++++++++++");
		current = reverseLinkedList(on);
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private static Node reverseLinkedList(Node on) {
		Node curr = on;
		Node prev =null;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}

}
