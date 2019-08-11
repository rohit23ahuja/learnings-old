package math.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		Integer[] A = { 3, 30, 34, 5, 9 };
		List<Integer> B = Arrays.asList(A);
		LargestNumber ln = new LargestNumber();
		System.out.println(ln.significantNumber(3, 30));
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i < B.size(); i++) {
			Integer num = B.get(i);
			if(output.isEmpty()) {
				output.add(num);
				continue;
			}
			for (int j = 0; j < output.size()-1; j++) {
				// num is more significant than output.get(j) --> temp = output.get(j); output.set(j, num); num = temp; 
			}
		}

	}

	private Integer significantNumber(Integer a, Integer b) {
		ArrayList<Integer> aList = asList(a);
		ArrayList<Integer> bList = asList(b);
		int i = 0;
		int j = 0;
		while (i < aList.size() && j < bList.size()) {
			if (aList.get(i) == bList.get(j)) {
				i++;
				j++;
			}
			if (aList.get(i) > bList.get(j)) {
				return a;
			}
			if (bList.get(j) > aList.get(i)) {
				return b;
			}
		}
		return null;
	}

	private ArrayList<Integer> asList(Integer i) {
		ArrayList<Integer> asList = new ArrayList<>();
		Integer temp = i;
		while (temp != 0) {
			asList.add(temp % 10);
			temp = temp / 10;
		}
		return asList;
	}

	private static void largerNumberOldApproach(Integer[] A) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>(10);
		for (int i = 0; i <= 10; i++) {
			output.add(new ArrayList<Integer>());
		}
		List<Integer> B = Arrays.asList(A);
		for (int i = 0; i < B.size(); i++) {
			Integer num = B.get(i);
			Integer rowIndex = calculateRowIndex(num);
			insertElement(output, rowIndex, num);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = output.size() - 1; i >= 0; i--) {
			ArrayList<Integer> row = output.get(i);
			for (int j = 0; j < row.size(); j++) {
				if (row.get(j) != null) {
					sb.append(row.get(j));
				}
			}
		}
		System.out.println(sb.toString());
	}

	private static void insertElement(ArrayList<ArrayList<Integer>> output, Integer rowIndex, Integer num) {
		ArrayList<Integer> row = output.get(rowIndex);
		row.add(num);
		Collections.sort(row);
		Collections.reverse(row);
		output.set(rowIndex, row);
	}

	public static Integer calculateRowIndex(Integer num) {
		Integer rowIndex = Integer.MIN_VALUE;
		if (num > 10) {
			Integer temp = num / 10;
			while (temp > 10) {
				temp = temp / 10;
			}
			rowIndex = temp;
		} else {
			rowIndex = num % 10;
		}
		return rowIndex;
	}

}