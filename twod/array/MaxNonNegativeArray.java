package learn.twod.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeArray {
	public static void main(String[] args) {
		//Integer[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		//Integer[] arr = { 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421 };
		//Integer[] arr = { 756898537, -1973594324, -2038664370, -184803526, 1424268980 };
		//Integer[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		//Integer[] arr = { -1, -1, -1, -1, -1  };
		Integer[] arr = { 0, 0, -1, 0  };
		 
		System.out.println(maxset(Arrays.asList(arr)));
	}

	public static ArrayList<Integer> maxset(List<Integer> A) {
		ArrayList<Integer> maxSubSeq = new ArrayList<>();
		ArrayList<Integer> subSeq = new ArrayList<>();
		Long subSeqSum =0l;
		Long maxSum =0l;
		for (int i = 0; i < A.size(); i++) {
			Integer num = A.get(i);
			if (num>=0) {
				subSeqSum+=num;
				subSeq.add(num);
			} else {
				subSeqSum=0l;
				subSeq = new ArrayList<>();
			}
			if((maxSum<subSeqSum) || (maxSum==subSeqSum && subSeq.size() > maxSubSeq.size())) {
				maxSum = subSeqSum;
				maxSubSeq = subSeq;
			}
		}
		return maxSubSeq;
	}
}
