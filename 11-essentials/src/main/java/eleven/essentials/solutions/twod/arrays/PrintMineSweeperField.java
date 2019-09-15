package eleven.essentials.solutions.twod.arrays;

public class PrintMineSweeperField {
	public static void main(String[] args) {
		int[] bombs = {0,0,0,1};
		int[][] field = printMinesweeper(bombs, 3, 4);
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				System.out.println(field[i][j]);
			}
		}
	}

	private static int[][] printMinesweeper(int[] bombs, int numRows, int numCols) {
		int[][] field = new int[numRows][numCols];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j]=0;
			}
		}
		
		for (int i = 0; i < bombs.length-1; i+=2) {
			int row = bombs[i];
			int col = bombs[i+1];
			field[row][col]=-1;
			for (int j = row-1; j <= row+1; j++) {
				for (int k = col-1; k <= col+1; k++) {
					if (j>=0 && j <numRows && k>=0 && k <numCols && field[j][k]!=-1) {
						field[j][k]+=1;
					}
				}
			}
		}
		return field;
	}
}
