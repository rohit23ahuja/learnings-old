package eleven.essentials.solutions.twod.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class ExpandInMineSweeper {

	public static void main(String[] args) {
		int[][] field = {{-1,1,0,0},{1,1,0,0},{0,0,1,1},{0,0,1,-1}};
		field = click(field,4,4,1,2);
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] click(int[][] field, int numRows, int numCols, int i, int j) {
		Queue<Point> toCheck = new LinkedList<>();
		if(field[i][j]==0){
			field[i][j]=-2;
			Point p = new Point();
			p.row=i;
			p.col=j;
			toCheck.add(p);
		} else {
			return field;
		}
		while (!toCheck.isEmpty()) {
			Point p = toCheck.poll();
			int row = p.row;
			int col = p.col;
			for (int k = row-1; k <= row+1; k++) {
				for (int l = col-1; l <= col+1; l++) {
					if (k>=0 && k<numRows && l>=0 && l < numCols && field[k][l]==0) {
						field[k][l]=-2;
						Point p1 = new Point();
						p1.row=k;
						p1.col=l;
						toCheck.add(p1);
					}
				}
			}
		}
		return field;
	}

}

class Point {
	int row;
	int col;
}
