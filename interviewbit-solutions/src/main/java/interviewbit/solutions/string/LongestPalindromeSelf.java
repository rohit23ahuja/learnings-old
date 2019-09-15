package interviewbit.solutions.string;

public class LongestPalindromeSelf {
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		int length = str.length();
		int low=0, high=0;
		int start=0;
		int maxLength=1;
		for (int i = 1; i < length; i++) {
			//even
			high=i;
			low=i-1;
			while(low>=0&&high<length&&str.charAt(low)==str.charAt(high)) {
				if (high-low+1>maxLength) {
					maxLength = high-low+1;
					start=low;
				}
				--low;
				++high;
			}
			//odd
			high=i+1;
			low=i-1;
			while(low>=0&&high<length&&str.charAt(low)==str.charAt(high)) {
				if (high-low+1>maxLength) {
					maxLength = high-low+1;
					start=low;
				}
				--low;
				++high;
			}
		}
		System.out.println(str.substring(start, start + maxLength));
	}
}
