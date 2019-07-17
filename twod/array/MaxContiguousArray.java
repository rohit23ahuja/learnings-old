package learn.twod.array;

import java.util.Arrays;
import java.util.List;

public class MaxContiguousArray {
	public static void main(String[] args) {
		
		Integer[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(Arrays.asList(arr)));
	}
	
    public static int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int seq =0;
        for(int i=0; i<A.size();i++){
        	seq +=A.get(i);
        	if (seq>max) {
				max=seq;
			}
        	if (0>seq) {
				seq=0;
			}
        }
        return max;
    }
}
