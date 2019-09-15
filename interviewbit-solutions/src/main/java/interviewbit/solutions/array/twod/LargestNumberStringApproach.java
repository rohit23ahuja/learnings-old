package interviewbit.solutions.array.twod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumberStringApproach {
	public static void main(String[] args) {
		Integer[] arr = {782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905};
		List<Integer> A = Arrays.asList(arr);
		LargestNumberStringApproach ln = new LargestNumberStringApproach();
		System.out.println(ln.largestNumber(A));
	}

	public String largestNumber(final List<Integer> A) {
		List<Integer> output = new ArrayList<>(A);
		Collections.sort(output, new SignificantComparator1());
		StringBuilder sb = new StringBuilder();
		for (int i = output.size() - 1; i >= 0; i--) {
			if (output.get(i) > 0) {
				sb.append(output.get(i));
			}
		}
		if (sb.length() < 1)
			sb.append(0);
		return sb.toString();
	}
}

class SignificantComparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		String s1 = num1.toString() + num2;
		Long c1 = Long.parseLong(s1);
		String s2 = num2.toString() + num1;
		Long c2 = Long.parseLong(s2);
		if (c1 == c2) {
			return 0;
		} else if (c1 < c2) {
			return -1;
		}
		return 1;
	}

}
