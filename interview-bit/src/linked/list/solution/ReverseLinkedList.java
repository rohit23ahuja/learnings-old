package linked.list.solution;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node<Integer> one = new Node<>(1);
		Node<Integer> two = new Node<>(2);
		one.next=two;
		Node<Integer> three = new Node<>(3);
		two.next=three;
		Node<Integer> four = new Node<>(4);
		three.next=four;
		ReverseLinkedList r = new ReverseLinkedList();
		Node<Integer> reversed = r.reverseLinkedList(one);
	}

	private Node<Integer> reverseLinkedList(Node<Integer> one) {
		Node<Integer> current = one;
		int count = 0;
		while(current.next!=null){
			count++;
			current=current.next;
		}
		int i =0;
		Node<Integer>head=null;
		current=one;
		while(i<count){
			Node<Integer> temp = current.next;
			current.next=temp.next;
			temp.next=current;
			if (head==null) {
				head=temp;
			}
			i++;
		}
		while(current!=null){
			System.out.print(current.data+"->");
		}
		return null;
	}

}

class Node<T>{
	public T data;
	public Node<T> next;
	
	public Node(T d){
		data=d;
		next=null;
	}
}
