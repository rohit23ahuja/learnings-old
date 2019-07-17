package problems.two.pointer;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {

	public static void main(String[] args) {
		ThreeSum t = new ThreeSum();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(-4);
		A.add(8);
		A.add(1);
		A.add(2);
		int B = 3;

		// 4, 5
		System.out.println(t.threeSumClosest(A, B));
		
		
	}

	
	
	
	
	
	
	public int threeSumClosest(ArrayList<Integer> A, int B) {
	    int low, high, mid;
	    Collections.sort(A);
	    int n = A.size();
	    int res = A.get(0) + A.get(1) + A.get(2);
	    if (n == 3) {
	        return res;
	    }
	    int sum;
	    for (low = 0; low < n - 2; low++) {
	        mid = low + 1;
	        high = n - 1;
	        int num = B - A.get(low);
	        while (mid < high) {
	            sum = A.get(mid) + A.get(high);
	            // num is the difference of target num and current iteration number
	            if (sum == num)
	                return B;
	            else if (sum < num) {
	                mid++;
	            } else {
	                high--;
	            }
	            int diff = Math.abs(sum - num);
	            int otherDiff = Math.abs(res - B);
	            if (diff < otherDiff)
	                res = sum + A.get(low);
	        }
	    }
	    return res;
	}
	
	
	
	
	
	public int threeSumClosestFailed(ArrayList<Integer> A, int B) {
		int length = A.size();
		int i = 0;
		ArrayList<Integer> sumList = new ArrayList<>(3);
		int sum = 0;
		while (i < length) {
			int num = A.get(i);
			if (sumList.size() < 3) {
				sum += num;
				sumList.add(num);
			} else {
				int diff = Math.abs(B - sum);
				int one = sumList.get(0);
				int two = sumList.get(1);
				int three = sumList.get(2);
				int tempSum = Math.abs(one + two + num);
				int tempDiff = Math.abs(B - tempSum);
				if (tempDiff < diff) {
					sum = tempSum;
					sumList.set(2, num);
				}
				tempSum = Math.abs(one + num + three);
				tempDiff = Math.abs(B - tempSum);
				if (tempDiff < diff) {
					sum = tempSum;
					sumList.set(1, num);
				}
				tempSum = Math.abs(num + two + three);
				tempDiff = Math.abs(B - tempSum);
				if (tempDiff < diff) {
					sum = tempSum;
					sumList.set(0, num);
				}
			}
			i++;
		}
		return sum;
	}
}
