package interviewbit.solutions.math;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		PrimeNumberOrNot p = new PrimeNumberOrNot();
		System.out.println(p.isPrime(1));
		System.out.println(p.isPrime(2));
		System.out.println(p.isPrime(5));
		System.out.println(p.isPrime(6));
	}

	public int isPrime(int A) {
		if(A==1) return 0;
		int upperLimit = (int) (Math.sqrt(A));
		for (int i = 2; i <= upperLimit; i++) {
			if (i < A && A % i == 0)
				return 0;
		}
		return 1;
	}
}
