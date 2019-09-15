package interviewbit.solutions.array.twod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumberNewApproach {

	public static void main(String[] args) {
		Integer[] arr = {30, 3, 5, 9, 34};
		List<Integer> A = Arrays.asList(arr);
		LargestNumberNewApproach ln = new LargestNumberNewApproach();
		System.out.println(ln.largestNumber(A));
	}

	public String largestNumber(final List<Integer> A) {
		List<Integer> output = new ArrayList<>(A);
		Collections.sort(output, new SignificantComparator());
		StringBuilder sb = new StringBuilder();
		for (int i = output.size() - 1; i >= 0; i--) {
			if (output.get(i)>0) {
				sb.append(output.get(i));	
			}
		}
		if(sb.length()<1) sb.append(0);
		return sb.toString();
	}

}

class SignificantComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		ArrayList<Integer> list1 = numToList(num1);
		ArrayList<Integer> list2 = numToList(num2);
		int i = 0;
		int j = 0;
		Integer item1 = null;
		Integer item2 = null;
		while (i < list1.size() || j < list2.size()) {
			if (i < list1.size()) {
				item1 = list1.get(i);
			} 
			if (j < list2.size()) {
				item2 = list2.get(j);
			} 
			if (item1 == item2) {
				i++;
				j++;
			} else if (item1 > item2) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}

	public ArrayList<Integer> numToList(Integer num) {
		ArrayList<Integer> numList = new ArrayList<>();
		while (num >= 10) {
			numList.add(num % 10);
			num = num / 10;
		}
		numList.add(num);
		Collections.reverse(numList);
		return numList;
	}

}
