package interviewbit.solutions.math;

public class IntegerIsAPalindrome {
public static void main(String[] args) {
//System.out.println(checkIfPalindrome(2147447412));
	System.out.println(1/10);
	System.out.println(1%10);
}

private static int checkIfPalindrome(int i) {
	if(i<0) return 0;
	if(i<10) return 1;
	String s = String.valueOf(i);
	char[] arr = s.toCharArray();
	int j =0;
	int k = arr.length-1;
	while(j<k){
		if(arr[j]==arr[k]) {
			j++;
			k--;
		} else {
			return 0;	
		}
	}
	return 1;
}
}
