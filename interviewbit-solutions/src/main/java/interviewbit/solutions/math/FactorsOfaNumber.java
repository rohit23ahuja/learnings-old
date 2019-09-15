package interviewbit.solutions.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorsOfaNumber {
	public static void main(String[] args) {
	//	List<Integer> result = factorsOfANumber(36);
		/*List<Integer> result = factorsOfANumberUsingSqRoot(36);
		for (Integer integer : result) {
			System.out.print(integer+" ");
		}*/
		//int x = 'A'-'B';
		System.out.println(17/34);
	}

	private static List<Integer> factorsOfANumberUsingSqRoot(int i) {
		List<Integer> result = new ArrayList<>();
		result.add(1);
		result.add(i);
		for (int j = 2; j < (Math.sqrt(i)+1); j++) {
			if (i%j==0) {
				result.add(j); 
				result.add(i/j);
			}
		}
		return result;
	}

	private static List<Integer> factorsOfANumber(int i) {
		List<Integer> result = new ArrayList<>();
		result.add(1);
		result.add(i);
		for (int j = 2; j <= i/2; j++) {
			if(i%j==0){
				result.add(j);
			}
		}
		return result;
	}

}
