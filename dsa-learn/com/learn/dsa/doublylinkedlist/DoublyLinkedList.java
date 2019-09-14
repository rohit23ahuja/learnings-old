package com.learn.dsa.doublylinkedlist;

/**
 * in doubly linked list we have two fields first and last
 * 
 * @author deepikaahuja
 *
 */
public class DoublyLinkedList {
	private Node first;
	private Node last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	// 1. create new node and set data
	// 2. if list is empty set last == newNode
	// 3. else first.setprevious(newNode)
	// 4. newNode.setNext first
	// 5. first = newNode
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			last = newNode;
		} else {
			first.setPrevious(newNode);
		}
		newNode.setNext(first);
		first = newNode;
	}

	// 1. create new node and set data
	// 2. if list is empty set first == newNode
	// 3. else last.setNext(newNode)
	// 4. newNode.setPrevious == last
	// 5. last = newNode
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			first = newNode;
		} else {
			last.setNext(newNode);
		}
		newNode.setPrevious(last);
		last = newNode;
	}

	// assume non empty list
	// 1. temp = first;
	// 2. if first.getnext==null. last == null
	// 3. else first.getnext.setprevious == null
	// 4. first = first.getnext
	// 5. return temp
	public Node deleteFirst() {
		Node temp = first;
		if (first.getNext() == null) {
			last = null;
		} else {
			first.getNext().setPrevious(null);
		}
		first = first.getNext();
		return temp;
	}

	// assume non empty list
	// 1. temp = last;
	// 2. if first.getNext(). first == null
	// 3. else last.getprevious.setnext == null
	// 4. last = last.getprevious
	// 5. return temp
	public Node deleteLast() {
		Node temp = last;
		if (first.getNext() == null) {
			first = null;
		} else {
			last.getPrevious().setNext(null);
		}
		last = last.getPrevious();
		return temp;
	}

	// 1. store first in current variable as we have to perform searching
	// 2. set current == current.getNext until data key is matched.
	// 3. if current becomes null then key is not found and insertion has failed
	// 4. if searching has not failed, create new node and set data in it.
	// 5. if current is last. then for now current.setNext(null). Although later
	// we set current.setNext(newNode). Also last=newNode
	// 6. Else it means this new node is getting inserted in between elements.
	// then we need to set the previous field of the next element from current
	// node as the new node which we are inserting.Also we need set the next
	// field of the new node as the next field of the current node.
	// 7. set newNode.setPrevious(current)
	// 8. Set current.setNext(newNode)
	// 9. return true in the end

	public boolean insertAfter(int key, int data) {
		Node current = first;
		while (current.getData() != key) {
			current = current.getNext();
			if (current == null) {
				return false;
			}
		}
		Node newNode = new Node();
		newNode.setData(data);
		if (current == last) {
			current.setNext(null);
			last = newNode;
		} else {
			current.getNext().setPrevious(newNode);
			newNode.setNext(current.getNext());
		}
		// irresepetive of new element getting inserted anywhere in list we do
		// reference update in current and newnode. that's why these two lines
		// are outside of if-else
		newNode.setPrevious(current);
		current.setNext(newNode);
		return true;
	}

	// assume non-empty list
	public Node deleteKey(int key) {
		Node current = first;
		while (current.getData() != key) {
			current = current.getNext();
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.getNext();
		} else {
			current.getPrevious().setNext(current.getNext());
		}

		if (current == last) {
			last = current.getPrevious();
		} else {
			current.getNext().setPrevious(current.getPrevious());
		}
		return current;
	}

	public void displayForward() {
		System.out.println("List (First-->Last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.getNext();
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.println("Last (Last-->First");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.getPrevious();
		}
		System.out.println();
	}

	public int getSize() {
		Node current = first;
		int length = 0;
		while (current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}

	/**
	 * to find the middle of the list maintain two pointers - fast and slow
	 * pointer. fast pointer should be incremented by two and slow pointer
	 * should be incremented by 1. Until fast pointer is not null and its next is also not null
	 * 
	 * @return
	 */
	public int getMiddle() {
		Node fastptr = first;
		Node slowptr = first;
		if (first != null) {
			while (fastptr != null && fastptr.getNext() != null) {
				fastptr = fastptr.getNext().getNext();
				slowptr = slowptr.getNext();
			}
		}

		return slowptr.getData();
	}

}
