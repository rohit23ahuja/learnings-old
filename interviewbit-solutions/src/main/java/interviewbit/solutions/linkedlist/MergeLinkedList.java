package interviewbit.solutions.linkedlist;

public class MergeLinkedList {

	public static void main(String[] args) {
		Node<Integer> i1 = new Node<>(1);
		Node<Integer> i2 = new Node<>(3);
		i1.next=i2;
		Node<Integer> i3 = new Node<>(5);
		i2.next=i3;
		
		Node<Integer> j1 = new Node<>(2);
		Node<Integer> j2 = new Node<>(4);
		j1.next=j2;
		Node<Integer> j3 = new Node<>(6);
		j2.next=j3;
		
		Node<Integer> node = new Node<Integer>(0);
		
		Node<Integer> curr = node;
		while(i1!=null||j1!=null){
			if (i1!=null) {
				curr.next=i1;
				i1=i1.next;
				curr=curr.next;
			}
			if (j1!=null) {
				curr.next=j1;
				j1=j1.next;
				curr=curr.next;
			}
		}
		node=node.next;
		System.out.println(node);
	}

}
