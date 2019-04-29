package problems.linked.list;

public class MergeSortedLinkedList {

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
		
		MergeSortedLinkedList m =new MergeSortedLinkedList();
		System.out.println(m.sortedMerge(i1,j1));
	}

	private Node<Integer> sortedMerge(Node<Integer> i, Node<Integer> j) {
		Node<Integer> result = null;
		if (i==null) {
			return j;
		} else if(j==null){
			return i;
		}
		
		if (i.data<=j.data) {
			result =i;
			result.next = sortedMerge(i.next, j);
		} else {
			result=j;
			result.next=sortedMerge(i, j.next);
		}
		return result;
	}

}
