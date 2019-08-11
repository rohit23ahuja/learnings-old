package two.pointer.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxContinuos1 {

	public static void main(String[] args) {
		//Integer[] arr = new Integer[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		Integer[] arr = new Integer[]{0, 1, 1, 1};
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr));
		MaxContinuos1 m = new MaxContinuos1();
		System.out.println(m.maxone(A, 0));
	}

    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
    	int wR=0;
		int wL=0;
		int bestL=0;
		int bestWindow=0;
		int length = A.size();
		int zeroCount = 0;
		while(wR<length){
			if(zeroCount<=B){
				if (A.get(wR)==0) {
					zeroCount++;
				}
				wR++;
			}
			if(zeroCount>B){
				if (A.get(wL)==0) {
					zeroCount--;
				}
				wL++;
			}
			if((wR-wL>bestWindow)&&zeroCount<=B){
				bestWindow = wR-wL;
				bestL=wL;
			}
		}
		ArrayList<Integer> out = new ArrayList<>();
		for (int i = 0; i < bestWindow; i++) {
				out.add(bestL+i);
		}
    	return out;
    }
}
