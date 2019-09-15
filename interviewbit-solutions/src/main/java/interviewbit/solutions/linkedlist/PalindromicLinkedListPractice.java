package interviewbit.solutions.linkedlist;

public class PalindromicLinkedListPractice {
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		a.next=b;
		Node c = new Node(3);
		b.next=c;
		//Node d = new Node(5);
		//c.next=d;
		Node e = new Node(4);
		c.next=e;
		Node f = new Node(2);
		e.next=f;
		Node g = new Node(1);
		f.next=g;
		
		System.out.println(palindromicLinkedList(a));
	}

	private static boolean palindromicLinkedList(Node a) {
		Node curr = a;
		int len =0;
		while(curr!=null){
			curr=curr.next;
			len++;
		}
		curr = a;
		int mid = len%2==0?len/2:len/2+1;
		int i =0;
		Node next=null;
		Node prev = null;		
		while(curr!=null){
			if (i<mid) {
				curr=curr.next;
				i++;
			} else {
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
		}
		curr =a;
		while(prev!=null){
			if (prev.data==curr.data) {
				prev=prev.next;
				curr=curr.next;
			} else {
				return false;
			}
		}
		return true;
	}
}
