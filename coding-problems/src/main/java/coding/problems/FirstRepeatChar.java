package coding.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "absolutebalderDash";
		System.out.println(firstRepeatingLetter(s));
	}

	public static String firstRepeatingLetter(String s) {
		// Write your code here
		char[] arr = s.toCharArray();
		Map<Character, Integer> repeats = new HashMap<>();
		char firstRepeatChar = '9';
		int index=arr.length;
		for (int i = 0; i < arr.length; i++) {
			char temp = arr[i];
			if (repeats.containsKey(temp)) {
				if (repeats.get(temp)<=index) {
					firstRepeatChar=temp;
					index=repeats.get(temp);
				}
			} else {
				repeats.put(temp,i);	
			}
				
		}
		return firstRepeatChar+"";
	}

}
