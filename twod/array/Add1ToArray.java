package learn.twod.array;

import java.util.ArrayList;

public class Add1ToArray {
	// I - 0,0,9,9,9 :: O - 1,0,0,0
	// I - 9,9,9 :: O - 1,0,0,0
	// I - 1,2,3,0 :: O - 1,2,3,1
	// I - 4,5,6 :: O - 4,5,7
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
/*		A.add(0);
		A.add(0);
		A.add(9);
		A.add(9);
		A.add(9);*/

/*		A.add(9);
		A.add(9);
		A.add(9);*/

/*		A.add(1);
		A.add(2);
		A.add(3);
		A.add(0);*/		
/*		A.add(0);*/
		
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		incrementBy1(A);
		for (Integer integer : A) {
			System.out.print(integer);
		}
	}
	// we have to remove trailing zeros
	// we need to consider case when the number of digits increases - when number of digit increases the first digit will always be 1 in the list.
	private static void incrementBy1(ArrayList<Integer> A) {

		int carry=1;
		int n = A.size();
		A.set(n-1, A.get(n-1)+carry);
		if(A.get(n-1)%10==0){
			A.set(n-1, 0);
		} else {
			carry=0;
		}
		for (int i = n-2; i >=0 ; i--) {
			A.set(i, A.get(i)+carry);
			if(A.get(i)%10==0){
				A.set(i, 0);
			} else {
				carry=0;
			}
		}
		if (carry==1) {
			A.add(0, carry);
		}
		while(A.get(0)==0) {
			A.remove(0);
		}
	}
}
