package interviewbit.solutions.array.twod;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		Integer[] arr = {3,9,6,14,27};
		Integer num = 29;
		List<Integer> list = Arrays.asList(arr);
		binarySearch(num, list);
	}

	private static void binarySearch(Integer num, List<Integer> list) {
		int lowerBound = 0;
		int upperBound = list.size()-1;
		int mid = 0;
		while(lowerBound<=upperBound){
			mid = (upperBound+lowerBound+1)/2;
			if (num>list.get(mid)) {
				lowerBound=mid+1;
			} else if(num<list.get(mid)){
				upperBound = mid-1;
			} else {
				System.out.println("Found");
				System.out.println("mid "+mid);
				break;
			}
		}
		System.out.println("not found");
		System.out.println("mid "+mid);
	}

}
