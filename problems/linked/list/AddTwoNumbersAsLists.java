package problems.linked.list;

public class AddTwoNumbersAsLists {

	public static void main(String[] args) {
/*		ListNode a1 = new ListNode(9);
		ListNode a2 = new ListNode(9);
		a1.next=a2;
		ListNode a3 = new ListNode(9);
		a2.next=a3;
		
		ListNode b1 = new ListNode(0);
		ListNode b2 = new ListNode(0);
		b1.next=b2;
		ListNode b3 = new ListNode(1);
		b2.next=b3;*/
		ListNode a1 = new ListNode(0);
		
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(0);
		b1.next=b2;
		ListNode b3 = new ListNode(1);
		b2.next=b3;
		
		AddTwoNumbersAsLists a = new AddTwoNumbersAsLists();
		System.out.println(a.addTwoNumbersBetter(a1, b1));
	}
	
	public ListNode addTwoNumbersBetter(ListNode A, ListNode B) {
		ListNode currA = A;
		ListNode currB = B;

		boolean carry =false;
		ListNode C = null;
		ListNode H = null;
		while(currA!=null||currB!=null){
			int sum = 0;
			if (currA!=null) {
				sum=currA.val;
				currA=currA.next;
			}
			if (currB!=null) {
				sum+=currB.val;
				currB=currB.next;
			}
			if (carry) {
				sum++;
				carry=false;
			}
			if(sum/10!=0){
				carry=true;
			}
			if (C==null) {
				C = new ListNode(sum%10);
				H=C;
			} else {
				C.next=new ListNode(sum%10);
				C=C.next;
			}
		}
        if(carry){
        	C.next = new ListNode(1);
        }
		return H;
	}
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
    	ListNode currA = A;
    	ListNode currB = B;
    	int sum=0;
    	int carry=0;
    	ListNode C = null;
    	ListNode H = null;
    	while(currA!=null&&currB!=null){
    		sum = currA.val+currB.val+carry;
    		carry = 0;
    		if (sum>=10) {
				int val = sum%10;
				carry = sum/10;
				if (C==null) {
					C = new ListNode(val);
					H = C;
				} else {
					C.next = new ListNode(val);
					C = C.next;
				}
			} else {
				if (C==null) {
					C = new ListNode(sum);
					H = C;
				} else {
					C.next = new ListNode(sum);
					C = C.next;
				}
			}
    		currA=currA.next;
    		currB=currB.next;
    	}
    	while(currA!=null){
    		sum = currA.val+carry;
    		carry=0;
    		if (sum>=10) {
				int val = sum%10;
				carry = sum/10;
				if (C==null) {
					C = new ListNode(val);
					H = C;
				} else {
					C.next = new ListNode(val);
					C = C.next;
				}
			} else {
				if (C==null) {
					C = new ListNode(sum);
					H = C;
				} else {
					C.next = new ListNode(sum);
					C = C.next;
				}
			}
       		currA=currA.next;
			
    	}
    	while(currB!=null){
    		sum = currB.val+carry;
    		carry=0;
    		if (sum>=10) {
				int val = sum%10;
				carry = sum/10;
				if (C==null) {
					C = new ListNode(val);
					H = C;
				} else {
					C.next = new ListNode(val);
					C = C.next;
				}
			} else {
				if (C==null) {
					C = new ListNode(sum);
					H = C;
				} else {
					C.next = new ListNode(sum);
					C = C.next;
				}
			}
       		currB=currB.next;
    	}
        if(carry!=0){
        	C.next = new ListNode(carry);
        }
        return H;    	
    }



}
