package problems.string;

public class LongestPalindrome {
	public static void main(String[] args) {
		//String A = "hcdchxxxxxabcdfdcba";
		String A = "abbcccbbbcaaccbababcbcabca";
		//String A = "abb";
		
		LongestPalindrome l = new LongestPalindrome();
		System.out.println(l.longestPalindrome(A));
	}
	public String longestPalindromeInSubString(String A) {
		int length = A.length();
		if(null==A||length<=1) return A;
		if(length==2) {
			if(A.charAt(0)==A.charAt(1)) return A;
			else return A.substring(0, 1);
		}
		char[] arr = A.toCharArray();
		int mid =length/2;
		int i=0;
		int j=length-1;
		while(i!=j&&i<mid&&j>=(length%2==0?mid:mid+1)){
			if(arr[i]!=arr[j]){
				return A.substring(0, 1);
			}
			i++;
			j--;
		}
		return A;
	}

	public String longestPalindrome(String A) {
		String palindrome = null;
		int length = A.length();

		for (int i = 0; i < length; i++) {
			for (int j = length; j >= i; j--) {
				String temp = longestPalindromeInSubString(A.substring(i, j));
				if(palindrome==null || temp.length()>palindrome.length()){
					palindrome=temp;
				}
			}
		}
		return palindrome;
	}

	
}
