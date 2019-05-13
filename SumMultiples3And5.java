package problems.number;

public class SumMultiples3And5 {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9
		// 3 6 9 5
		// given num n, count of multiples in range (start, end)  = (end-start+1)/n
		// sum of n natural numbers = (n*++n)/2
		int numThree = (int) Math.floor((9-1+1)/3);
		int sumThree = 3*(numThree*++numThree)/2;
		int numFive = (int) Math.floor((9-1+1)/5);
		int sumFive = 5*(numFive*++numFive)/2;
		System.out.println(sumThree+sumFive);
	
	}

}
