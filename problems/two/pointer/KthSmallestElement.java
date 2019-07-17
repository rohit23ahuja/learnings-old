package problems.two.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class KthSmallestElement {
	public static void main(String[] args) {
		//Integer[] arr = {2, 1, 4, 3, 2};
		Integer[] arr = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr));
		KthSmallestElement k = new KthSmallestElement();
		String s = "x";
		System.out.println(k.kthsmallest(A, 9));
	}
    public int kthsmallest(final ArrayList<Integer> A, int B) {
    	ArrayList<Integer> C = new ArrayList<>(A.size());
    	for (Integer integer : A) {
    			C.add(integer);
    			shiftUp(C);				
		}
    	int item = 0;
    	for (int i = 0; i < B; i++) {
            if (C.size() == 0) {
                throw new NoSuchElementException();
            }
            if (C.size() == 1) {
                return C.remove(0);
            }
    		item = C.get(0);
    		C.set(0, C.remove(C.size() - 1));
    		shiftDown(C);
		}
    	return item;
    }
	private <T extends Comparable<T>> void shiftUp(ArrayList<T> C) {
			int k = C.size() - 1;
			while (k > 0) {
				T item = C.get(k);
				int p = (k - 1) / 2;
				T parent = C.get(p);
				if (item.compareTo(parent) < 0) {
					C.set(p, item);
					C.set(k, parent);
					// moved one level up, so it can compared further up. unless it reaches it correct place in heap
					k = p;
				} else {
					break;
				}
			}
	}
	
	private <T extends Comparable<T>> void shiftDown(ArrayList<T> C) {
		int k = 0;
		int l = 2 * k + 1;
		while (l < C.size()) {
			T item = C.get(k);
			int min = l;
			int r = l + 1;
			if (r < C.size() && C.get(r).compareTo(C.get(l)) < 0) {
				min = r;
			} 
			if (C.get(min).compareTo(item)<0) {
				C.set(k, C.get(min));
				C.set(min, item);
				k=min;
				l=2*k+1;
			} else {
				break;
			}
		}
	}
}

