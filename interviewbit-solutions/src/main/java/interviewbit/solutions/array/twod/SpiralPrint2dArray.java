package interviewbit.solutions.array.twod;

public class SpiralPrint2dArray {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, };

		SpiralPrint2dArray s = new SpiralPrint2dArray();
		s.spiralPrintMatrix(arr);
	}

	private void spiralPrintMatrix(int[][] arr) {
		int rowStart = 0;
		int rowLength = arr.length - 1;
		int colStart =0;
		int colLength = arr[0].length-1;
		
		while(rowStart<=rowLength && colStart<=colLength){
			for (int i = rowStart; i <= colLength; i++) {
				System.out.print(arr[rowStart][i]+" ");
			}
			for (int j = rowStart+1; j <=rowLength; j++) {
				System.out.print(arr[j][colLength]+" ");
			}
			
			if (rowStart+1<=rowLength) {
				
			}
		}
	}
}
