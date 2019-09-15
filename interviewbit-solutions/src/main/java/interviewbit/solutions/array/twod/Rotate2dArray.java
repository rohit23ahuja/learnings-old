package interviewbit.solutions.array.twod;

public class Rotate2dArray {
	public static void main(String[] args) {
		int[][] input = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15}};
		int[][] output = new int[input[0].length][input.length];
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				output[j][input.length-1-i] = input[i][j];
			}
		}
		
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}
}
