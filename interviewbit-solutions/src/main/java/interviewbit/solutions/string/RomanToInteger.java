package interviewbit.solutions.string;

import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {


	
	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		//String A = "VXVVV";
		String A = "MMXIV ";
		System.out.println(r.romanToInt(A));
	}
	
    public int romanToInt(String A) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
    	if(A==null||A.length()==0) return 0;
    	char[] arr = A.trim().toCharArray();
    	int num =0;
    	char prev = ' ';
    	char curr = ' ';
    	for (int i = arr.length-1; i >= 0; i--) {
    		curr = arr[i];
    		if (curr==' ') {
				return num;
			}
    		if (map.get(curr)==null) {
				continue;
			}
			int value = map.get(curr);
			if (prev==' ') {
				num+=value;	
			} else {
				int prevValue = map.get(prev);
				if (prevValue>value) {
					num-=value;
				} else {
					num+=value;	
				}
				
			}
			prev = curr;
		}
    	return num;
    }

}
