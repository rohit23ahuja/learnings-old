package interviewbit.solutions.array.twod;

import java.util.Arrays;
import java.util.List;

// a1 >= a2 <= a3 >= a4 <= a5.....
//10 > 5 < 6 > 2 < 20 > 2 < 100 > 80
//3  > 2 < 6 > 5 < 20 > 10 < 100 > 80....120
public class WaveArray {
	public static void main(String[] args) {
		Integer[] A = {10, 5, 6, 3, 2, 20, 100, 80};
		WaveArray w = new WaveArray();
		//System.out.println(w.waveArray(Arrays.asList(A)));
		System.out.println(w.waveArrayLexico(Arrays.asList(A)));
	}

	private List<Integer> waveArrayLexico(List<Integer> A) {
		quickSort(A, 0, A.size()-1);
		for (int i = 0; i < A.size()-1; i=i+2) {
			swap(A, i, i+1);
		}
		return A;
	}

	private void quickSort(List<Integer> A, int p, int r) {
		if(p<r){
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}

	private int partition(List<Integer> A, int p, int r) {
		int pivotValue = A.get(r);
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (A.get(j)<=pivotValue) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i+1, r);
		return i+1;
	}

	private List<Integer> waveArray(List<Integer> A) {
		for (int i = 0; i < A.size()-1; i++) {
			if (i%2==0) {
				// for even index A[i] > A[i+1]
				if (!(A.get(i)>=A.get(i+1))) {
					swap(A, i, i+1);
				}
			} else {
				// for odd index A[i] < A[i+]
				if (!(A.get(i)<=A.get(i+1))) {
					swap(A, i, i+1);
				}
			}
		}
		return A;		
	}
	
	private void swap(List<Integer> A, int i, int j) {
		Integer temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}
}
 
