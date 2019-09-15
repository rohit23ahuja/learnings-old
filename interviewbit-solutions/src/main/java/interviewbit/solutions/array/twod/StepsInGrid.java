package interviewbit.solutions.array.twod;

import java.util.ArrayList;
import java.util.List;

public class StepsInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(1);
		A.add(2);
		
		List<Integer> B = new ArrayList<>();
		B.add(0);
		B.add(1);
		B.add(2);
		B.add(2);
		System.out.println(coverPoints(A, B));
	}

	private static int coverPoints(List<Integer> A, List<Integer> B) {
		int n = A.size();
		int i = n-1;
		int steps = 0;
		while(i>=1){
			int x = A.get(i);
			int y = B.get(i);
			int xNext = A.get(i-1);
			int yNext = B.get(i-1);
			int horizontalDistance = Math.abs(xNext-x);
			int verticalDistance = Math.abs(yNext-y);
			steps += Math.max(horizontalDistance, verticalDistance);
			i--;
		}
		return steps;
	}

}
