package problems.linked.list;

public class PalindromicLinkedList {

	public static void main(String[] args) {
		ListNode a = new ListNode(9);
		ListNode b = new ListNode(2);
		a.next = b;
		ListNode c = new ListNode(3);
		b.next = c;
		ListNode d = new ListNode(6);
		c.next = d;
		ListNode e = new ListNode(3);
		d.next = e;
		ListNode f = new ListNode(2);
		e.next = f;
		ListNode g = new ListNode(9);
		f.next = g;
		
		PalindromicLinkedList p = new PalindromicLinkedList();
		System.out.println(p.palindromicList(a));
	}


	private int palindromicListUsingStack(ListNode head) {
		ListNode current = head;
		int count =0;
		while(current!=null){
			count++;
			current=current.next;
		}
		Stack s = new Stack(count);
		current=head;
		while(current!=null){
			s.push(current.val);
			current=current.next;
		}
		current=head;
		while(current!=null){
			if(current.val!=s.pop()){
				return 0;
			}
			current=current.next;
		}
		return 1;
	}
	
	private int palindromicList(ListNode head) {
		ListNode current = head;
		int count =0;
		while(current!=null){
			count++;
			current=current.next;
		}
		int mid = count/2;
		current=head;
		int i=0;
		ListNode prev = null;
		ListNode next = null;
		while(current!=null){
			if (i<(count%2==0?mid:mid+1)) {
				i++;
				current=current.next;
			} else {
				next = current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
		}
		ListNode firstHalf=head;
		ListNode secondHalf = prev;
		while (firstHalf!=null&&secondHalf!=null) {
			if (firstHalf.val==secondHalf.val) {
				firstHalf=firstHalf.next;
				secondHalf=secondHalf.next;
			} else {
				return 0;
			}
		}
		return 1;
	}

}

class Stack{
	public Integer[] items;
	public int top;
	public int size;
	
	Stack(int s){
		items = new Integer[s];
		size=0;
		top=-1;
	}
	
	public void push(int item){
		top++;
		items[top] = item;
		size++;
	}
	
	public int pop(){
		size--;
		return items[top--];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
}
