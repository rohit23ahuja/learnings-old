package interviewbit.solutions.math;

import java.util.Arrays;
import java.util.List;

public class NobleInteger {

	public static void main(String[] args) {
		//Integer[] A = {14, 8, 10, 4, 12, 2,1,16};
		//Integer[] A = {-4, -2, 0, -1, -6}; 
		Integer[] A = {-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5}; 
		//-10 -10 -10 -10 -10 -10 -10 -9 -9 -9 -9 -9 -9 -9 -9 -9 -8 -8 -8 -8 -8 -8 -8 -8 -8 -7 -7 -7 -7 -7 -7 -7 -7 -6 -6 -6 -6 -6 -6 -6 -6 -6 -6 -6 -5 -5 -5 -5 -5 -5 -5 -5 -4 -4 -4 -4 -4 -4 -4 -4 -4 -4 -4 -4 -3 -3 -3 -3 -3 -3 -3 -3 -3 -3 -3 -3 -2 -2 -2 -2 -2 -2 -2 -2 -2 -2 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 8 8 8 8 8 9 
		NobleInteger n = new NobleInteger();
		System.out.println(n.solve(Arrays.asList(A)));
		
	}

    public int solve(List<Integer> A) {
    	Integer items = A.size()-1;
    	quickSort(A, 0, items);
    	for (int i = 0; i <= items; i++) {
    		//System.out.print(A.get(i)+" ");
    		Integer num = A.get(i);
    		Integer diff = Math.abs(items-i); 
    		if(diff==num) {
    			if (diff==0||(diff>0 && A.get(i+1)!=num)) {
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
		for (int j = p; j < r; j++) {
			if (A.get(j)<=pivot) {
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
