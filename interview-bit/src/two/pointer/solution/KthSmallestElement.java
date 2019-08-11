package two.pointer.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElement {
	public static void main(String[] args) {
		Integer[] arr = { 74, 90, 85, 58, 69, 77, 90, 85, 18, 36 };
		List<Integer> A = new ArrayList<>(Arrays.asList(arr));
		int B = 1;
		KthSmallestElement k = new KthSmallestElement();
		System.out.println(k.kthSmallest(A, B));
	}
	
	public int kthSmallest(final List<Integer> A, int B) {
		return kthSmallest(A,0,A.size()-1, B);
	}
	public int kthSmallest(final List<Integer> A, int p, int r, int B) {
		int q = partition(A, p, r);
		if (q-p==B-1) {
			return A.get(q);
		}
		if(q-p>B-1){
			return kthSmallest(A, p, q-1, B);
		} 
		return kthSmallest(A, q+1, r, B-q+p-1);
	}
	
	private int partition(List<Integer> A, int p, int r) {
		int pivot = A.get(r);
		int i=p-1;
		for (int j = p; j < r; j++) {
			if (A.get(j)<=pivot) {
				i++;
				swap(A, i, j);
			}
		}		
		swap(A, i+1, r);
		return i+1;
	}

	private void swap(List<Integer> A, int i, int j) {
		int temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}

}
