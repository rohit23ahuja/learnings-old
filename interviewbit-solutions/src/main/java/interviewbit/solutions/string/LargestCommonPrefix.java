package interviewbit.solutions.string;

import java.util.Arrays;
import java.util.List;

public class LargestCommonPrefix {

	public static void main(String[] args) {
		//String[] arr = {"abcd", "aefghijk", "abcefgh"};
		String[] arr = {"abcd", "abcd", "efgh"};
		LargestCommonPrefix l = new LargestCommonPrefix();
		System.out.println(l.longestCommonPrefix(Arrays.asList(arr)));
	}
	
    public String longestCommonPrefix(List<String> A) {
    	String s ="";
    	if(A==null||A.size()<1) return s;
    	if(A.size()==1) return A.get(0);
    	for (int i = 0; i < A.size(); i++) {
    		if (i==0) {
    			s = longestCommonPrefix(A.get(i), A.get(i+1));	
			} else {
				s =longestCommonPrefix(s, A.get(i));	
			}
			if(s.length()==0){
				s = "";
				break;
			}
		}
    	return s;
    }

	private String longestCommonPrefix(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int i =0;
		int j=0;
		StringBuilder sb = new StringBuilder("");
		while(i<arr1.length&&j<arr2.length){
			if(arr1[i]==arr2[j]) sb.append(arr1[i]);
			else break;
			i++;
			j++;
		}
		return sb.toString();
	}

}
