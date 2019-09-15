package interviewbit.solutions.math;

import java.util.ArrayList;

public class PrettyPrint {

	public static void main(String[] args) {
		PrettyPrint p = new PrettyPrint();
		ArrayList<ArrayList<Integer>> result = p.prettyPrint(3);
		
	}
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A <= 0) {
            return result;
        }
        

		int size=2*A-1;
		int[][] arr = new int[size][size];
		int rowLength = size-1;
		int colLength = size-1;
		int i=0;
		int j=0;
		while(i<=rowLength&&j<=colLength){
			int rowStart=i;
			int rowEnd=i;
			int colStart=j;
			int colEnd=colLength;
			for (int a = rowStart; a <= rowEnd; a++) {
				for (int b = colStart; b <= colEnd; b++) {
					arr[a][b]=A;
				}
			}
			
			rowStart=i+1;
			rowEnd=rowLength;
			colStart=colLength;
			colEnd=colLength;
			for (int a = rowStart; a <= rowEnd; a++) {
				for (int b = colStart; b <= colEnd; b++) {
					arr[a][b]=A;
				}
			}
			
			rowStart=rowLength;
			rowEnd=rowLength;
			colStart=colLength-1;
			colEnd=j;
			for (int a = rowStart; a <= rowEnd; a++) {
				for (int b = colStart; b >= colEnd; b--) {
					arr[a][b]=A;
				}

			}
			
			rowStart=rowLength-1;
			rowEnd=i;
			colStart=j;
			colEnd=j;
			for (int a = rowStart; a > rowEnd; a--) {
				for (int b = colStart; b >= colEnd; b--) {
					arr[a][b]=A;
				}

			}
			i++;
			j++;
			rowLength--;
			colLength--;
			A--;
		}
		
		
		for (int a = 0; a < arr.length; a++) {
            ArrayList<Integer> list = new ArrayList<>();
			for (int b = 0; b < arr[a].length; b++) {
				list.add(arr[a][b]);
			}
            result.add(list);
		}

        return result;
    }

}
