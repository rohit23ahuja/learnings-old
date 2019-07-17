package learn.twod.array;

import java.util.List;
import java.util.Stack;

public class MaxPProd {

	public static void main(String[] args) {
		Integer[] arr = { 984652, 28, 32, 4, 874213, 2, 3, 5, 998741 };
		MaxPProd p = new MaxPProd();
		// System.out.println(p.maxSpecialProduct(Arrays.asList(arr)));

	}
	
	public int maxSpecialProductStack(List<Integer> A) {
		Stack<Integer> s = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		for (int i = 0; i < A.size(); i++) {
			Integer num = A.get(i);
			if (s.isEmpty()) {
				s.push(num);
				continue;
			}

		}
		return 0;
	}

	public int maxSpecialProduct(List<Integer> A) {
		long max = -1;
		for (int i = 0; i < A.size(); i++) {
			int lsv = 0;
			int j = i;
			while (j - 1 < i && j >= 0) {
				if (A.get(j) > A.get(i)) {
					lsv = j;
					break;
				}
				j--;
			}

			int rsv = 0;
			int k = i + 1;
			while (k > i && k < A.size()) {
				if (A.get(k) > A.get(i)) {
					rsv = k;
					break;
				}
				k++;
			}
			long prod = 1l * lsv * rsv;
			if (prod < 0) {
				prod = 0;
			}
			if (max < prod) {
				max = prod;
			}

		}
		return (int) (max % 1000000007);
	}
}
