package interviewbit.solutions.math;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGcd(34,17));
		//System.out.println(i);
	}

	private static int findGcd(int a, int b) {
		if(a==0) return b;
		return findGcd(b%a,b);
	}

}
