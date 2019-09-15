package interviewbit.solutions.string;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "acabaaa";
		StringPalindrome sp = new StringPalindrome();
		System.out.println(sp.checkPalindrome(s));
	}

	private boolean checkPalindrome(String s) {
		int length = s.length();
		int mid = length/2;
		int low = mid-1;
		int high = length%2==0?mid:mid+1;
		while(low>=0&&high<length){
			if (s.charAt(low)==s.charAt(high)) {
				low--;
				high++;				
			} else {
				return false;		
			}

		}
		return true;
	}
}
