package interviewbit.solutions.linkedlist;

public class Node<T> {
	T data;
	Node<T> next;

	public Node(T d) {
		data = d;
		next = null;
	}
	
	@Override
	public String toString(){
		return data.toString() +"-> "+next;
	}

}
