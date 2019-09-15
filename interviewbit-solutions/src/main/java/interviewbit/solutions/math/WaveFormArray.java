package interviewbit.solutions.math;

import java.util.Arrays;
import java.util.List;

public class WaveFormArray {

	public static void main(String[] args) {
		Integer[] A = {5, 1, 3, 4, 2};
		System.out.println(wave(Arrays.asList(A)));
		
	}
    public static List<Integer> wave(List<Integer> A) {
    	quickSort(A, 0, A.size()-1);
    	for (int i = 0; i <= A.size()-2; i=i+2) {
			swap(A, i,i+1);
		}
    	return A;
    }
	private static void quickSort(List<Integer> A, int p, int r) {
		if (p<r) {
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	private static int partition(List<Integer> A, int p, int r) {
		int pivotValue = A.get(r);
		int i =p-1;
		for (int j = p; j < r ; j++) {
			if (A.get(j)<pivotValue) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i+1, r);
		return i+1;
	}

	private static void swap(List<Integer> A, int i, int j) {
		Integer temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}
}
