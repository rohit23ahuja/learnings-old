package math.solution;

import java.util.Arrays;
import java.util.List;

public class RotatedArraySearch {
	public static void main(String[] args) {
		Integer[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		RotatedArraySearch r = new RotatedArraySearch();
		System.out.println(r.search(Arrays.asList(arr), 0));
	}
	
    public int search(final List<Integer> A, int num) {
    	int min =findMinimum(A);
    	int idx =-1;
    	idx =search(A, 0, min-1, num);
    	if (idx==-1) {
    		idx = search(A, min, A.size()-1, num);	
		}
    	return idx;
    }

	private int search(List<Integer> A, int lowerBound, int upperBound, int num) {
		if(lowerBound<0) return -1;
		int idx =-1;
		while(lowerBound<=upperBound){
			int mid = (lowerBound+upperBound+1)/2;
			if(A.get(mid)>num) {
				upperBound = mid-1;
			} else if (A.get(mid)<num){
				lowerBound=mid+1;
			} else {
				idx = mid;
				break;
			}
		}
		return idx;
	}

	private int findMinimum(List<Integer> A) {
		int n = A.size();
		int low = 0;
		int high = n-1;
		while(low<=high){
			if(A.get(low)<=A.get(high)) return low;
			int mid = (low+high+1)/2;
			int next = (mid+1)%n;
			int prev = (mid-1+n)%n;
			if(A.get(mid)<=A.get(next) && A.get(mid)<=A.get(prev)) return mid;
			else if(A.get(mid)<=A.get(high)) high = mid-1;
			else if(A.get(mid)>=A.get(low)) low=mid+1;
		}
		return -1;
	}
}
