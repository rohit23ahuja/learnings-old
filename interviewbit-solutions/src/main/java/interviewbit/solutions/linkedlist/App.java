package interviewbit.solutions.linkedlist;

public class App {

	public static void main(String[] args) {
		Node<Integer> n = new Node<Integer>(52);
		Node<Integer> n1 = new Node<>(75);
		n.next = n1;
		Node<Integer> n2 = new Node<>(3);
		n1.next = n2;
		Node<Integer> n3 = new Node<>(23);
		n2.next =n3;
		Node<Integer> n4 = new Node<>(38);
		n3.next=n4;
		App a = new App();
		System.out.println(a.nthElementFromLast(n, 3));
	}

	private Node<Integer> nthElementFromLast(Node<Integer> n, int k) {
		Node<Integer> ref = n;
		Node<Integer> main = n;
		int i =0;
		while(i<k){
			ref = ref.next;
			i++;
		}
		while(ref!=null){
			main=main.next;
			ref=ref.next;
		}
		return main;
	}



}
