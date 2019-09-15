package interviewbit.solutions.math;

public class PrintAllPrimeNumbersInARange {
	public static void main(String[] args) {
		PrintAllPrimeNumbersInARange p = new PrintAllPrimeNumbersInARange();
		int[] arr = p.printAllPrimeNumbersInAGivenRange(15);

	}

	private int[] printAllPrimeNumbersInAGivenRange(int N) {
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = isPrime(i);
		}
		return arr;
	}
	
	public int isPrime(int A) {
		if(A<2) return 0;
		int upperLimit = (int) (Math.sqrt(A));
		for (int i = 2; i <= upperLimit; i++) {
			if (i < A && A % i == 0)
				return 0;
		}
		return 1;
	}
}
