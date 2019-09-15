package interviewbit.solutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumberNewApproach {

	public static void main(String[] args) {
		// 9, 5, 34, 3, 30
		Integer[] A = {9,5,3,30,34};
		List<Integer> B = Arrays.asList(A);
		LargestNumberNewApproach ln = new LargestNumberNewApproach();
		
	}
	
	public int compare(Integer num1, Integer num2) {
		ArrayList<Integer> list1 = numToList(num1);
		ArrayList<Integer> list2 = numToList(num2);
		int i =0;
		int j =0;
		while(i<list1.size()&&j<list2.size()) {
			Integer item1 = list1.get(i);
			Integer item2 = list2.get(j);
			if(item1==item2) {
				i++;
				j++;
			}else if(item1>item2){
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}
	
	public ArrayList<Integer> numToList(Integer num) {
		ArrayList<Integer> numList = new ArrayList<>();
		while(num>10){
			numList.add(num%10);
			num=num/10;
		}
		numList.add(num);
		Collections.reverse(numList);
		return numList;
	}

}

class SignificantComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return 0;
	}
	
	public ArrayList<Integer> numToList(Integer num) {
		ArrayList<Integer> numList = new ArrayList<>();
		while(num>10){
			numList.add(num%10);
			num=num/10;
		}
		numList.add(num);
		Collections.reverse(numList);
		return numList;
	}	
}
