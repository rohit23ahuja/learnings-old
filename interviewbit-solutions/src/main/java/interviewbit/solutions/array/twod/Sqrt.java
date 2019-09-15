package interviewbit.solutions.array.twod;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt s = new Sqrt();
		System.out.println(s.sqrt(930675566));
	}
	// 207220284
	// expected 30506

	public int sqrt(int a) {
		int middle = a / 2;
		if (a < 1)
			return 0;
		long output = 1;
		long lowerBound = 1;
		long upperBound = middle;
		while (lowerBound <= upperBound) {
			long mid = (upperBound + lowerBound) / 2;
			if (a > mid * mid) {
				output = mid;
				lowerBound = mid + 1l;
			} else if (a < mid * mid) {
				upperBound = mid - 1l;
			} else {
				output = mid;
				break;
			}
		}
		return (int) output;
	}

}
