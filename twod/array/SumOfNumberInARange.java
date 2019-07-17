package learn.twod.array;

public class SumOfNumberInARange {
	public static void main(String[] args) {
		Integer min = 10;
		Integer max = 15;
		// (max - min +1)/2 * (min + max)
		Integer sum = (15-10+1)/2*(10+15);
		System.out.println(sum);
	}
}
