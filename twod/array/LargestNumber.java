package learn.twod.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		Integer[] A = { 3, 30, 34, 5, 9, 10 };
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

		for (int i = 0; i < output.size(); i++) {
			ArrayList<Integer> row = output.get(i);
			for (int j = 0; j < row.size(); j++) {
				System.out.print(row.get(j) + " ");
			}
			System.out.println();
		}

	}

	private static void insertElement(ArrayList<ArrayList<Integer>> output, Integer rowIndex, Integer num) {
		ArrayList<Integer> row = output.get(rowIndex);
		if (row.size() < 1) {
			row.add(num);
		} else {
			if (row.get(0)>=num) {
				row.add(num);
				return;
			}
			

		}
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
