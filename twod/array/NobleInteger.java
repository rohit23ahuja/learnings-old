package learn.twod.array;

import java.util.Arrays;
import java.util.List;

public class NobleInteger {

	public static void main(String[] args) {
		Integer[] A = { -6, -1,4 };
		// -3 -2 -1 0 0 0
		NobleInteger n = new NobleInteger();
		System.out.println(n.solve(Arrays.asList(A)));
		
	}
    public int solve(List<Integer> A) {
    	quickSort(A, 0, A.size()-1);
    	for (int i = 0; i < A.size(); i++) {
			Integer num = A.get(i);
			Integer diff = A.size()-1-i;
			if(diff==num){
				if(diff==0 || (A.get(i+1)!=num)) {
					return 1;
				}
			}
		}
    	return -1;
    }
	private void quickSort(List<Integer> A, int p, int r) {
		if (p<r) {
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
		
	}
	private int partition(List<Integer> A, int p, int r) {
		int pivot = A.get(r);
		int i = p-1;
		for(int j=p;j<r;j++){
			if (A.get(j)<=pivot) {
				i++;
				swap(A,i,j);
			}
		}
		swap(A, i+1, r);
		return i+1;
	}
	private void swap(List<Integer> A, int i, int j) {
		Integer temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}
}
