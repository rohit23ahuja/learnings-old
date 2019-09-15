package interviewbit.solutions.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

public class MinAbsoluteDiff {

	public static void main(String[] args) {
		Integer[] arr1 = {1, 4, 5, 8, 10};
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr1));
		Integer[] arr2 = {6, 9, 15 };
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(arr2));
		Integer[] arr3 = {2, 3, 6, 6};
		ArrayList<Integer> C = new ArrayList<>(Arrays.asList(arr3));
		MinAbsoluteDiff m = new MinAbsoluteDiff();
		System.out.println(m.solve(A, B, C));
	}
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
    	int i = A.size()-1;
    	int j = B.size()-1;
    	int k = C.size()-1;
    	int minDiff=Integer.MAX_VALUE;
    	while(i!=-1&&j!=-1&&k!=-1){
    		int a = A.get(i);
    		int b = B.get(j);
    		int c = C.get(k);
    		int max = Math.max(a, Math.max(b, c));
    		int min = Math.min(a, Math.min(b, c));
    		int currentDiff = Math.abs(max-min);
    		if(currentDiff<minDiff){
    			minDiff=currentDiff;
    		}
    		if(minDiff==0) break;
    		if (max==a){
    			i--;
    		}
    		if (max==b){
    			j--;
    		}
    		if (max==c){
    			k--;
    		}
    	}
    	return minDiff;
    }
}
