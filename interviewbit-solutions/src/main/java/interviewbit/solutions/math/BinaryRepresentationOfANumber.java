package interviewbit.solutions.math;

import java.util.ArrayList;
import java.util.List;

public class BinaryRepresentationOfANumber {

	public static void main(String[] args) {
		//System.out.println(decimalToBinary(125));
		 System.out.println(binaryToDecimal(111));
	}

	private static Integer binaryToDecimal(int i) {
		Integer base =1;
		Integer result = new Integer(0);
		while(i>0) {
			Integer rem = i%10;
			result+=rem*base;
			i=i/10;
			base*=2;
		}
		return result;
	}
	
	
	
	

	private static String decimalToBinary(int i) {
		StringBuilder sb = new StringBuilder();
		// i/2 gives quotient
		// i%2 remainder
		while(i>0){
			sb.append(i%2);
			i=i/2;
		}
	
		return sb.reverse().toString();
	}

}
